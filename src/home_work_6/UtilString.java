package home_work_6;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UtilString {
    public static final String TEMPLATE_WORD = "-?[а-яА-ЯёЁ0-9A-Za-z]+[-'^]?[а-яА-ЯёЁ0-9A-Za-z-]*";   // есть одно слово n^tres

    /**
     * Метод получения множества уникальных слов в строке
     * @param str строка
     * @return множество из уникальных слов
     */
    public static Set<String> getUniqWords(String str) {
        Set<String> words = new HashSet<>();
        Pattern pattern = Pattern.compile(TEMPLATE_WORD);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    /**
     * Метод получения Map<K,V> , где K - слово, V - количество появления слова в строке
     * @param str строка
     * @return Map<String, Integer>
     */
    public static Map<String, Integer> getAllWordsWithCount(String str) {
        Map<String, Integer> map = new HashMap<>();

        Pattern pattern = Pattern.compile(TEMPLATE_WORD);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            map.merge(matcher.group(), 1, Integer::sum);
        }
        return map;
    }

    /**
     * Метод получения List из наиболее часто встречающихся слов
     * @param map Map<K,V> , где K - слово, V - количество появления слова в строке
     * @param count размер списка
     * @return отсортированный список размером count
     */
    public static List<Map.Entry<String, Integer>> getTopWords(Map<String, Integer> map, int count) {
        List<Map.Entry<String, Integer>> collect = map.entrySet().stream()
              //  .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .sorted((e1,e2) -> e2.getValue() - e1.getValue() == 0 ? e1.getKey().compareTo(e2.getKey()) : e2.getValue() - e1.getValue())
                .limit(count)
                .collect(Collectors.toList());
        return collect;
    }

    /**
     * Метод получения суммарного количества слов в строке
     * @param str строка
     * @return количество слов в строке
     */
    public static int getAllCountWords(String str) {
        int count = 0;
        Pattern pattern = Pattern.compile(TEMPLATE_WORD);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            count++;
        }
        return count;
    }
}
