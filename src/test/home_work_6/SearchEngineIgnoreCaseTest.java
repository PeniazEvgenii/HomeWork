package test.home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.searchers.EasySearch;
import home_work_6.searchers.RegExSearch;
import home_work_6.searchers.SearchEngineIgnoreCase;
import home_work_6.searchers.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineIgnoreCaseTest {
    private final ISearchEngine searchEngine = new SearchEngineIgnoreCase(new EasySearch());

    @Test
    public void searchTest() {
        Assertions.assertEquals(1, searchEngine.search("привет, как дела!", "привет"));
        Assertions.assertEquals(0, searchEngine.search("привет,какдела!", "дела"));
        Assertions.assertEquals(1, searchEngine.search("привет,какдела!", "какдела"));
        Assertions.assertEquals(1, searchEngine.search("привет;какдела!", "какдела"));
        Assertions.assertEquals(1, searchEngine.search("как дела!.Что делаешь?", "Что"));
        Assertions.assertEquals(1, searchEngine.search("как дела!.Что делаешь?", "дела"));
        Assertions.assertEquals(0, searchEngine.search("Привет-привет", "привет"));
        Assertions.assertEquals(1, searchEngine.search("Привет-привет", "Привет-привет"));
        Assertions.assertEquals(1, searchEngine.search("Привет -привет", "-привет"));
        Assertions.assertEquals(1, searchEngine.search("4-х", "4-х"));
        Assertions.assertEquals(1, searchEngine.search("один и 1", "1"));
        Assertions.assertEquals(1, searchEngine.search("a", "A"));
        Assertions.assertEquals(1, searchEngine.search("1", "1"));
        Assertions.assertEquals(0, searchEngine.search("Вв", "В"));
        Assertions.assertEquals(0, searchEngine.search("привет6 7привет привет-привет", "привет-"));
        Assertions.assertEquals(0, searchEngine.search("привет- 7-привет -привет-привет", "-привет"));
        Assertions.assertEquals(3, searchEngine.search("привет Привет привеТ", "привет"));
        Assertions.assertEquals(1, searchEngine.search(" привет ", "приВет"));
        Assertions.assertEquals(0, searchEngine.search(" ПРИВЕТ6 ", "приВет"));
        Assertions.assertEquals(3, searchEngine.search("А.А.А", "а"));

    }
}
