

public class Solution{

  // Complete the twoStrings function below.
 static String twoStrings(String s1, String s2) {

   final Map<String, String> words = new HashMap<String, String>();

   for(int i =0; i< s1.length(); i++){
     words.put(s1.substring(i,i+1), null);

   }

   for(int i =0; i< s2.length(); i++){
     if(words.containsKey(s2.substring(i,i+1))){
       return "YES";
     }
   }

   return "NO";
 }
}
