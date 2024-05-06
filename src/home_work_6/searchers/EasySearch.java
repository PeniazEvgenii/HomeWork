package home_work_6.searchers;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    private static final String SIGN_DELIMITER = " \n.,:;!?\"()[]{}";

    /**
     * Метод нахождения количество слов в тексте
     * @param text текст, в котором осуществляется поиск
     * @param word искомое слово
     * @return количество найденных слов
     */
    @Override
    public long search(String text, String word) {
        long result = 0;
        int sizeText = text.length();
        int sizeWord = word.length();

        int current = 0;
        do {
            current = text.indexOf(word, current);
            if(current == -1) {
                result = 0;
                break;
            }

            int nextIndex = current + sizeWord;
                                                                                                    // варианты расположения в тексте слова
            if((isCheckPrevious(text, current) && isCheckNext(text, nextIndex)) ||                  //  середина текста / конец текста / начало текста / слово целиком весь текст
                    (isCheckPrevious(text, current) && nextIndex == sizeText) ||
                    (current == 0 && isCheckNext(text, nextIndex)) || (current == 0 && nextIndex == sizeText)
            ) {
                result++;
            }


            current = current + sizeWord;
        } while(text.indexOf(word, current) != - 1);

        return result;
    }


    private static boolean isCheckNext(String text, int nextIndex) {
        return nextIndex != text.length() && SIGN_DELIMITER.indexOf(text.charAt(nextIndex)) != -1;
    }


    private static boolean isCheckPrevious(String text, int current) {
        return current != 0 && SIGN_DELIMITER.indexOf(text.charAt(current - 1)) != -1;
    }


}
