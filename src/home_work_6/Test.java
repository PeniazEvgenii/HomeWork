package home_work_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
// 7 задание
       //System.out.println(file2.isDirectory());
       //for (String s : file2.list()) {
       //    System.out.println(s);
       //}


        String s = "Привет-привет I V XVI";
        String s2 = "привет, как дела!";
        String s3 = "привет,какдела!";
        String s4 = "привет;какдела";
        String s5 = "как дела!.Что делаешь?";
        String s6 = "Привет -привет?";
        String s7 = "как дела!.Что делаешь?";
        String s8 = "один и 1";
        String s9 = "бабушка бабушке бабушку";
        Pattern pattern = Pattern.compile("-?[а-яА-ЯёЁ0-9A-Za-z]+-?'?\\^?[а-яА-ЯёЁ0-9A-Za-z-]*");

        Path path = Path.of("homework/src/home_work_6/test2");
        int count = 0;
        System.out.println(path.toFile().exists());

        String fromFile = UtilFile.getStringFromFile(path.toFile());
        System.out.println(fromFile);


        Set<String> set = new HashSet<>();
          try {
              String s1 = Files.readString(path);

              Matcher matcher = pattern.matcher(s1);

                  while(matcher.find()) {
                      count++;
                      set.add(matcher.group());
                          System.out.println(matcher.group());
                      }




              } catch (IOException e) {
                  e.printStackTrace();
              }
        System.out.println(set.size());
        System.out.println(count);

        System.out.println(s.indexOf("Привет",0));

       //test2 = test2.replaceAll("\\s+", " ");
        //System.out.println(test2);

    }
}
