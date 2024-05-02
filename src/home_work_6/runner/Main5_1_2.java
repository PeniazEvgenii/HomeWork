package home_work_6.runner;

import home_work_6.UtilFile;
import home_work_6.api.ISearchEngine;
import home_work_6.searchers.RegExSearch;
import home_work_6.searchers.SearchEnginePunctuationNormalizer;

import java.io.File;

public class Main5_1_2 {
    public static void main(String[] args) {
        File file = new File("homework/src/home_work_6/resourses/War and peace.txt");
        String fromFile = UtilFile.getStringFromFile(file);
        ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());

        String str1 = "война";
        String str2 = "и";
        String str3 = "мир";
        long search1 = searchEngine.search(fromFile, "война");
        long search2 = searchEngine.search(fromFile, "и");
        long search3 = searchEngine.search(fromFile, "мир");

        Main5_1.printCountWord(str1, search1);
        Main5_1.printCountWord(str2, search2);
        Main5_1.printCountWord(str3, search3);
    }
}
