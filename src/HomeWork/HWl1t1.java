 package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1111;
        if (-9 <= a && a <= 9) {
            System.out.println("it single digit"); }
        else if ((-99 <= a && a <= -10)||(10 <= a && a <= 99)) {
            System.out.println("it double digit"); }
        else if ((-999 <= a && a <= -100)||(100 <= a && a <= 999)) {
            System.out.println("it triple digit"); }
        else { System.out.println("more digit number"); }
        if (a >= 1) {
            System.out.println("it positive number"); }
        if (a <=-1) {
            System.out.println("it negative number"); }

    }
}
