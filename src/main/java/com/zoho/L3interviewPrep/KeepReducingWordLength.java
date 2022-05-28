package com.zoho.L3interviewPrep;

import java.util.ArrayList;
import java.util.List;

/**
 * Given dictionary of words. Given one input word. Remove one character (in place) from the input word and check for dictionary. If found proceed further.
 * (sprint,print,pint,pot,pat,pit,ink,it, prit,I,Trent, rent, ent)
 * Sprint print pint pit it i
 * Trent rent ent
 */
public class KeepReducingWordLength {
    private static List<String> wordsList = new ArrayList<String>();
    public static List<String> keepReducingWordLength(String word, String[] dictionary) {
        recursiveReducer(word, dictionary);
        return wordsList;
    }

    private static void recursiveReducer(String word, String[] dictionary) {
        if (isPresent(word, dictionary)) {
            System.out.println(word);
            wordsList.add(word);
            for(int i = 0;i < word.length();i++)
                if (wordsList.get(wordsList.size() - 1).length() != 1)
                    recursiveReducer(word.substring(0, i).concat(word.substring(i + 1)), dictionary);
        }
    }

    private static boolean isPresent(String word, String[] dictionary) {
        boolean there = false;
        for(String w : dictionary) {
            there = w.equalsIgnoreCase(word);
            if (there) break;
        }
        return there;
    }
}
