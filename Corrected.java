// I deleted all the extraneous class and method headers.
// other than that:
// 1. moved the import statement to the top of the program
// 2. added semicolon on line 31
// 3. fixed username on line 16 (case didn't match)
// 4. fixed case of nextLine() method from nextline() on line 19 - case sensitive!
// 5. fixed MyText on line 38 (case didn't match)
import java.util.Scanner;

class Corrected {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Scanner myObj = new Scanner(System.in);
    String userName;

    System.out.println("Enter username");
    userName = myObj.nextLine();

    System.out.println("Username is:gonzo8880"+ userName);

    System.out.println("Hello World!");

    String name = "Gonzalo";
    System.out.println(name);

    int myNum = 6;
    System.out.println(myNum);

    float myFloatNum = 10.99f;
    System.out.println(myFloatNum);

    char myLetter = 'G';
    System.out.println(myLetter);

    String myText = "Enjoy yourself";
    System.out.println(myText);
  }
}