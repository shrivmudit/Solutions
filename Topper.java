package com.company;
import java.util.*;
public class Topper{

    public static void main(String[] args) {

                int number1,sum=0, sum1=0;

                Scanner s=new Scanner(System.in);


                int number= s.nextInt();

                while(number>0) {
                    number1 = number % 10;
                    if (number1 % 2 == 0) {
                        sum = sum + number1;
                    }
                    number = number / 10;
                }
                if(sum==sum1) {
                    System.out.println("Yes");
                }
                else
                    System.out.println("No");

            }

        }
