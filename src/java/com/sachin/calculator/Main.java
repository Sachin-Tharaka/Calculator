package com.sachin.calculator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println(" number 1 for Addition");
        System.out.println(" number 2 for Subtraction");
        System.out.println(" number 3 for Multiplication");
        System.out.println(" number 4 for Division");
        System.out.printf("Enter the number: ");   //getting operation from the user

        File file = new File("numbers.txt");
        Scanner scannerFile = new Scanner(file);      //get numbers from the file
        int a = scannerFile.nextInt();
        int b= scannerFile.nextInt();

        Calculator cal1 = new Calculator(a,b);

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num==1)
            System.out.println(cal1.Addition());
        else if(num==2)
            System.out.println(cal1.Subtraction());
        else if(num==3)
            System.out.println(cal1.Multiplication());
        else if(num==4)
            System.out.println(cal1.Division());
        else
            System.out.println("Error! Check the operator");


        scan.close();
        scannerFile.close();
    }
}
