import java.util.Scanner;

class Main {
  public static void main(String[] args) {
 
  Scanner scan = new Scanner(System.in);
  int currentYear = 2020;
  System.out.println("What's your first name?");
  String name = scan.next();
  // asking you to fill out your information
  System.out.println(" Whats your age");
  int age = scan.nextInt();
  if(age < 18 ){
     System.out.println("No yearbook quote");
   while (age < 18) {
     age++;
     currentYear++;
   }
   System.out.println ("your graduating class is "+ currentYear);
   //prints out your graduating class
  }else if (age >= 18){ 
 //if you're younger than 15 no yearbook quote
  System.out.println("What's your yearbook quote?");
  String quote = scan.next();
  quote = quote + scan.nextLine();
  System.out.println("Thank you "+ name + ", you are " + age + " years old");
  System.out.println("and your yearbook quote is " + quote);
  }
  }

}