package wordFrequency;

import java.util.*;

public class WordFrequencyAlalyzer {

    public static Set<String> getUniqueWords(String[] words) {
        return new HashSet<>(Arrays.asList(words));
    }

    public static Map<String, Integer> getWordFrequency(String[] words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }
}
