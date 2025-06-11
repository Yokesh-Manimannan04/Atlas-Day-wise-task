// Abstract class
abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class 1
class TVRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

// Concrete class 2
class ACRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("AC is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

// Concrete class 3
class FanRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

// Concrete class 4
class CoolerRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("Cooler is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Cooler is turned OFF.");
    }
}

// Main class
public class task40 {
    public static void main(String[] args) {
        Gadgets tv = new TVRemote();
        tv.turnOn();
        tv.turnOff();

        Gadgets ac = new ACRemote();
        ac.turnOn();
        ac.turnOff();

        Gadgets fan = new FanRemote();
        fan.turnOn();
        fan.turnOff();

        Gadgets cooler = new CoolerRemote();
        cooler.turnOn();
        cooler.turnOff();
    }
}
