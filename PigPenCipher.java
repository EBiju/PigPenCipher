/** Lab 5
* Cryptography Lab
* IST 242
* Eben Biju
* Date Developed: 11/09/2024
* Last Date Changed: 11/13/2024
* Rev:3

*/
package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class PigPenCipher{
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

    public static HashMap buildPigPenCodeMap(){
        HashMap<Character, String> pigpenCodeMap = new HashMap<>();

        pigpenCodeMap.put('A', "┘");
        pigpenCodeMap.put('B', "╩");
        pigpenCodeMap.put('C', "└");
        pigpenCodeMap.put('D', "]");
        pigpenCodeMap.put('E', "╬");
        pigpenCodeMap.put('F', "[");
        pigpenCodeMap.put('G', "┐");
        pigpenCodeMap.put('H', "╦");
        pigpenCodeMap.put('I', "┌");
        pigpenCodeMap.put('J', "·┘");
        pigpenCodeMap.put('K', "┘·└");
        pigpenCodeMap.put('L', "└·");
        pigpenCodeMap.put('M', "·]");
        pigpenCodeMap.put('N',"]·[");
        pigpenCodeMap.put('O', "[·");
        pigpenCodeMap.put('P', "·┐");
        pigpenCodeMap.put('Q', "┐·┌");
        pigpenCodeMap.put('R', "┌·");
        pigpenCodeMap.put('S', "V");
        pigpenCodeMap.put('T', ">");
        pigpenCodeMap.put('U', "<");
        pigpenCodeMap.put('V', "^");
        pigpenCodeMap.put('W', "·V");
        pigpenCodeMap.put('X', "·>");
        pigpenCodeMap.put('Y', "<·");
        pigpenCodeMap.put('Z', "^·");
        return pigpenCodeMap;
    }

    public static String encryptPigPen(String text) {

        HashMap pigpenCodeMap = buildPigPenCodeMap();

        StringBuilder pigpenCodeBuilder = new StringBuilder();
        text = text.toUpperCase();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                pigpenCodeBuilder.append(" ");
            } else if (pigpenCodeMap.containsKey(c)) {
                pigpenCodeBuilder.append(pigpenCodeMap.get(c)).append(" ");
            }
        }

        return pigpenCodeBuilder.toString().trim();


    }
    public static String decryptPigPen(String text){
        HashMap pigpenCodeMap = buildPigPenCodeMap();

        StringBuilder result = new StringBuilder();
        String[] words = text.split(" ");

        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters)
                if (pigpenCodeMap.containsKey(letter)) {
                    result.append(pigpenCodeMap.get(letter));
                }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
