package com.javatpoint.basicprograms;
import java.util.*;
import java.util.Map.Entry;
public class CountOccurencesOfCharInString
{
   
  public static void main(String args[]) 
  {
      
  String input = "aaaabbAAAAcccddd";
  //input = input.toLowerCase();
  char search = 'a';             // Character to search is 'a'.
  
  Map<Character,Integer> hash = new HashMap<Character,Integer>();
  //loop for checking the length of the string
  for(int i=0;i<input.length();i++)
  {
      if(hash.containsKey(input.charAt(i)))
      hash.put(input.charAt(i), hash.get(input.charAt(i))+1);
      
      else
      hash.put(input.charAt(i), 1);
  }
  //general way for iterating the hashmap or map
  Set<Entry<Character, Integer>> s = hash.entrySet();
  Iterator<Entry<Character, Integer>> itr = s.iterator();
  while(itr.hasNext()) {
	  Map.Entry<Character, Integer> m = (Map.Entry<Character, Integer>)itr.next();
	  System.out.println(m.getKey()+" : "+m.getValue());
  }
  System.out.println("====================================");
  for(Map.Entry<Character, Integer> m : hash.entrySet()) {
	  System.out.println(m.getKey()+" : "+m.getValue());
  }
  
  int result = hash.get(search);
  
  System.out.println("The Character '"+search+"' appears "+result+" times.");
  }
}
 