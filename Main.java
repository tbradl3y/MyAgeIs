import java.util.Scanner;

class Main {
  public static void main(String[] args) {
 
  Scanner scan = new Scanner(System.in);
 
  System.out.println("What's your first name?");
  String name = scan.next();
  
  System.out.println("Whats your age");
  int age = scan.nextInt();
  if(age < 15 ){
     System.out.println("No yearbook quote");
  }else if (age >= 15){ 
  System.out.println("What's your yearbook quote?");
  String quote = scan.next();
  quote = quote + scan.nextLine();
  System.out.println("Thank you "+ name + ", you are " + age + "years old");
  System.out.println("and your yearbook quote is " + quote);
  }
  }

}