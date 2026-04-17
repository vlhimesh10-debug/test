public class Test {

  static void add(){
    int a = 10;
    int b = 20;
    int result = a + b;
    System.out.println("The sum is " + result);
  }

 
  static void multi(){
    int x = 5;
    int y = 8;
    int result2 = x * y;
    System.out.println("The multiplication result is: " + result2);
  }

  // Division method
  static void div(){
    int m = 20;
    int n = 5;
    int result3=m/n;
   
      System.out.println("The division result is: " + result3);
    
  }

  public static void main(String[] args){
    add();
    multi();
    div();   // calling division method
  }
}
