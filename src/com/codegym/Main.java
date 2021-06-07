package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number1;
	int number2;
        Scanner input = new Scanner(System.in);
        System.out.println("number 1: ");
        number1 = input.nextInt();
        System.out.println("number 2: ");
        number2 = input.nextInt();

        number1 =  Math.abs(number1);
        number2 = Math.abs(number2);
        if(number1==0 || number2==0){
            System.out.println("khong co ucln");
        }
        while (number1 != number2){
            if(number1>number2){
                number1 = number1 - number2;
            }else {
                number2 = number2 - number1;
            }
        }
System.out.println("greatest common factor: " +number1);

    }
}
