class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String text = sentence.trim();
        String[] words = text.split("\\s+");

        int count = words.length;

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Words: " + count);
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();

        String sentence = "Java is a programming language";
        w.countWords(sentence);
    }
}