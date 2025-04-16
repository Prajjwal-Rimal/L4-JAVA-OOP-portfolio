public class Punctuation {
    public static void main(String[] args) {
        String words = " “Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. ”";
        int countWords = words.split("\\s+").length; // split in white spaces and find the length
        System.out.println("total words: "+ countWords);
    }
}