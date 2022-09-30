package lab3;

public class Engine {
    private int power;
    private String efficiency;

    public Engine(int power, String efficiency) {
        this.power = power;
        this.efficiency = efficiency;
    }

    public int getPower() {
        return power;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
