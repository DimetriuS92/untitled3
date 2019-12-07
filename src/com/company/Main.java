package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
       String[] s =  next.split("  ");
        System.out.println(Arrays.toString(s));
        String[] strings = s[0].split("");
        System.out.println(Arrays.toString(strings));
Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
