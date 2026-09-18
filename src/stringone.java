public class stringone {
    static void main() {
        String name="madam";

        String rev="";

        for (int i=name.length()-1;i>=0;i--){
            rev=  rev + name.charAt(i);
        }
        System.out.println(rev);

        if (rev .equals(name)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
