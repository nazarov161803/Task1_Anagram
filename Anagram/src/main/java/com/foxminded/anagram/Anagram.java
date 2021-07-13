package com.foxminded.anagram;

import java.util.Scanner;

import com.foxminded.anagram.logic.AnagramMaker;

public class Anagram {
        
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.println("Write text");
            String text = in.nextLine();

            AnagramMaker anagramMaker = new AnagramMaker();
            System.out.println("Anagram:" + anagramMaker.getAnagram(text));

            in.close();
        }
    }
