package com.madhu.assignments;
import java.util.Scanner;

public class Assignment6 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a single alphabet");
        
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z')
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            {
                System.out.println("The entered character is a vowel");
            }
            else
            {
                System.out.println("The entered character is a consonant");
            }
        }
        else 
        {
            System.out.println("Invalid input. Please enter a single alphabet character.");
        }
    }
}
