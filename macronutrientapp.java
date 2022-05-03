package bufferedfloatinput;
import java.io.*; 

public class Main 
{ 
     public static void main(String[] args) throws IOException 
     { 
           
        String male;
        String female;
        String op;
        String name;
        int numAge;
        float age;
        char gender; 
        char goal;
        float actlevel;
        float num1, num2;
        float num3;
        float weight;
        float height;
        int num4;
        String od;
        float val1, val2, val3, mod1, mod2;
        
        
           BufferedReader consoleInput=new BufferedReader(new InputStreamReader(System.in)); 
 
          System.out.print("please enter your weight(lbs): "); 
          weight=Integer.parseInt(consoleInput.readLine()); 
 
          System.out.print("please enter your height(cm): "); 
          height=Integer.parseInt(consoleInput.readLine()); 
          
          System.out.print("please enter your gender (male/female): "); 
          gender=consoleInput.readLine().charAt(0); 
          
          System.out.print("please enter your age: "); 
          age=Integer.parseInt(consoleInput.readLine()); 
          
          System.out.print("please enter your activity level (1-5): "); 
          actlevel=Integer.parseInt(consoleInput.readLine()); 
          
          System.out.print("main goal? (cut/bulk/maintain): "); 
          goal=consoleInput.readLine().charAt(0); 
          
          if (op == "male")
          {
                val1 = ((10.0 * weight) + (6.25 * height) - ( 5.0 * age) - 161.0) * actlevel;
                
                System.out.println("Your maintenance calories is " + val1);
          }
          
          else if (op == "female") 
          {
                val2 = ((10 * weight) + (6.25 * height) - ( 5 * age) + 5) * actlevel;
                System.out.println("Your maintenance calories is " + val2);
          }
          else 
          {
                System.out.println("Error, Try again");
          }
 
 
        if ((od == "cutting") && (op == "male"))
        {
            mod1 = val1 - 500;
            System.out.println("Your primary calories for cutting is " + mod1);
        }
    
        else if((od == "cutting") && (op == "female"))
        {
            mod2 = val2 - 500;
            System.out.println("Your primary calories for bulking is " + mod2);
        }
    
        else 
        {
            System.out.println("Error, something went wrong");
        }
 
          
     } 
} 
