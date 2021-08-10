# Solutions*
Question 2 

import java.util.*;
public class Main{
     public static void main(String[] args) {
         int n,n1,sum=0, sum1=0;
         Scanner s=new Scanner(System.in);


         int num = s.nextInt();

         while(n>0) {
             n1 = n % 10;
             if (n1 % 2 == 0) {
                 sum = sum + n1;
             }
             n = n / 10;
         }
         if(sum==sum1) {
             System.out.println("Yes");
         }
         else
             System.out.println("No");

     }
