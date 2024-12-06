package org.example;

import java.util.Scanner;

public class Ex_14_22
{
    private static final String[] morseCode =  {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", // A-Z
            ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", // 1-9, 0
    };

    private static final String[] letters ={
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", // A-Z
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", // 1-9, 0
    };

    public static String encodeToMorse(String input)
    {
        StringBuilder morseMessage = new StringBuilder();

        for(char c: input.toUpperCase().toCharArray())
        {
            if(c == ' ')
            {
                morseMessage.append("   ");
            } else
            {
                for(int i=0; i < letters.length; i++)
                {
                    if(letters[i].charAt(0) == c)
                    {
                        morseMessage.append(morseCode[i]).append(" ");
                    }
                }
            }
        }
        return morseMessage.toString().trim();
    }

    public static String decodeToEnglish(String morseInput)
    {
        StringBuilder englishMessage = new StringBuilder();
        String[] morseWords = morseInput.split("   ");

        for(String word: morseWords)
        {
            String[] morseLetters = word.split(" ");
            for(String morseLetter: morseLetters)
            {
                for(int i =0; i< morseCode.length; i++)
                {
                    if(morseCode[i].equals(morseLetter))
                    {
                        englishMessage.append(letters[i]);
                        break;
                    }
                }
            }
            englishMessage.append(" ");
        }
        return englishMessage.toString().trim().toLowerCase();
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Write phrase in english language to encode into Morse: ");
        String phraseToEncode = input.nextLine();
        String encodedMessage = encodeToMorse(phraseToEncode);
        System.out.println("Encoded morse code: " + encodedMessage);

        System.out.print("Enter Morse Code to decode (separate letters with a space and words with three spaces): ");
        String morseToDecode = input.nextLine();
        String decodedMessage = decodeToEnglish(morseToDecode);
        System.out.println("Decoded English Message: " + decodedMessage);
    }
}
