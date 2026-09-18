public class remove {

    static  void removeDuplicate(int arr[]){

        for (int i=0;i< arr.length;i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.println(arr[i] + "");
            }

        }
    }
        public static void main() {

        int arr[]={1,2,3,2,4};
        removeDuplicate(arr);



        }
    }


