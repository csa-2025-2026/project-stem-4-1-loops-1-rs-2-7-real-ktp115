import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
//1
    int x = 0;
    int sum = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter any numbers. -1 to stop.");
    while (x != -1)
    {
      x = sc.nextInt();
      sum += x;
    }
    sum ++;
    System.out.println("Sum is " + sum);
//2
    
    int N;
    System.out.println("How many numbers do you want to enter?");
    N = sc.nextInt();

    int max = 0; //or Integer.MIN_VALUE
    int count = 0;
    System.out.println("Enter scores:");
    while (count < N)
    {
      x = sc.nextInt();
      if (max < x)
      {
        max = x;
      }
      count++;
    }

    System.out.println("Max score is: " + max);

//3
    String str;

    System.out.println("Input a word:");
    str = sc.next();

    int index = 0;
    while (index < str.length())
    {
      if (index % 3 != 2)
      {
        System.out.print(str.substring(index, index + 1));
      }
      index ++;
    }
  }
}
