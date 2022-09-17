package net.wonlee.leetcode;

public class ReverseString {

    public static void main(String[] args){

        char[] s = {'h','e','l','l','o'};

        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString(s));
    }

    public char[] reverseString(char[] s){

        char[] o = new char[s.length];
        for (int i=0;i<s.length;i++){
            o[i] = s[s.length-1-i];
        }

        return o;
    }
}
