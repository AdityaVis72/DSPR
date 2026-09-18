public class Stringpr {

    static void main() {
        String name= "level";
        String rev="";

        for (int i=name.length()-1;i>=0;i--){
            rev =rev+name.charAt(i);
        }

        if (rev  .equals(name)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }

//        System.out.println(rev);
//        System.out.println(name);
////
//        for (int i=0;i<name.length();i++){
//            System.out.println(name.charAt(i));
//
//        }
//
//
//
}
}
