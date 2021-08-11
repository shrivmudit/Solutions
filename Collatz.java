package com.company;

public class Collatz{

    public static void main(String[] args) {

                int number=5;
                while(number !=1){
                    System.out.print(number+ " ");
                    if (( number&1)== 1)
                        number = 3*number+1;
                    else
                        number= number/2;
                }
                System.out.print(number);
            }
        }
   