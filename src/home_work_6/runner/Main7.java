package home_work_6.runner;

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

    public static final String DIRECTORY_RESULT = "homework/src/home_work_6";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Path pathResult = Path.of(DIRECTORY_RESULT,"result.txt");
        

        String folder;
        File file;
        do{
            System.out.println("Введите адрес репозитория с книгами. Для выхода из программы введите - exit");
            folder = console.nextLine();                                                  // homework/src/home_work_6/resourses/repos

            if(folder.equalsIgnoreCase("exit")) {
                return;
            }

            file = new File(folder);
            if(!checkFolder(file)){
                System.out.println("Введен неверный адрес репозитория");
            }
        } while(!checkFolder(file));

        do{
            System.out.println(getNameFiles(file));
            System.out.println("Выберите книгу из перечня и введите ее имя. Для выхода из программы введите - exit");
            String book = console.nextLine();

            if (book.equalsIgnoreCase("exit")) {

                UtilFile.writeResulInFile(pathResult, "\tДата и время поиска : " +
                        LocalDateTime.now().format(DateTimeFormatter.ofPattern("d MMMM yyyy года, HH:mm:ss"))
                        + "\n--------------------------------------------------");
                System.out.println("Результат вашего поиска находится в файле " + pathResult);
                return;
            }

            File fileBook = new File(folder + "/" + book);
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
                    String result = getStringWithResult(fileBook, word);
                    System.out.println(result);
                    UtilFile.writeResulInFile(pathResult, result);
                } while(true);
            }
            System.out.println(book);
        } while(true);

    }

    /**
     * Метод получения результата поиска слова
     * @param fileBook место поиска
     * @param word искомое слово
     * @return строка с результатом в формате «Имя файла – слово – количество»
     */
    private static String getStringWithResult(File fileBook, String word) {
        EasySearch easySearch = new EasySearch();
        long count = easySearch.search(UtilFile.getStringFromFile(fileBook), word);
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

    /**
     * Метод проверки наличия папки
     * @param file объект File с путем к папке
     * @return true - папка существует, false - не существует
     */
    public static boolean checkFolder(File file) {
        return file.exists() || file.isDirectory();
    }
}
