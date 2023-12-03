package com.Functional;

    import java.util.Scanner;

    //2. Sum of three Integer adds to ZERO
//        a. Desc -> A program with cubic running time. Read in N integers and counts the
//        number of triples that sum to exactly 0.
//        b. I/P -> N number of integer, and N integer input array
//        c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
//        d. O/P -> One Output is number of distinct triplets as well as the second output is to
//        print the distinct triplets.
    class SumOfThreeNumber
    {
        public static void main(String[] args)
        {
            Scanner rs=new Scanner(System.in);
            int a[]={-2,1,-1,0,5,-5};
            for(int i=0;i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    for(int k=j+1;k<a.length;k++)
                    {
                        if(a[i]+a[j]+a[k]==0)
                        {
                            System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        }
                    }


                }
            }
        }
    }


