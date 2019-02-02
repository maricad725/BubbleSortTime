/*
Author: Alex Lopez
Class: CDA 3103 U05
Professor: Dr. Trevor Cickovski
Group: Celtics
Assignment: IP 1
Date: 1/23/19
 */

package BubbleSortTime;

import java.text.DecimalFormat;


public class BubbleSortTime {
    //-------------------------------------------
    // Decimal format for formatting time values
    //-------------------------------------------
    
    final static DecimalFormat df = new DecimalFormat("#.00000");
    
    public static void main(String[] args) {

     //--------------------------------------
     // Initializing Array Size
     // NOTE: Only increase or decrease size
     // by powers of 10
     // If sorting time is less than 1 second
     // Or greater than 60 seconds+
     //--------------------------------------
     final int N = 100000;
     
     //------------------------------------------
     // Initializing Arrays and temp variables
     //------------------------------------------
     int[] a = new int[N];
     int tmp = 0;
     
     float[] b = new float[N];
     float tmp2 = 0;
     
     double[] c = new double[N];
     double tmp3 = 0;
     
     //------------------------------------------------
     // Array for comparing times of different arrays
     //------------------------------------------------
        long [] cSortTime = new long[3];
     
     //---------------------------------------
     // Overloaded methods: Fill the arrays
     // Time the sorting algorithm
     // and store the time in long array
     //---------------------------------------
     
     cSortTime [0] = sortTime(N,tmp,a);
     cSortTime [1] = sortTime(N,tmp2,b);
     cSortTime [2] = sortTime(N,tmp3,c);
     
    //----------------------------------------
    // Get comparison time factors
    // See how data type affects sort time
    //----------------------------------------
    System.out.println(); 
    CompareTimes(cSortTime);
    
    }// end main 
   
    //-------------------------------------------------------
    // Helper Function #1 for Integer Array
    //-------------------------------------------------------
    public static long sortTime(int N, int tmp , int [] arr){
        
        //---------------------------------------------------
        // Fills the Array in decreasing order
        // From N to 0
        //---------------------------------------------------
        
        for (int i = N-1; i >=0; i--) {
            arr[N-1-i] = i;
        }
        
        //-------------------------------------
        // Time the sorting algorithm
        //-------------------------------------
        
        long startTime = System.currentTimeMillis();
        for (int i = N-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }// end if 
            }// end j loop
        }// end i loop
        long endTime = System.currentTimeMillis();
    
        //---------------------------------------------
        // Print out the execution time in seconds
        // and return the time to long array
        //---------------------------------------------
        System.out.println("Total execution time of integer array in seconds: " + (endTime-startTime)/1000.0);  
    
        return endTime-startTime;
    }// end method
   
    //----------------------------------------------------------
    // Helper Function #2 for Float Array
    //----------------------------------------------------------
    public static long sortTime(int N, float tmp , float [] arr){
     
        //---------------------------------------
        // Fills the Array in decreasing order
        // From N to 0
        //---------------------------------------
        
        for (int i = N-1; i >=0; i--) {
            arr[N-1-i] = i;
        }
        
        //-------------------------------------
        // Time the sorting algorithm
        //-------------------------------------
        long startTime = System.currentTimeMillis();
        for (int i = N-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }// end if 
            }// end j loop
        }// end i loop
        long endTime = System.currentTimeMillis();
    
        //--------------------------------------------
        // Print out the execution time in seconds 
        // And return the time to long array
        //--------------------------------------------
    
        System.out.println("Total execution time of float array in seconds: " + (endTime-startTime)/1000.0);  
        return endTime-startTime;
    
    }
    
    //////////////////////////////////////////////////////////////
    // Helper Function #3 for Double Array
    //////////////////////////////////////////////////////////////
    public static long sortTime(int N, double tmp , double [] arr){         
        ///////////////////////////////////////
        // Fills the Array in decreasing order
        // From N to 0
        ///////////////////////////////////////
        for (int i = N-1; i >=0; i--) {
            arr[N-1-i] = i;
        }
        
        ///////////////////////////////////////
        // Time the sorting algorithm
        ///////////////////////////////////////
        long startTime = System.currentTimeMillis();
        for (int i = N-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }// end if 
            }// end j loop
        }// end i loop
        long endTime = System.currentTimeMillis();
    
        //--------------------------------------------
        // Print out the execution time in seconds
        // and Return the time to long array
        //--------------------------------------------
        System.out.println("Total execution time of double array in seconds: " + (endTime-startTime)/1000.0);  
        return endTime-startTime;
    }
    
    //----------------------------------------------------------
    // Helper Function for printing comparison time factors
    //----------------------------------------------------------
    
    public static void CompareTimes(long [] arr){    
        
        System.out.println("Float instead of Integer: " + Double.parseDouble(df.format((double) arr[1]/ (double)arr[0])) +"x");
        
        System.out.println("Double instead of Float: " +  Double.parseDouble(df.format((double) arr[2]/ (double)arr[1])) +"x");
        
        System.out.println("Double instead of Integer: " + Double.parseDouble(df.format((double) arr[2]/ (double)arr[0])) +"x");
    }
    
}// end file 