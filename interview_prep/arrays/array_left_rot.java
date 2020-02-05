import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  // Complete the rotLeft function below.
 static int[] rotLeft(int[] a, int d) {
   int[] newArr = new int[a.length];
   int counter =0 ;
   int newCounter;

   for(newCounter = d; newCounter <a.length;newCounter++){
     newArr[counter]=a[newCounter];
     counter++;
   }

   newCounter=counter;

   for(int i=0;i<a.length- counter;i++){
     newArr[newCounter]=a[i];
     newCounter++;

   }
   return newArr;
 }

}
