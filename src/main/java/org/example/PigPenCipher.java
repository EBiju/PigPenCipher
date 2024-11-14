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

    public static String encryptPigPen(String text) {
        HashMap<Character, String> pigpenCodeMap = new HashMap<>();
        pigpenCodeMap.put('A', "       @\n" +
                "             @\n" +
                "@  @  @  ");

        pigpenCodeMap.put('B', "@     @\n" +
                "@     @\n" +
                "@  @  @  ");

        pigpenCodeMap.put('C', "@\n      " +
                "@\n      " +
                "@  @  @  ");

        pigpenCodeMap.put('D', "@  @  @\n " +
                "             @\n " +
                "@  @  @   ");

        pigpenCodeMap.put('E', "@  @  @\n" +
                "@     @\n" +
                "@  @  @  ");

        pigpenCodeMap.put('F', "@  @  @\n" +
                "@\n      " +
                "@  @  @  ");

        pigpenCodeMap.put('G', "@  @  @\n " +
                "             @\n " +
                "             @\n ");

        pigpenCodeMap.put('H', "@  @  @\n " +
                "@     @\n " +
                "@     @   ");

        pigpenCodeMap.put('I', "@  @  @\n " +
                "@ +\n     " +
                "               @         ");

        pigpenCodeMap.put('J', "      @\n " +
                "       o  @\n " +
                "@  @  @   ");

        pigpenCodeMap.put('K', "@     @\n " +
                "@  o  @\n " +
                "@  @  @   ");

        pigpenCodeMap.put('L', "@\n       " +
                "@  o\n    " +
                "@  @  @   ");

        pigpenCodeMap.put('M', "@  @  @\n " +
                "      o  @\n " +
                "@  @  @   ");

        pigpenCodeMap.put('N', "@  @  @\n " +
                "@  O  @\n " +
                "@  @  @   ");

        pigpenCodeMap.put('O', "@  @  @\n " +
                "@  o   \n " +
                "@  @  @   ");

        pigpenCodeMap.put('P', "@  @  @\n " +
                "      O   @\n " +
                "             @   ");

        pigpenCodeMap.put('Q', "@  @  @\n " +
                "@  O  @\n " +
                "@     @   ");

        pigpenCodeMap.put('R', "@  @  @\n " +
                "@  O\n    " +
                "@         ");

        pigpenCodeMap.put('S', "@\n        " +
                "@   @\n      " +
                "@     @       ");

        pigpenCodeMap.put('T', "@\n       " +
                "@\n     " +
                "@ \n   " +
                "@\n     " +
                "@         ");

        pigpenCodeMap.put('U', "@ \n" +
                "@   \n" +
                "@     \n" +
                "@   \n" +
                "@   ");

        pigpenCodeMap.put('V', "@      @ \n" +
                "@   @  \n" +
                "@    ");

        pigpenCodeMap.put('W', "@   \n" +
                "@ o @ \n" +
                "@     @");

        pigpenCodeMap.put('X', "@   \n" +
                "@ \n" +
                "O  @\n" +
                "@ \n" +
                "@     ");

        pigpenCodeMap.put('Y', "@  \n" +
                "@    \n" +
                "@  o  \n" +
                "@    \n" +
                "@  ");

        pigpenCodeMap.put('Z', "@      @  \n" +
                "  @ o @   \n" +
                "    @       ");


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

        public static String decryptPigPen(text String){
            HashMap<Character, String> pigpenCodeMap = new HashMap<>();
            pigpenCodeMap.put('A', "       @\n" +
                    "             @\n" +
                    "@  @  @  ");

            pigpenCodeMap.put('B', "@     @\n" +
                    "@     @\n" +
                    "@  @  @  ");

            pigpenCodeMap.put('C', "@\n      " +
                    "@\n      " +
                    "@  @  @  ");

            pigpenCodeMap.put('D', "@  @  @\n " +
                    "             @\n " +
                    "@  @  @   ");

            pigpenCodeMap.put('E', "@  @  @\n" +
                    "@     @\n" +
                    "@  @  @  ");

            pigpenCodeMap.put('F', "@  @  @\n" +
                    "@\n      " +
                    "@  @  @  ");

            pigpenCodeMap.put('G', "@  @  @\n " +
                    "             @\n " +
                    "             @\n ");

            pigpenCodeMap.put('H', "@  @  @\n " +
                    "@     @\n " +
                    "@     @   ");

            pigpenCodeMap.put('I', "@  @  @\n " +
                    "@ +\n     " +
                    "               @         ");

            pigpenCodeMap.put('J', "      @\n " +
                    "       o  @\n " +
                    "@  @  @   ");

            pigpenCodeMap.put('K', "@     @\n " +
                    "@  o  @\n " +
                    "@  @  @   ");

            pigpenCodeMap.put('L', "@\n       " +
                    "@  o\n    " +
                    "@  @  @   ");

            pigpenCodeMap.put('M', "@  @  @\n " +
                    "      o  @\n " +
                    "@  @  @   ");

            pigpenCodeMap.put('N', "@  @  @\n " +
                    "@  O  @\n " +
                    "@  @  @   ");

            pigpenCodeMap.put('O', "@  @  @\n " +
                    "@  o   \n " +
                    "@  @  @   ");

            pigpenCodeMap.put('P', "@  @  @\n " +
                    "      O   @\n " +
                    "             @   ");

            pigpenCodeMap.put('Q', "@  @  @\n " +
                    "@  O  @\n " +
                    "@     @   ");

            pigpenCodeMap.put('R', "@  @  @\n " +
                    "@  O\n    " +
                    "@         ");

            pigpenCodeMap.put('S', "@\n        " +
                    "@   @\n      " +
                    "@     @       ");

            pigpenCodeMap.put('T', "@\n       " +
                    "@\n     " +
                    "@ \n   " +
                    "@\n     " +
                    "@         ");

            pigpenCodeMap.put('U', "@ \n" +
                    "@   \n" +
                    "@     \n" +
                    "@   \n" +
                    "@   ");

            pigpenCodeMap.put('V', "@      @ \n" +
                    "@   @  \n" +
                    "@    ");

            pigpenCodeMap.put('W', "@   \n" +
                    "@ o @ \n" +
                    "@     @");

            pigpenCodeMap.put('X', "@   \n" +
                    "@ \n" +
                    "O  @\n" +
                    "@ \n" +
                    "@     ");

            pigpenCodeMap.put('Y', "@  \n" +
                    "@    \n" +
                    "@  o  \n" +
                    "@    \n" +
                    "@  ");

            pigpenCodeMap.put('Z', "@      @  \n" +
                    "  @ o @   \n" +
                    "    @       ");


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
}