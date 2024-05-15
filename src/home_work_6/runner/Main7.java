package home_work_6.runner;

import home_work_6.api.IFilePrintable;
import home_work_6.printer.FilePrinter;
import home_work_6.searchers.FileSearch;
import home_work_6.utils.UtilFile;
import home_work_6.searchers.EasySearch;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main7 {

    public static final String DIRECTORY_RESULT = "homework/src/home_work_6/report";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Path pathResult = Path.of(DIRECTORY_RESULT,"result.txt");
        IFilePrintable filePrinter = new FilePrinter(pathResult);
        FileSearch fileSearch = new FileSearch(new EasySearch());

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

        do{
            System.out.println(getNameFiles(file));
            System.out.println("Выберите книгу из перечня и введите ее имя. Для выхода из программы введите - exit");
            String book = console.nextLine();

            if (book.equalsIgnoreCase("exit")) {

                filePrinter.print("\tДата и время поиска : " +
                            LocalDateTime.now().format(DateTimeFormatter.ofPattern("d MMMM yyyy года, HH:mm:ss"))
                              + "\n----------------------------------------------------");

                System.out.println("Результат вашего поиска находится в файле " + pathResult);
                return;
            }

            String pathBook = folder + "/" + book;
            File fileBook = new File(pathBook);

            if(!fileBook.exists()){
                System.out.println("Введено неверное имя книги");
            } else {
                String word;
                do {
                    System.out.println("Введите слово для поиска. Для возврата в репозиторий введите - back");
                    word = console.nextLine();
                    if (word.equalsIgnoreCase("back")) {
                        break;
                    }

                    long search = fileSearch.search(pathBook, word);
                    String result = getStringWithResult(fileBook, word, search);
                    System.out.println(result);

                    filePrinter.print(result);

                } while(true);
            }
        } while(true);

    }

    /**
     * Метод получения результата поиска слова
     * @param fileBook место поиска
     * @param word искомое слово
     * @return строка с результатом в формате «Имя файла – слово – количество»
     */
    private static String getStringWithResult(File fileBook, String word, long count) {
        return fileBook.getName() + " – " + word + " - " + count;
    }

    /**
     * Метод получения перечня файлов в папке
     * @param file объект File с путем к папке
     * @return строка с результатом
     */
    public static String getNameFiles(File file) {
        String[] arr = file.list();
        if(arr == null) {
            return "Указаный репозиторий не существует";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : arr) {
            stringBuilder.append(s).append("\n");
        }
        return  stringBuilder.toString();
    }
}
