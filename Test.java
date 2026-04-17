public class Test {

  static void add(){
    int a = 10;
    int b = 20;
    int result = a + b;
    System.out.println("The sum is " + result);
  }

  static void sub(){
    int c = 20;
    int d = 10;
    int result1 = c - d;
    System.out.println("The diff is " + result1);
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
    sub();
    multi();
    div();   // calling division method
  }
}
