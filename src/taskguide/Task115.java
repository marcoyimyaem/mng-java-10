package taskguide;
import java.util.Arrays;
import java.util.Scanner;

public class Task115 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter a word: ");
        StringBuilder sb1 = new StringBuilder(input1.nextLine());
        if(sb1.toString().equals(sb1.reverse().toString()))
            System.out.println("The input string is a palindrome.");
        else
            System.out.println("The input string is not a palindrome.");
    }    
}


// Write a program that takes a string as input and checks if it is a palindrome. A palindrome is a word, number, or other sequence of characters that reads the same forward and backward.
// Your program should perform the following steps:
// Use StringBuilder to create a new string that is a reverse of the input string.
// Use the equals() method to check if the input string and the reversed string are the same.
// If the strings are the same, print "The input string is a palindrome."
// If the strings are not the same, print "The input string is not a palindrome."