package lec5;

public class Employee {
    String name;
    String title;
    {
        System.out.println("init");
        age = 6;
       // MAX = 100/2;
    }
    int age;
    static {
        System.out.println("static init");
    }
    final int MAX = 100;
    //test chaange


    public Employee(String name, String title, int age) {
        this.name = name;
        this.title = title;
        System.out.println("Employee(...)");
 //       this.age = age;
    }

    public Employee(String name, int age) {
        this(name,null,age);
        //this.name = name;
        //this.age = age;
    }

    public static void main(String[] args) {


       final int i;
       final int [] array = {1,2,3,4,5};
       array[0] = 0;
       //array = new int[12];
       i = 0;
        System.out.println("START");
        new Employee("Iavn","kjdfnd",23);
        new Employee("sdjs",32);
        System.out.println("STOP");



    }
}
