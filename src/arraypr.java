import java.util.Scanner;

public class arraypr {
   public static void main( String[] args) {

//        int arr[]={1,2,3,4,4};
//
//       System.out.println(arr[3]);
//       System.out.println(arr[2]);
//       System.out.println(arr[5]);
//
//
//
//       String names[]={"aditya","vishal"};

//        for ( int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }


       Scanner sc = new Scanner(System.in);

       int n  = sc.nextInt();
       int arr[]= new int[n];

       // for input
       for (int i=0;i<n;i++)
       {
           arr[i]= sc.nextInt();
       }

       // for output
     for (int i=0;i<n;i++){
         System.out.println(arr[i]);
     }



    }


}
