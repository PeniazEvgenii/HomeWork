package home_work_6.runner;

import home_work_6.searchers.FileSearch;
import home_work_6.searchers.EasySearch;

public class Main5_1 {
    public static void main(String[] args) {
        String path = "homework/src/home_work_6/resourses/War and peace.txt";
        FileSearch fileSearch = new FileSearch(new EasySearch());

        String str1 = "война";
        String str2 = "и";
        String str3 = "мир";
        long search1 = fileSearch.search(path, str1);
        long search2 = fileSearch.search(path, str2);
        long search3 = fileSearch.search(path, str3);

        printCountWord(str1, search1);
        printCountWord(str2, search2);
        printCountWord(str3, search3);
    }

    public static void printCountWord(String str, long count) {
        System.out.println("Слово " + str + " встречается : " + count);
    }

}
