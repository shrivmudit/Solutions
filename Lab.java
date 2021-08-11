package com.company;
import java.util.*;
public class Lab{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the seating capacity of x");
        int x=s.nextInt();
        System.out.print("Enter the seating capacity of y");
        int y=s.nextInt();
        System.out.print("Enter the seating capacity of z");
        int z=s.nextInt();
        System.out.print("Enter the requirement");
        int need =s.nextInt();

        if(x<need&&y<need&&z<need)
            System.out.println("none of the labs can be allocated");
        else if(x>=need)
            System.out.println("L1 should allocate");
        else if(y>=need)
            System.out.println("L2 should allocate");
        else
            System.out.println("L3 should allocate");

    }
    }



