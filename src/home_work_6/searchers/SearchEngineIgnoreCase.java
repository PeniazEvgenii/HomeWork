package home_work_6.searchers;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.UNICODE_CASE;

public class SearchEngineIgnoreCase implements ISearchEngine{
    private final ISearchEngine searchEngine;

    public SearchEngineIgnoreCase(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Метод нахождения количество слов в тексте. Если в конструктор передан объект {@link RegExSearch}, метод не
     * преобразует строку к нижнему регистру, а осуществляет сам поиск регулярным регулярным выражением, игнорирующим регистр
     * @param text текст, в котором осуществляется поиск
     * @param word искомое слово
     * @return количество найденных слов
     */
    @Override
    public long search(String text, String word) {
        if(searchEngine instanceof RegExSearch) {
            Pattern pattern = Pattern.compile("(?<![а-яА-ЯA-Za-z0-9-])-?" + word + "(?![0-9A-Za-zа-яА-Я-])",CASE_INSENSITIVE | UNICODE_CASE);
            long count = 0;
            Matcher matcher = pattern.matcher(text);
            while(matcher.find()){
                count++;
            }
            return count;
        }

        text = text.toLowerCase();
        word = word.toLowerCase();

        return searchEngine.search(text, word);
    }
}
