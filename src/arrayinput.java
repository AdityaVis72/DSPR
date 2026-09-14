import java.util.Scanner;

public class arrayinput {
    static void main() {
        Scanner sc =new Scanner(System.in);

        int arr[]=new int[5];
        // taking input
         int n= arr.length;
        for (int i=0;i<=n-1;i++){

            arr[i]=sc.nextInt();

        }
        // showing output

        for (int nums: arr){

            System.out.println(nums);
        }



    }

}
