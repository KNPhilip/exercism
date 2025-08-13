using System;

class RemoteControlCar
{
    private int distance;
    private int batteryPercentage = 100;
    
    public static RemoteControlCar Buy()
    {
        return new RemoteControlCar();
    }

    public string DistanceDisplay()
    {
        return $"Driven {distance} meters";
    }

    public string BatteryDisplay()
    {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return $"Battery at {batteryPercentage}%";
    }

    public void Drive()
    {
        if (batteryPercentage != 0) {
            distance += 20;
            batteryPercentage--;
        }
    }
}
