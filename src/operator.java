
public class operator {
   public static void main() {

       //An operator is a symbol that performs an operation on values/variables

       int a = 10;
       int b = 5;

       System.out.println(a + b); // 15

//       There are mainly 7 types:

//       | Type       | Operators                     |      |    |
//               | ---------- | ----------------------------- | ---- | -- |
//| Arithmetic | `+ - * / %`                   |      |    |
//| Unary      | `++ -- + - !`                 |      |    |
//| Relational | `> < >= <= == !=`             |      |    |
//| Logical    | `&&                           |      | !` |
//| Assignment | `= += -= *= /= %=`            |      |    |
//| Bitwise    | `&                            | ^ ~` |    |
//| Ternary    | `condition ? value1 : value2` |      |    |


       //Unary Operators
       //
//       //They work on one operand.
//               a++  → Use → Increas
//               ++a  → Increase → Use

//       int a = 10;
//
//       a++;
//       System.out.println(a); // 11
//
//       int b = 10;
//
//       b--;
//       System.out.println(b); // 9



//       Reverses boolean value.
//
//boolean x = true;
//
//System.out.println(!x); // false



//       Relational Operators
//
//       Used to compare two values.
//
//               The result is always true or false.


//       int a = 10;
//       int b = 5;

       System.out.println(a > b);  // true
       System.out.println(a < b);  // false
       System.out.println(a >= b); // true
       System.out.println(a <= b); // false
       System.out.println(a == b); // false
       System.out.println(a != b); // true

//    3   Logical Operators ⭐
//
//       Used to combine conditions.
//
//       AND &&
//
//               Both conditions must be true.

       int age = 20;

       System.out.println(age >= 18 && age <= 60);


//       TRUE && TRUE   = TRUE
//       TRUE && FALSE  = FALSE
//       FALSE && TRUE  = FALSE
//       FALSE && FALSE = FALSE


//
//       OR ||
//
//               At least one condition must be true.
//
//       int age = 17;
//
//       System.out.println(age < 18 || age > 60);
//

       // NOT

//       Reverses the result true, false.

               System.out.println(!(10 > 5));

               boolean as= true;

       System.out.println(!(as));



//    7. Assignment Operators
// =,+=,-=
//Used to assign/update values.

             a=10;
//       a += 5;  // a = a + 5
//       a -= 5;  // a = a - 5
//       a *= 5;  // a = a * 5
//       a /= 5;  // a = a / 5
//       a %= 5;  // a = a % 5









   }
}
