// This is a basic Calculator
// It can Add, Subtract, Multiply, Divide, and find the Modulo of two numbers.
public class Calculator{
  public Calculator(){
  }

  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a * b;
  }

  public int divide(int a, int b){
    if (b==0){
      throw new ArithmeticException("Cannot divide with 0");
    }
    return a / b;
  }

  public int modulo(int a, int b){
    return a % b;
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(5,7));
    System.out.println(myCalculator.divide(100,6));
    System.out.println(myCalculator.modulo(8,2));
  }  
}
