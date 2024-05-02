package home_work_6.searchers;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExSearch implements ISearchEngine {

    /**
     * Метод нахождения количество слов в тексте
     * @param text текст, в котором осуществляется поиск
     * @param word искомое слово
     * @return количество найденных слов
     */
    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile("(?<![а-яА-Я0-9-])-?" + word + "(?![0-9а-яА-Я-])");   // \b не корректно получилось lookahead и lookbehind здесь
        long count = 0;
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            count++;
        }
        return count;
    }
}
