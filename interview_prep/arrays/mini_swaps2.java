import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution{
  public static void main(String[]args){

  }

  public static int minimumSwaps(int[] arr){
    int swaps=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==i +1){
        continue;
      }
      int buf = arr[i];
      arr[i] = arr[arr[i]-1];
      arr[buf-1] = buf;
      swaps++;
      i=-1;
    }
    return swaps ;
  }

  private static final Scanner scanner = new Scanner(System.in);


}
