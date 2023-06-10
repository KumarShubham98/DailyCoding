package TcsInterviewPractice;
/*
1.Swap 2 numbers with or without the 3rd variable ?
2. Add two binary string.
3. Add a comples no.
4.Check even or odd
5. Find largest number
6. Find Out HCF of 2 no..
7. Display prime number 1 to n;
8 Check Leap Year
9. check Armstrong no. between 2 number
10-check weather no is +ve or ve-
*/


import java.util.Scanner;

public class T_01 {

  public static void main(String []args){
      int i,count;
      System.out.print("Enter n value : ");

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("Prime numbers between 1 to "+n+" are ");

      for(int j=2;j<=n;j++)
      {
          count=0;

          for(i=1;i<=j;i++)
          {
              if(j%i==0)
              {
                  count++;
              }
          }
          if(count==2)
              System.out.print(j+"  ");
      }

  }


}

















/*  int num = 100, count;

      for (int i = 1; i <= num; i++) {
          count = 0;
          for (int j = 2; j <= i / 2; j++) {
              if (i % j == 0) {
                  count++;
                  break;
              }
          }

          if (count == 0) {
              System.out.println(i);
          }

      }*/