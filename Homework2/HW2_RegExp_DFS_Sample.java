/*	
    CS 3342 - Programming Languages
    Sample program for homework 2
    Regular Expression - DFA
	
*/

import java.io.*;
import java.lang.String;

public class HW2_RegExp_DFS_Sample
{ public static void main(String argv[]) throws IOException
  { 

        File file = new File("test_sample.txt"); 
       
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String st; 
        String[] temp = {"(a|b)cd*", " a(bc)*d" };
        int line_num =0;
        int option = 0;

        

          while ((st = br.readLine()) != null) 
          {
          line_num++;
          System.out.printf("This is line %d    :  ",line_num); 
          System.out.println(st); 
          String[] parts = st.split(" ");
          System.out.printf(" ********* This is for the first RE - %s  \n", temp[0]); 

          for (int i=0; i < parts.length; i++ )
          {
            String result = processRE(parts[i], temp[0], 1);
            System.out.println("      From main :  " + result + " - " + parts[i]); 
   
          }

  
          System.out.printf(" ********* This is for the second RE - %s  \n", temp[1]); 

          for (int i=0; i < parts.length; i++ )
          {
            String result = processRE(parts[i], temp[1], 2);
            System.out.println("      From main :  " + result + " - " + parts[i]); 
   
          }
    

         }
        
          
    
  }

  static String processRE(String in_str, String re, int option) 
  {
    if(option == 1){
    int i=0;
    System.out.println("RE is : " + re + " & Input string is :  " + in_str);
   
    if (in_str.substring(i,i+1).equals("a") || in_str.substring(i,i+1).equals("b"))
    {        
      i++;
      if (in_str.substring(i,i+1).equals("c"))
      {   
        i++;
        if (in_str.length() == i)
        { 
         
            return "Accept";
       }
      
      while (in_str.substring(i,i+1).equals("d"))
      {
        i++;
        if (in_str.length() == i)
       { 
        
           return "Accept";
      }
      }
    }
       
         
  }
}else{
  int i=0;
  System.out.println("RE is : " + re + " & Input string is :  " + in_str);
 
  if (in_str.substring(i,i+1).equals("a"))
  {        
    i++;
    if(in_str.substring(i,i+1).equals("d"))
    {

     i++;
     if (in_str.length() == i)
     { 
         return "Accept";
     }
     while(in_str.substring(i,i+2).equals("bc"))
     {   
     i+=2;
     if(in_str.substring(i,i+1).equals("d"))
     {
      i++;
      if (in_str.length() == i)
      { 
         return "Accept";
    }
    }
  }
  }
       
}


}
     return "Reject";
  }

  
}
