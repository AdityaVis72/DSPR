import java.util.Arrays;

public class zero
{

    static void moveZero( int arr[]){

        int index=0;
        // zero element first
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index< arr.length){
            arr[index]=0;
            index++;
        }
    }

    static void main() {
        int arr[]={1,0,1,2,0};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
