import java.util.Scanner;
public class matrix {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter The No. Of Rows(m) Of The 1st Matrix:");
   int m1=sc.nextInt();
   System.out.println("Enter The No. Of Columns(n) Of The 1st Matrix:");
   int n1=sc.nextInt();
   System.out.println("Now Enter The Elements In The 1st Matrix Row-wise:");
   int [][] arr1=new int[m1][n1];
   for(int i=0; i<m1; i++){
     for(int j=0; j<n1; j++){
       arr1[i][j]=sc.nextInt();
     }
   }
   System.out.println("Enter The No. Of Rows(m) Of The 2nd Matrix:");
   int m2=sc.nextInt();
   System.out.println("Enter The No. Of Columns(n) Of The 2nd Matrix:");
   int n2=sc.nextInt();
   System.out.println("Now Enter The Elements In The 2nd Matrix Row-wise:");
   int [][] arr2=new int[m2][n2];
   for(int i=0; i<m2; i++){
     for(int j=0; j<n2; j++){
       arr2[i][j]=sc.nextInt();
     }
   }
   System.out.println("Which Operation Do You Want To Perform?\n1.Addition\n2.Subtraction\n3.Multiplication");
   int op=sc.nextInt();
   int [][] arr=new int[m1][n1];
   switch(op){
       case 1:
           if(m1==m2 && n1==n2){
               for(int i=0; i<m1; i++){
                  for(int j=0; j<n1; j++){
                     arr[i][j]=arr1[i][j]+arr2[i][j];
                     System.out.print(arr[i][j]+"  ");
                  }
                 System.out.println();
               }
           }
           else{
              System.out.println("Summation Of The Given 2 Matrices Is Not Possible"); 
           }
       break;
       case 2:
           if(m1==m2 && n1==n2){
               for(int i=0; i<m1; i++){
                  for(int j=0; j<n1; j++){
                     arr[i][j]=arr1[i][j]-arr2[i][j];
                     System.out.print(arr[i][j]+"  ");
                  }
                 System.out.println();
               }
           }
           else{
              System.out.println("Subtraction Of The Given 2 Matrices Is Not Possible"); 
           }
       break;
       case 3:
           if(m1==n2){
               int [][] arrm=new int[m1][n2];
               for(int i=0;i<m1;i++){
                   for(int j=0;j<n2;j++){
                       for(int k=0;k<n1;k++){
                           arrm[i][j]=arrm[i][j] + arr1[i][k]*arr2[k][j];
                       }
                       System.out.print(arrm[i][j]+"  ");
                   }
                   System.out.println();
               }
           }
           else{
              System.out.println("Multiplication Of The Given 2 Matrices Is Not Possible"); 
           }
   }
}
}
