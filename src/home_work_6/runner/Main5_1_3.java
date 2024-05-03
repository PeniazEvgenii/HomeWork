package home_work_6.runner;

import home_work_6.utils.UtilFile;
import home_work_6.api.ISearchEngine;
import home_work_6.searchers.EasySearch;
import home_work_6.searchers.RegExSearch;
import home_work_6.searchers.SearchEngineIgnoreCase;

import java.io.File;

public class Main5_1_3 {
    public static void main(String[] args) {
        File file = new File("homework/src/home_work_6/resourses/War and peace.txt");
        String fromFile = UtilFile.getStringFromFile(file);
        ISearchEngine searchEngine = new SearchEngineIgnoreCase(new RegExSearch());
        ISearchEngine searchEngine2 = new SearchEngineIgnoreCase(new EasySearch());

        String str1 = "война";
        String str2 = "и";
        String str3 = "мир";
        String str4 = "ВОЙНА";
        String str5 = "И";
        String str6 = "МИР";

        long search1 = searchEngine.search(fromFile, str1);
        long search2 = searchEngine.search(fromFile, str2);
        long search3 = searchEngine.search(fromFile, str3);
        long search4 = searchEngine.search(fromFile, str4);
        long search5 = searchEngine.search(fromFile, str5);
        long search6 = searchEngine.search(fromFile, str6);

        long search11 = searchEngine2.search(fromFile, str4);
        long search12 = searchEngine2.search(fromFile, str5);
        long search13 = searchEngine2.search(fromFile, str6);
        long search14 = searchEngine2.search(fromFile, str4);
        long search15 = searchEngine2.search(fromFile, str5);
        long search16 = searchEngine2.search(fromFile, str6);

        System.out.println("С регулярным выражением");
        Main5_1.printCountWord(str1, search1);
        Main5_1.printCountWord(str2, search2);
        Main5_1.printCountWord(str3, search3);
        Main5_1.printCountWord(str4, search4);
        Main5_1.printCountWord(str5, search5);
        Main5_1.printCountWord(str6, search6);

        System.out.println("\nС простым поиском");
        Main5_1.printCountWord(str4, search11);
        Main5_1.printCountWord(str5, search12);
        Main5_1.printCountWord(str6, search13);
        Main5_1.printCountWord(str4, search14);
        Main5_1.printCountWord(str5, search15);
        Main5_1.printCountWord(str6, search16);
    }
}
