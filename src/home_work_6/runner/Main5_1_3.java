package home_work_6.runner;

import home_work_6.searchers.FileSearch;
import home_work_6.searchers.EasySearch;
import home_work_6.searchers.RegExSearch;
import home_work_6.searchers.SearchEngineIgnoreCase;

public class Main5_1_3 {
    public static void main(String[] args) {
        String path = "homework/src/home_work_6/resourses/War and peace.txt";
        FileSearch searchIgnoreCaseRegEx = new FileSearch(new SearchEngineIgnoreCase(new RegExSearch()));
        FileSearch searchIgnoreCaseEasy = new FileSearch(new SearchEngineIgnoreCase(new EasySearch()));

        String str1 = "война";
        String str2 = "и";
        String str3 = "мир";

        String str4 = "ВОЙНА";
        String str5 = "И";
        String str6 = "МИР";

        long search1 = searchIgnoreCaseRegEx.search(path, str1);
        long search2 = searchIgnoreCaseRegEx.search(path, str2);
        long search3 = searchIgnoreCaseRegEx.search(path, str3);
        long search4 = searchIgnoreCaseRegEx.search(path, str4);
        long search5 = searchIgnoreCaseRegEx.search(path, str5);
        long search6 = searchIgnoreCaseRegEx.search(path, str6);

        long search11 = searchIgnoreCaseEasy.search(path, str4);
        long search12 = searchIgnoreCaseEasy.search(path, str5);
        long search13 = searchIgnoreCaseEasy.search(path, str6);
        long search14 = searchIgnoreCaseEasy.search(path, str4);
        long search15 = searchIgnoreCaseEasy.search(path, str5);
        long search16 = searchIgnoreCaseEasy.search(path, str6);

        System.out.println("С регулярным выражением");
        Main5_1.printCountWord(str1, search1);
        Main5_1.printCountWord(str2, search2);
        Main5_1.printCountWord(str3, search3);
        Main5_1.printCountWord(str4, search4);
        Main5_1.printCountWord(str5, search5);
        Main5_1.printCountWord(str6, search6);

        System.out.println("\nС простым поиском");
        Main5_1.printCountWord(str1, search11);
        Main5_1.printCountWord(str2, search12);
        Main5_1.printCountWord(str3, search13);
        Main5_1.printCountWord(str4, search14);
        Main5_1.printCountWord(str5, search15);
        Main5_1.printCountWord(str6, search16);
    }
}
