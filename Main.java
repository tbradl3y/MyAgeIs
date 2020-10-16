import java.util.Scanner;

class Main {
  public static void main(String[] args) {
 
  Scanner scan = new Scanner(System.in);
  int currentYear = 2020;
 //uses current year to figure out ur grad. year if younger than 18
  System.out.println("What's your first name?");
  String name = scan.next();
  name = name + scan.nextLine();
  // asking you to fill out your information
  System.out.println(" Whats your age");
  int age = scan.nextInt();
  if(age < 18 ){
     System.out.println("No yearbook quote");
   //if you're younger than 18 no yearbook quotes
   while (age < 18) {
     age++;
     currentYear++;
   //class of.. loop
   }
   System.out.println ("your graduating class is "+ currentYear);
   //prints out your graduating class
  }else if (age >= 18){ 
 //if you're older than 18 or equal to -> yearbook quote
  System.out.println("What's your yearbook quote?");
  //type in your yearbook quote
  String quote = scan.next();
  quote = quote + scan.nextLine();
  System.out.println("Thank you "+ name + ", you are " + age + " years old");
 //prints out thank you, your name, and age 
  System.out.println("and your yearbook quote is " + quote);
  }
  }

}