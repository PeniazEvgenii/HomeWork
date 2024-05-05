package home_work_6.searchers;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.UtilFile;

import java.io.File;
import java.util.List;

public class SearchEngineCaseNormalizer implements ISearchEngine {     //c ой подумать надо про творит падеж
    private final List<String> nounEnd = List.of("а","я","у","ю","е","о","и","ы","ой","ей","ам","ям","ем","ём","ом","ей","ов","ев","ами","ями","ь");
    private final List<String> nounAdjective = List.of("ий","ый","ая","ое","ого","ую","ым","им","ых","их","ые","ие","ым","им","ому","ему","ыми","ими");
    private String caseNoun;
    ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(String caseNoun, ISearchEngine searchEngine) {
        this.caseNoun = caseNoun;
        this.searchEngine = searchEngine;
    }

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
       long count = 0;
       if(!checkNoun(word)) {
           return 0;
       }

        String root = getRoot(word);

        for (String end : nounEnd) {
            String noun = root + end;
           count += searchEngine.search(text, noun);
        }
        return count;
    }


    private String getRoot(String word) {
        int sumLetter = 0;
        for (String end : nounEnd) {
            if(word.endsWith(end)) {
                sumLetter = end.length();
            }
        }
        return word.substring(0,  word.length() - sumLetter);
    }


    private boolean checkNoun(String word) {
        if(word.length() <= 1) {
            return false;
        }
        for (String adj : nounAdjective) {
            if(word.endsWith(adj)) {
                return false;
            }
        }
        return true;
    }
}

