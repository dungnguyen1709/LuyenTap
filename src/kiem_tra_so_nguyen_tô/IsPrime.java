package kiem_tra_so_nguyen_tô;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số cần kiểm tra : ");
        int number = sc.nextInt();

        if(number < 2) {
            System.out.print(number + " is not a prime ");
        } else {
            int i = 2;
            boolean check = true;
            while(i <= Math.sqrt(number)) {
                if(number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if(check) {
                System.out.print(number + " is a prime ");
            } else {
                System.out.print(number + " is not a prime");
            }
        }
    }
}
