package home_work_6.printer;

import home_work_6.api.IFilePrintable;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilePrinter implements IFilePrintable {
    private final Path pathResult;

    public FilePrinter(Path pathResult) {
        this.pathResult = pathResult;
    }

    @Override
    public void print(String str) {
        synchronized(this) {
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(pathResult, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                System.out.println("Ошибка при работе с файлом");
            }
        }
    }
}
