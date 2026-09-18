import java.util.Scanner;

public class twodarraypr {

    static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int arr[][]=new int[3][3];

        // for taking input
         for (int i=0;i<arr.length;i++){
             for (int j=0;j< arr.length;j++){
                 arr[i][j]=sc.nextInt();
             }
         }

         // for showing output

        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
