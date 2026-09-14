import java.util.Arrays;
import java.util.stream.Stream;

public class testpr {
    static void main( String[] args) {


        int [] nums={1,3,5,4,2};
        nums[0]=30;

//
        for (int i=0;i<= nums.length-1;i++){

            System.out.println(nums[i]);
        }
//
//        for(int num: nums ){
//            System.out.println(num);
//        }
        System.out.println(nums.length);
//        System.out.println(Arrays.stream(nums).sum());
//
//
//        String name[]={"aditya","aditya","aman","vishal","vishwavansh"};
//
//        for (String sname:name){
//
//            System.out.println(  "Non premitive "+sname);
//
//        }



    }
}
