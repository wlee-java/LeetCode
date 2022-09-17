package net.wonlee.leetcode;

public class ReverseStringII {


    /*
    s is a string
    k is an integer

    reverse the first k chars for every 2k chars counting from the string

    s = "abcdefg", k = 2

    reverse the first 2 chars for every 4 chars

    bacd feg

     */
    public static void main(String[] args){
        String s = "abcdefg";
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int k = 2;

        // take the first 4 chars
        // abcd
        // reverse the first 2 chars.
        // bacd

        //take the next 4 chars.
        // efg
        // cant do that cause i only have 3.  3 < 2 so reverse the first 2 chars and leave the reaming
        // feg
        int count = 0;
        char[] tempArray = new char[k*2];
        for (int i=0;i<c.length;i++){
            //get first 4 chars
            System.out.println(c[i]);
            count++;
            if (count == (k*2)){
                System.out.println("stop");
                count =0;
            }


        }

    }

    public static char[] reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        char temp;
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;

        }
        return s;
    }
}
