package chapter3;

import java.util.Scanner;

public class StringBuilderSample {
    public static void main(String[] args) {
        String string1 = "abc";
        StringBuilder sb1 = new StringBuilder("xyz");
        // string1 = string1.concat("efg");
        System.out.println(string1.concat("efg"));
        System.out.println(sb1.append("123"));
        System.out.println(sb1);
        StringBuilder same = sb1.append(" hello");
        same.append(" world");
        System.out.println(same+ " == "+ sb1);
        same.insert(18, ", hello java");
        System.out.println(sb1);
        sb1.delete(18, 29);
        System.out.println(same);
        same.deleteCharAt(18);
        System.out.println(same);
        same.reverse();
        System.out.println(sb1);
        boolean stringToSb = "dlrow olleh 321zyx".equals(same);
        System.out.println(stringToSb);
        boolean stringToSbString = "dlrow olleh 321zyx".equals(same.toString());
        System.out.println(stringToSbString);

        // Task clue 
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input1.nextLine();
        StringBuilder reverseword = new StringBuilder(word).reverse();
        if(word.equals(reverseword.toString()))
            System.out.println("yehey the word is equal if reversed");
        else
            System.out.println("the word is not equal if reversed");
    }   
}
