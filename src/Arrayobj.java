

class Student{

    String name;
    String course;

    Student( String  name, String course){
        this.name=name;
        this.course=course;

    }


}

public class Arrayobj {
    static void main() {

        Student [] arr; // declare array

        // Allocate memory to array

        arr=new Student[2];


        arr[0]=new Student("Aditya","BTECH");

        arr[1]=new Student("Aryan","BTECH");


        System.out.println(arr[0].name+ arr[0].course);
        System.out.println(arr[1] .name + arr[1].course);

    }
}
