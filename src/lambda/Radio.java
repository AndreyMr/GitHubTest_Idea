package lambda;

public class Radio implements ElectricityConsumer {
    public void playMusic(){
        System.out.println("Радио играет");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
