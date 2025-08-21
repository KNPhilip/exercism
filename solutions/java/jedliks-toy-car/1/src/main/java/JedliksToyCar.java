public final class JedliksToyCar {
    private Integer percentage = 100;
    private Integer metersDriven = 0;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metersDriven + " meters";
    }

    public String batteryDisplay() {
        if (percentage == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + percentage + "%";
        }
    }

    public void drive() {
        if (percentage > 0) {
            this.metersDriven += 20;
            this.percentage -= 1;
        }
    }
}
