package lec4;

public class Ext extends Base{

    String title="123";

    public Ext() {
        super();
        //init title
        System.out.println("Ext()");
    }

    @Override
    void m() {
        System.out.println("Ext.m() "+title);
    }
}