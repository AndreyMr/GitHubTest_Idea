package lec4;

public class Base {

    String name="123";

    public Base() {
        super();
        //init fields

        System.out.println("Base() name="+name);
        m();
    }


    void m() {
        System.out.println("Base.m() " + name);
    }

    static String getName(String name) {
        System.out.println("getName("+name+")");
        return name;
    }

    public static void main(String[] args) {
        new Ext().m();


    }

}