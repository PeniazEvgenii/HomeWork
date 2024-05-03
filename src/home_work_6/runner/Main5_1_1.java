package home_work_6.runner;

import home_work_6.utils.UtilFile;
import home_work_6.api.ISearchEngine;
import home_work_6.searchers.RegExSearch;

import java.io.File;

public class Main5_1_1 {
    public static void main(String[] args) {
        File file = new File("homework/src/home_work_6/resourses/War and peace.txt");
        String fromFile = UtilFile.getStringFromFile(file);
        ISearchEngine regExSearch = new RegExSearch();

        String str1 = "война";
        String str2 = "и";
        String str3 = "мир";
        long search1 = regExSearch.search(fromFile, str1);
        long search2 = regExSearch.search(fromFile, str2);
        long search3 = regExSearch.search(fromFile, str3);

        Main5_1.printCountWord(str1, search1);
        Main5_1.printCountWord(str2, search2);
        Main5_1.printCountWord(str3, search3);

    }
}
