package home_work_6.runner;

import home_work_6.UtilFile;
import home_work_6.api.ISearchEngine;
import home_work_6.searchers.EasySearch;

import java.io.File;

public class Main5_1 {
    public static void main(String[] args) {
        File file = new File("homework/src/home_work_6/resourses/War and peace.txt");
        String fromFile = UtilFile.getStringFromFile(file);
        ISearchEngine easySearch = new EasySearch();

        String str1 = "война";
        String str2 = "и";
        String str3 = "мир";
        long search1 = easySearch.search(fromFile, str1);
        long search2 = easySearch.search(fromFile, str2);
        long search3 = easySearch.search(fromFile, str3);

        printCountWord(str1, search1);
        printCountWord(str2, search2);
        printCountWord(str3, search3);
    }

    public static void printCountWord(String str, long count) {
        System.out.println("Слово " + str + " встречается : " + count);
    }


}
