interface Bicycle {
    //int a = 10;
    void applyBrake(int decrement);
    void speedUp(int increament);
}

class AvonCycle implements Bicycle {
    void blowHorn() {
        System.out.println("Beep Beep!!");
    }
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }
    @Override
    public void speedUp(int increament) {
        System.out.println("Speeding up");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle obj = new AvonCycle();
        obj.blowHorn();
        obj.applyBrake(2);
        obj.speedUp(3);
    }
}
