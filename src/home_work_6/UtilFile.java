package home_work_6;

import java.io.*;

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
}
