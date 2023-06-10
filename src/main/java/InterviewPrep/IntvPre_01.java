package InterviewPrep;
/*
13579
1113151719
2123252729
3133353739
4143454749
*/
public class IntvPre_01 {
public static void main(String[] args){


      int n =5;
      int x=1;
      for(int i =1;i<=n;i++){
          for(int j =1;j<=n;j++){

              System.out.print(x);
              x=x+2;
          }
          System.out.println();
      }
}
}