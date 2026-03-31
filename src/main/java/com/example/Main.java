package com.example;

public class Main {
    public static void main(String[] args) throws Exception{
        for(int k=0;k<5;k++){
            System.out.print("Welcome ");
            System.out.println(k+1);
            Thread.sleep(2000);
        }
    }
}
