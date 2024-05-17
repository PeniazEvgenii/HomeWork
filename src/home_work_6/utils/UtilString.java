package home_work_6.utils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class UtilString {
    public static final String TEMPLATE_WORD = "-?[а-яА-ЯёЁ0-9A-Za-z]+[-'^]?[а-яА-ЯёЁ0-9A-Za-z-]*";   // есть одно слово n^tres

    private UtilString(){
    }

    /**
     * Метод получения всех слов из текста
     * @param str текст
     * @return лист слов
     */
    public static List<String> getAllWords(String str) {
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile(TEMPLATE_WORD);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    /**
     * Метод получения множества уникальных слов в строке
     * @param str строка
     * @return множество из уникальных слов
     */
    public static Set<String> getUniqWords(String str) {
        List<String> allWords = getAllWords(str);
        return new HashSet<>(allWords);
    }


    /**
     * Метод получения Map<K,V> , где K - слово, V - количество появления слова в строке
     * @param str строка
     * @return Map<String, Integer>
     */
    public static Map<String, Integer> getAllWordsWithCount(String str) {
        Map<String, Integer> map = new HashMap<>();
        List<String> allWords = getAllWords(str);
        for (String word : allWords) {
            map.merge(word, 1, Integer::sum);
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
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                //.sorted((e1,e2) -> e2.getValue() - e1.getValue() == 0 ? e1.getKey().compareTo(e2.getKey()) : e2.getValue() - e1.getValue())
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
        return getAllWords(str).size();
    }
}
