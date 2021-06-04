/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int first = scan.nextInt();
        System.out.print("Enter a second number: ");
        int second = scan.nextInt();
        System.out.print("Enter a third number: ");
        int third = scan.nextInt();

        if(first == second || first == third || second == third){
            return;
        }

        if(first > second){
            if(first > third){
                System.out.printf("Largest number is first: %d",first);
            }
            else{
                System.out.printf("Largest number is third: %d",third);
            }
        }
        else if(second > third){
            System.out.printf("largest number is second: %d",second);
        }
        else{
            System.out.printf("Largest number is third: %d",third);
        }

    }
}