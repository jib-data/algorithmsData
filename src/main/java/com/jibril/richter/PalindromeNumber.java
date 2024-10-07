package com.jibril.richter;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        for(int left = 0, right = number.length()-1; left < right; left++, right--){
            if(number.charAt(left)!= number.charAt(right)){
                return false;
            }
        }
        return true;
    }
}
