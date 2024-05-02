package home_work_6.runner;

import home_work_6.UtilFile;
import home_work_6.UtilString;

import java.io.*;
import java.util.Set;


public class Main2_1 {
    public static void main(String[] args) {
        File file = new File("homework/src/home_work_6/resourses/War and peace.txt");

        String fromFile = UtilFile.getStringFromFile(file);
        System.out.println(fromFile);                                //удалить печать

        int allCountWords = UtilString.getAllCountWords(fromFile);
        System.out.println("Количество всех слов в составляет: " + allCountWords);

        Set<String> uniqWordsFromString = UtilString.getUniqWords(fromFile);
        // System.out.println(uniqWordsFromString);                  //удалить печать
        System.out.println("Количество уникальных слов составляет: " + uniqWordsFromString.size());


    }
}
