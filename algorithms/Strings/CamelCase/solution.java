import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String s = in.next();
    in.close()
    
    if(s.isEmpty()){
      System.out.println("0");
      System.exit(0);
    }

    int words= 1;
    for(char l : s.toCharArray()){
      if(l  < 91 && l >= 64){
        words ++;

      }
    }
    System.out.println(words);
  }
}
