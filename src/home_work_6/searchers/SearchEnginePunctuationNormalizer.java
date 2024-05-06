package home_work_6.searchers;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Метод нахождения количество слов в тексте
     * @param text текст, в котором осуществляется поиск
     * @param word искомое слово
     * @return количество найденных слов
     */
    @Override
    public long search(String text, String word) {
        text = text.replaceAll("[\\s.,?!)(\"{};:]+(--)?[\\s.,?!)(\"{};:]*", " ");   // если будет вариант "-- :" и чтобы он не оставил несколько пробелов
        return searchEngine.search(text, word);
    }
}
