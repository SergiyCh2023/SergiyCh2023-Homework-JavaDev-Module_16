package org.example;

public class SumCalculator {


   public int sum(int value) throws IllegalArgumentException {
   int result = 0;
   if (value<=0) throw new IllegalArgumentException();
   else {
       for (int i = 0; i <= value; i++) {
           result += i;
       }
   }
   return result;
    }
}
