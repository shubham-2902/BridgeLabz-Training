package stringbufferandbuilderpluslinearsearchandbinarysearch.linearsearch.searchword;
public class SearchWordInSentences {

    // returns first sentence that contains the word, else "Not Found"
    public static String findFirstSentence(String[] sentences, String word) {

        for (int i = 0; i < sentences.length; i++) {

            // checking word in sentence (case-insensitive)
            if (sentences[i].toLowerCase().contains(word.toLowerCase())) {
                return sentences[i];
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
                "Java is a programming language",
                "Linear search is easy to understand",
                "InputStreamReader converts bytes to characters",
                "Data structures are important"
        };

        String word = "are";

        String result = findFirstSentence(sentences, word);

        System.out.println("Result: " + result);
    }
}
