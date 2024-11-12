/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result= new StringBuilder();
        int len = word1.length() < word2.length() ? word1.length() : word2.length();
        for(int i = 0; i < len; i ++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        if(word1.length() < word2.length()){
            result.append(word2.substring(word1.length(),word2.length()));
        }
        else if(word1.length() > word2.length()){
            result.append(word1.substring(word2.length(),word1.length()));
        }
        return result.toString();
    }
}
