package home_work_6.runner;

import home_work_6.api.IFilePrintable;
import home_work_6.printer.FilePrinter;
import home_work_6.searchers.EasySearch;
import home_work_6.searchers.FileSearch;
import home_work_6.utils.UtilFile;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main8 {

    public static final String DIRECTORY_RESULT = "homework/src/home_work_6/report";

     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ExecutorService executorService = Executors.newCachedThreadPool();
        FileSearch fileSearch = new FileSearch(new EasySearch());
        Path pathResult = Path.of(DIRECTORY_RESULT,"resultThread.txt");
        IFilePrintable filePrinter = new FilePrinter(pathResult);

        String folder;
        File file;
        do{
            System.out.println("Введите адрес репозитория с книгами. Для выхода из программы введите - exit");
            folder = console.nextLine();                                                  // homework/src/home_work_6/resourses/repos

            if(folder.equalsIgnoreCase("exit")) {
                return;
            }

            file = new File(folder);
            if(!UtilFile.checkFolder(file)){
                System.out.println("Введен неверный адрес репозитория");
            }
        } while(!UtilFile.checkFolder(file));

        do {
            System.out.println("Введите слово для поиска. Для завершения введите - exit");
            String word = console.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }

            File[] files = file.listFiles();
            if (files != null) {
                for (File bookFile : files) {
                    executorService.submit(() -> serchAndWriteInFile(bookFile, word, fileSearch, filePrinter));
                }
            }

        } while(true);

        executorService.shutdown();

         try {
             executorService.awaitTermination(1, TimeUnit.MINUTES);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
     }

    /**
     * Метод поиска слова и печати результата в файл
     * @param bookFile путь к тексту
     * @param word искомое слово
     * @param fileSearch объект для поиска слов
     */
    public static void serchAndWriteInFile(File bookFile, String word, FileSearch fileSearch, IFilePrintable filePrinter) {
        long search = fileSearch.search(bookFile.getPath(), word);
        String result = getStringWithResult(bookFile.getName(), word, search);
        filePrinter.print(result);
    }

    /**
     * Метод получения результата поиска слова
     * @param nameBook имя книги
     * @param word искомое слово
     * @return строка с результатом в формате «Имя файла – слово – количество»
     */
    private static String getStringWithResult(String nameBook, String word, long count) {
        return nameBook + " – " + word + " - " + count;
    }

}
