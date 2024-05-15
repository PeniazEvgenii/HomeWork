package home_work_6.searchers;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.UtilFile;

import java.io.File;

public class FileSearch {
    private final ISearchEngine searchEngine;

    public FileSearch(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public long search (String path, String word) {
        File file = new File(path);
        String text = UtilFile.getStringFromFile(file);
        return searchEngine.search(text, word);
    }
}
