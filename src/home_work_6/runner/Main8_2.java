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

public class Main8_2 {

    public static final String DIRECTORY_RESULT = "homework/src/home_work_6/report";

     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Path pathResult = Path.of(DIRECTORY_RESULT,"resultThread.txt");
        IFilePrintable filePrinter = new FilePrinter(pathResult);
        FileSearch fileSearch = new FileSearch(new EasySearch());

        ExecutorService executorService = Executors.newCachedThreadPool();

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

            String[] list = file.list();
            if (list != null) {
                for (String bookName : list) {
                    String pathBook = folder + "/" + bookName;
                    Future<Long> future = executorService.submit(() -> fileSearch.search(pathBook, word));

                    Long search = 0L;
                    try {
                        search = future.get();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }

                    String result = getStringWithResult(bookName, word, search);

                    filePrinter.print(result);
                }
            }
        } while(true);

        executorService.shutdown();

         try {
             executorService.awaitTermination(1, TimeUnit.MINUTES);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
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
