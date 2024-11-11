import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PigPenCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your plaintext: ");
        String plaintext = scanner.nextLine();

        String encryptedText = encryptPigPen(plaintext);
        System.out.println("Encrypted text: " + encryptedText);

        String decryptedText = decryptPigPen(encryptedText);
        System.out.println("Decrypted text: " + plaintext);

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
        pigpenCodeMap.put('G', "-.");
        pigpenCodeMap.put('H', "");
        pigpenCodeMap.put('I', "|-");
        pigpenCodeMap.put('J', ".---");
        pigpenCodeMap.put('K', "-.-");
        pigpenCodeMap.put('L', ".-..");
        pigpenCodeMap.put('M', "--");
        pigpenCodeMap.put('N', "-.");
        pigpenCodeMap.put('O', "---");
        pigpenCodeMap.put('P', ".--.");
        pigpenCodeMap.put('Q', "--.-");
        pigpenCodeMap.put('R', ".-.");
        pigpenCodeMap.put('S', "...");
        pigpenCodeMap.put('T', "-");
        pigpenCodeMap.put('U', "..-");
        pigpenCodeMap.put('V', "...-");
        pigpenCodeMap.put('W', ".--");
        pigpenCodeMap.put('X', "-..-");
        pigpenCodeMap.put('Y', "-.--");
        pigpenCodeMap.put('Z', "--..");


        StringBuilder morseCodeBuilder = new StringBuilder();
        text = text.toUpperCase();


        public static String decryptPigPen (String ciphertext){
            StringBuilder decryptedText = new StringBuilder();


            for (int i = 0; i < ciphertext.length(); i++) {
                char cipherChar = ciphertext.charAt(i);


                if (Character.isLetter(cipherChar)) {
                    char decryptedChar = (char) (((cipherChar - 'A' - shift + 13) % 26) + 'A');
                    decryptedText.append(decryptedChar);
                } else {
                    decryptedText.append(cipherChar);
                }
            }

            return decryptedText.toString();
        }
    }
}

