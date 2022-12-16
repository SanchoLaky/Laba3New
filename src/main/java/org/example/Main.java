package org.example;

public class Main {
    public static void main(String[] args) {
        СompareArrayListAndLinkedList test = new СompareArrayListAndLinkedList();
        test.tableOfСompare(15000);
        int ar[] = new int[]{1000,10000,40000};
        test.tableOfСompare(3,ar);
    }
}