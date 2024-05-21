package tugas;

public class PoltekMain06 {
    public static void main(String[] args) {
        String sentence = "Politeknik Negeri Malang";
        int sentenceLength = sentence.length();
        Poltek06 stack = new Poltek06(sentenceLength);

        // Menyisipkan kalimat ke dalam stack
        for (int i = 0; i < sentenceLength; i++) {
            stack.push(sentence.charAt(i));
        }

        System.out.println("Sentence: " + sentence);
        System.out.print("Reversed sentence: ");
        while (!stack.isEmpty()) {
            char c = stack.pop();
            System.out.print(c);
        }
        System.out.println();
    }
}
