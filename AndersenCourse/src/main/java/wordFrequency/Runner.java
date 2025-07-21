package wordFrequency;

public class Runner {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "cow", "sheep", "mouse", "cat", "pig", "mouse", "goose", "horse", "mouse",
                "dog", "cat", "rooster", "bunny", "hamster", "hen", "cow", "turkey", "rabbit", "sheep", "donkey",
                "turtle", "bunny", "mouse", "cat", "turkey", "goat", "rat", "parrot"};

        System.out.println("Unique words: " + WordFrequencyAlalyzer.getUniqueWords(animals));
        System.out.println("Frequency of occurrence: " + WordFrequencyAlalyzer.getWordFrequency(animals));
    }
}
