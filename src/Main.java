import java.util.*;

public class Main {
    public static void main(String[] args) {

//    Airthematic
//        int a = 10, b = 3;
//
//        // Addition
//        int sum = a + b;
//
//        // Subtraction
//        int diff = a - b;
//
//        // Multiplication
//        int mul = a * b;
//
//        // Division
//        int div = a / b;
//
//        // Modulus
//        int mod = a % b;      // Modulus
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Difference: " + diff);
//        System.out.println("Multiplication: " + mul);
//        System.out.println("Division: " + div);
//        System.out.println("Modulus: " + mod);


        // 2 Uniray operator it needs only one operand  ++,--

        int c=10;
        int d=20;

        System.out.println(++c);

        System.out.println(--d);

        // 3 Assignment operator

        int num = 10;
        // add 5 → num = num + 5
        num += 5;
        System.out.println("After +5: " + num);

        // multiply by 2 → num = num * 2
        num *= 2;
        System.out.println("After *2: " + num);

        // subtract 5 → num = num - 5
        num -= 5;
        System.out.println("After -5: " + num);

        // divide by 2 → num = num / 2
        num /= 2;
        System.out.println("After /2: " + num);

        // remainder after dividing by 3 → num = num % 3
        num %= 3;
        System.out.println("After %3: " + num);

        //Relational Operators are used to
        // check for relations like equality, greater than, and less than.
        // They return boolean result
//
//        int a = 10;
//        int b = 3;
//        int e = 5;
//
//        System.out.println("a > b: " + (a > b));
//        System.out.println("a < b: " + (a < b));
//        System.out.println("a >= b: " + (a >= b));
//        System.out.println("a <= b: " + (a <= b));
//        System.out.println("a == c: " + (a == e));
//        System.out.println("a != c: " + (a != e));


      // Logical Operators are used to perform "logical AND" and "logical OR"
        // operations, similar to AND gate and OR gate in digital electronics.
        // They have a short-circuiting effect
        // , meaning the second condition is not evaluated if the first is false.



        // 4 Logical operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));



        //5. Ternary operator
        //The Ternary Operator is a shorthand version of the if-else statement.
        // It has three operands and hence the name Ternary.


        int p = 20, q = 10, r = 30, result;

        // result holds max of three
        // numbers
        result = ((p > q) ? (p > r) ? p : r : (q > p) ? p : r);
        System.out.println("Max of three numbers = "+ result);



//        Bitwise operators in Java operate directly on the binary representation
//        of integer values, performing operations bit by bit instead of on whole numbers.
//                This makes them efficient for low-level processing and performance-critical tasks.
//
//                Work only with integral types like byte, short, int, long, and char


        //1. Bitwise AND (&)
        //This operator is a binary operator, denoted by '&.'
        // It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0.


        //2. Bitwise OR (|)
        //This operator is a binary operator, denoted by '|'. It returns bit by bit OR of input values,
        // i.e., if either of the bits is 1, it gives 1, else it shows 0.

        //3. Bitwise XOR (^)
        //This operator is a binary operator, denoted by '^.' It returns bit by bit XOR of input values,
        // i.e., if corresponding bits are different, it gives 1, else it shows 0.

        //4. Bitwise Complement (~)
        //This operator is a unary operator, denoted by '~'. It inverts all the bits of
        // the given number (0 becomes 1 and 1 becomes 0).
        //~N = -(N + 1)





        // Initial values
        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}