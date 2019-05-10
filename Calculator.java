import java.util.Scanner;

public class Calculator
{
     int x;
     int y;
     int result;
   //behaviors
    public void addNumbers(int x, int y)
    {
         result=x+y;
         System.out.print("the result is"+result);
         
    }
    public void subtractNumbers(int x, int y)
    {
        result=x-y;
        System.out.print("the result is"+result);
    }
    public void multiplyNumbers(int x, int y)
    {
        result=x*y;
        System.out.print("the result is"+result);
    }
    public void divideNumbers(int x, int y)
    {
         result=x/y;
         System.out.print("the result is"+result);
    }

     public static void main(String[] args) { 
       //instantiation  
            Scanner getNum=new Scanner(System.in);
         
            System.out.print("Enter first integer.");
            x=getNum.nextInt();
            
            System.out.print("Enter second integer");
            y=getNum.nextInt();
            
            //result=calculator();
            Calculator myCalculator = new Calculator();
            System.out.println("the addition of x and y is", +Calculator.addNumbers());
       // show all operations here on myCalculator Object 
      }
 }


