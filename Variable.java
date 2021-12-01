
//13 Local Class and instance variable 

public class Variable{
    int myVariable = 1; // Intance variable declared in class but outside the method 
    static int data = 30; // Static variable declared with the static keyword in a class, but outside a method.
    
    public static void main(String args[]){
       int a = 100;//Local variable declared in method ( Will be destroyed once the method is executed )
       Variable obj = new Variable();
       
       System.out.println("Value of instance variable: "+ obj.myVariable);
       System.out.println("Value of static/class variable: "+ Variable.data);
       System.out.println("Value of local variable a: "+ a);
    }
 }