package com.immortals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsecutiveSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the sequence length: ");
        int sequenceLength = scanner.nextInt();

        List<String> sequences = generateConsecutiveSequences(inputString, sequenceLength);

        System.out.println("Consecutive sequences of length " + sequenceLength + " from '" + inputString + "':");
        for (String sequence : sequences) {
            System.out.println(sequence);
        }
    }

    public static List<String> generateConsecutiveSequences(String inputString, int sequenceLength) {
        List<String> sequences = new ArrayList<>();
        int stringLength = inputString.length();

        if (sequenceLength > stringLength) {
            System.out.println("Invalid input: Sequence length is greater than the string length.");
            return sequences;
        }

        for (int i = 0; i <= stringLength - sequenceLength; i++) {
            char[] sequenceChars = new char[sequenceLength];
            for (int j = 0; j < sequenceLength; j++) {
                sequenceChars[j] = inputString.charAt(i + j);
            }
            sequences.add(new String(sequenceChars));
        }

        return sequences;
    }
    public static void generateConsecutiveSequence(String inputString, int sequenceLength) {
        int stringLength = inputString.length();

        if (sequenceLength > stringLength) {
            System.out.println("Invalid input: Sequence length is greater than the string length.");
            return;
        }

        for (int i = 0; i <= stringLength - sequenceLength; i++) {
            String sequence = "";
            for (int j = i; j < i + sequenceLength; j++) {
                sequence += inputString.charAt(j);
            }
            System.out.println(sequence);
        }
    }
}
