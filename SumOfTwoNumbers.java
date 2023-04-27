import java.io.*;
import java.util.*;

public class SumOfTwoNumbers
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the 1st number :");

        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter the 2nd number");

        int b = Integer.parseInt(br.readLine());

        System.out.println("Addition :"+(a+b));
        



    }
}