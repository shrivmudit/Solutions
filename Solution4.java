package com.company;

public class Solution4 {

    public static void main(String[] args) {

                int n =5;
                while(n !=1){
                    System.out.print(n+ " ");
                    if (( n&1)== 1)
                        n = 3*n+1;
                    else
                        n= n/2;
                }
                System.out.print(n);
            }
        }
   