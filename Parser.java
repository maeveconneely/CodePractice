import java.util.Scanner;
import java.lang.Integer;

public class Parser 
{

  public static final Scanner SCANNER = new Scanner(System.in);

  public Parser()
  {}
  

  public int returnNumber(String str)
  {
    int commaIndex = str.indexOf(",");
    String myString = "" + str.substring(0, commaIndex) +
    str.substring(commaIndex + 1);
    int end_string = Integer.valueOf(myString);
    return end_string;
    
  }

  public String returnString(String num)
  {
    String myString = "" + num.substring(0, num.length() - 3) + "," + num.substring(num.length() - 3);
    return myString;
  }

  public String phoneNum(String number)
  {
    String myString =  "(" + number.substring(0, number.length() - (number.length() - 3)) + ") " + number.substring(3, number.length() - 4) + "-" + number.substring(number.length()-4);
    return myString;
  }

  public void calculateToInt()
  {
    System.out.print("Enter a number between 1,000-999,999: ");
    String num = SCANNER.next();
    System.out.println(returnNumber(num));
  }

  public void calculateToString()
  {
    System.out.print("Enter a number between 1000-999999: ");
    String num = SCANNER.next();
    System.out.println(returnString(num));
  }

  public void calculatePhoneNumber()
  {
    System.out.print("Enter a 10 digit phone number: ");
    String number = SCANNER.next();
    System.out.println(phoneNum(number));
  }

  
}
