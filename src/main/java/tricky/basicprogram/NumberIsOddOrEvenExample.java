package tricky.basicprogram;

/** Copyright (c), AnkitMittal www.JavaMadeSoEasy.com */
public class NumberIsOddOrEvenExample {
    public static void main(String[] args) {
           
           int number=4;
           
           if((number&1) ==0)
                  System.out.println(number+" is EVEN");
           else
                  System.out.println(number+" is ODD");
    }
}