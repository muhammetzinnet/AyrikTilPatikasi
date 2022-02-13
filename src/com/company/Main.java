package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int year;
        boolean isError = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir yıl giriniz = ");
        year = scanner.nextInt();

        if (year<=0){
            System.out.println("Lütfen negatif sayı girmeyin "+isError);
        }

        if (year%4==0){
            System.out.println("Girilen yıl ayrık yıldır");
        }else {
            System.out.println("Girilen yıl ayrık yıl değildir");
        }



    }
}
