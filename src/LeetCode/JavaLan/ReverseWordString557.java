/*
package LeetCode;

public class ReverseWordString557 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length - 1; i++) {
            sb.append(converter(strings[i].toCharArray()));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public char[] converter(char[] ch) {
        char a;
        for (int i = 0; i < ch.length / 2; i++) {
            a = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = a;
        }
        return ch;
    }
}


*/
