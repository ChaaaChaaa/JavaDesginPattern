package LSP;

public class Bus extends Vehicle {
    private String emergencyExitLocation = "";

    public Bus() {
        super(60, 50);
        this.emergencyExitLocation = "Seoul, National Hospital";
    }

    public String getEmergencyExitLocation() {
        return this.emergencyExitLocation;
    }

    public void speedUp() {
        this.speed += 5;
    }
}
