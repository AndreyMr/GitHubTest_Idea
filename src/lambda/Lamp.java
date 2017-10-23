package lambda;

public class Lamp implements ElectricityConsumer {
    public void lightOn(){
        System.out.println("Лампа зажглвсь");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
