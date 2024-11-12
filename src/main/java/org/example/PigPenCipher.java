import java.util.HashMap;
import java.util.Scanner;

public class PigPenCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter plaintext.No numbers: ");
        String plaintext = scanner.nextLine();

        String encryptedText = encryptPigPen(plaintext);
        System.out.println("Your encrypted text: " + encryptedText);

        String decryptedText = decryptPigPen(encryptedText);
        System.out.println("Your decrypted text: " + plaintext);

        scanner.close();
    }

    public static String encryptPigPen(String text) {
        HashMap<Character, String> pigpenCodeMap = new HashMap<>();
        pigpenCodeMap.put('A', "_|");
        pigpenCodeMap.put('B', "|_|");
        pigpenCodeMap.put('C', "|_");
        pigpenCodeMap.put('D', "=|");
        pigpenCodeMap.put('E', "|=|");
        pigpenCodeMap.put('F', "|=");
        pigpenCodeMap.put('G', "-|");
        pigpenCodeMap.put('H', "|-|");
        pigpenCodeMap.put('I', "|-");
        pigpenCodeMap.put('J', "*_|");
        pigpenCodeMap.put('K', "|*_|");
        pigpenCodeMap.put('L', "|_*");
        pigpenCodeMap.put('M', "*=|");
        pigpenCodeMap.put('N', "|*=|");
        pigpenCodeMap.put('O', "|=*");
        pigpenCodeMap.put('P', "*-|");
        pigpenCodeMap.put('Q', "|*-|");
        pigpenCodeMap.put('R', "|-*");
        pigpenCodeMap.put('S', "V");
        pigpenCodeMap.put('T', ">");
        pigpenCodeMap.put('U', "<");
        pigpenCodeMap.put('V', "A");
        pigpenCodeMap.put('W', "*V");
        pigpenCodeMap.put('X', "*>");
        pigpenCodeMap.put('Y', "<*");
        pigpenCodeMap.put('Z', "*A");


        StringBuilder pigpenCodeBuilder = new StringBuilder();
        text = text.toUpperCase();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                pigpenCodeBuilder.append(" ");
            } else if (pigpenCodeMap.containsKey(c)) {
                pigpenCodeBuilder.append(pigpenCodeMap.get(c)).append(" ");
            }
        }


        public static String decryptPigPen(String text) {
            HashMap<String, Character> pigpenToCharMap = new HashMap<>();
            pigpenCodeMap.put('A', "_|");
            pigpenCodeMap.put('B', "|_|");
            pigpenCodeMap.put('C', "|_");
            pigpenCodeMap.put('D', "=|");
            pigpenCodeMap.put('E', "|=|");
            pigpenCodeMap.put('F', "|=");
            pigpenCodeMap.put('G', "-|");
            pigpenCodeMap.put('H', "|-|");
            pigpenCodeMap.put('I', "|-");
            pigpenCodeMap.put('J', "*_|");
            pigpenCodeMap.put('K', "|*_|");
            pigpenCodeMap.put('L', "|_*");
            pigpenCodeMap.put('M', "*=|");
            pigpenCodeMap.put('N', "|*=|");
            pigpenCodeMap.put('O', "|=*");
            pigpenCodeMap.put('P', "*-|");
            pigpenCodeMap.put('Q', "|*-|");
            pigpenCodeMap.put('R', "|-*");
            pigpenCodeMap.put('S', "V");
            pigpenCodeMap.put('T', ">");
            pigpenCodeMap.put('U', "<");
            pigpenCodeMap.put('V', "A");
            pigpenCodeMap.put('W', "*V");
            pigpenCodeMap.put('X', "*>");
            pigpenCodeMap.put('Y', "<*");
            pigpenCodeMap.put('Z', "*A");

            StringBuilder result = new StringBuilder();
            String[] words = text.split(" ");

            StringBuilder result = new StringBuilder();
            String[] words = text.split(" ");

            for (String word : words) {
                String[] letters = word.split(" ");
                for (String letter : letters)
                    if (pigpenToCharMap.containsKey(letter)) {
                        result.append(pigpenToCharMap.get(letter));
                    }
                result.append(" ");
            }

            return result.toString().trim();
        }
    }