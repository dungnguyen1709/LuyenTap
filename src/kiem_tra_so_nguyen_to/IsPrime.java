package kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so can kiem tra :");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println(number + " khong phai so nguyen to ");
        } else {
           int i = 2;
           boolean check = true;
           while (i <= Math.sqrt(number)) {
               if (number % i == 0) {
                   check = false;
               }
               i++;
           }
           if (check) {
               System.out.println(number + " la so nguyen to ");
           } else {
               System.out.println(number + " khong phai so nguyen to ");
           }
        }
    }
}
