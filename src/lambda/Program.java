package lambda;

public class Program {
    public static void fire(Object sender){
        System.out.println("");

    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //event subsribe (подписка на событие)
        //sw.consumer = lamp;
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);
        String message = "Пожар";
        sw.addElectricityListener(new ElectricityConsumer(){
                @Override
                public void electricityOn(Object sender) {
                    System.out.print(message);
                    System.out.println("!!!");
                }
            }
        );
        sw.addElectricityListener( sender -> System.out.println(message));
        //sw.addElectricityListener(sender -> Program.fire(sender));
        sw.addElectricityListener(Program::fire);






        sw.switchOn();

    }
}
