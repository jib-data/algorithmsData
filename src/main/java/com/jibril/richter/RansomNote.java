package com.jibril.richter;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean ransomNote(String ransomNote, String magazine){
        int[] charCount = new int[26];

        for (char curChar: magazine.toCharArray()){
            charCount[curChar - 'a']++;
        }
        for (char curChar: ransomNote.toCharArray()){
            if(charCount[curChar - 'a'] == 0){
                return false;
            } else {
                charCount[curChar - 'a']--;
            }
        }
        return true;
    }
}
