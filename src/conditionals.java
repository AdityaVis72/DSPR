import java.util.Scanner;

public class conditionals {
    public static void main() {
        String name="aditya";
//        String email="aditya@gmail.com";
//        String pass="123";

//        Scanner sc= new Scanner(System.in);
//
//        System.out.println("Enter  user name");
//        String username=sc.nextLine();
//        System.out.println("Enter a password");
//        String password= sc.nextLine();
//
//
//        if(username.equals(name) && password.equals(pass) ){
//            System.out.println( " welcome Admin :" + name);
//        }
//        else {
//            System.out.println("password  is missing ");
//        }



//         for (int j=4;j>=1;j--){
//             System.out.print(j);
//         }


//
//           for (int i =1;i<=4;i++) {
//               // for print space
//               for (int j=1 ;j<i;j++){
//                   System.out.print("  ");
//               }
//
//               // for print star
//
//               for (int k=0;k<=4;k++)
//               {
//                   System.out.print("*");
//               }
//
//
//               System.out.println();
//
//           }

        for(int i = 1; i <= 5; i++) {

            for(int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }






    }
}
