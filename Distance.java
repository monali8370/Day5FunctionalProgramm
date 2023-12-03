package com.Functional;


    //3. Write a program Distance.java that takes two integer command-line arguments x
//        and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
//        formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
import java.util.*;
    public class Distance
    {
        public static void main(String[] args)
        {
            Scanner rs=new Scanner(System.in);
            System.out.println("Enter 2 values: ");
            int x=rs.nextInt();int y=rs.nextInt();
            double res=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
            System.out.println(res);
        }
    }


