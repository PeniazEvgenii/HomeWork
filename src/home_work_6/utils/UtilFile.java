package home_work_6.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class UtilFile {

    /**
     * Метод получения строки при чтении файла
     * @param file объект типа File
     * @return полученная строка
     * исключения обрабатываются внутри метода
     */
    public static String getStringFromFile(File file) {
        String result ="";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String currentLine;
            StringBuilder stringBuilder = new StringBuilder();
            while( (currentLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(currentLine).append("\n");
            }
            result = stringBuilder.toString();

        } catch (FileNotFoundException e) {
            System.err.println("Указанный файл отсутствует");;
        } catch (IOException e) {
            System.err.println("Произошла ошибка работы с файлом");
        }
        return result;
    }


    /**
     * Метод записи строки в файл
     * @param pathResult куда записываем информацию
     * @param result строка с результатом поиска
     */
    public static void writeResulInFile(Path pathResult, String result) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(pathResult, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            bufferedWriter.write(result);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом");;
        }
    }
}
