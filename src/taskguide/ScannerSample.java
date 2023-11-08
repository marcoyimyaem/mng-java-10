package taskguide;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String getName = name.nextLine();
        System.out.println("Enter your Age: ");
        int getAge = age.nextInt();
        
        System.out.println("Hello "+getName+", you are now "+getAge+" years old");
        Scanner massInput = new Scanner(System.in);
        System.out.println("input mass:");
        float mass = massInput.nextFloat();
        Scanner accelarationInput = new Scanner(System.in);
        System.out.println("input acceleration:");
        float acceleration = accelarationInput.nextFloat();
        System.out.println("Force is :"+ mass*acceleration);
        massInput.close();
        name.close();
        age.close();
        MarcoaccelarationInput.close();
        
        

    }
}
