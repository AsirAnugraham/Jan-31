package test;

public class CustomException  
{  
   
    static void validate (int age) throws InvalidAgeException{    
       if(age < 15){  
        throw new InvalidAgeException("age is not valid to write the exam");    
    }  
       else {   
        System.out.println("He can continue to write the exam "); 
        
        }   
     }    

public static void main(String args[])  
{  
    try  
    {   
        validate(13);  
    }  
    catch (InvalidAgeException ex)  
    {  
        System.out.println("Got the exception");  
        System.out.println("Exception occured: " + ex);  
    }  

    System.out.println("Rest Code..");    
}  
}  