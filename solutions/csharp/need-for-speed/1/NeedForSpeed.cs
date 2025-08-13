class RemoteControlCar
{
    private readonly int _speed;
    private readonly int _batteryDrain;

    private int metersDriven;
    private int batteryPercentage = 100;

    public RemoteControlCar(int speed, int batteryDrain) 
    {
        _speed = speed;
        _batteryDrain = batteryDrain;
    }

    public bool BatteryDrained()
    {
        return batteryPercentage < _batteryDrain;
    }

    public int DistanceDriven()
    {
        return metersDriven;
    }

    public void Drive()
    {
        if (BatteryDrained())
            return;
        
        metersDriven += _speed;
        batteryPercentage -= _batteryDrain;
    }

    public static RemoteControlCar Nitro()
    {
        return new RemoteControlCar(50, 4);
    }
}

class RaceTrack
{
    private readonly int _distanceInMeters;
    
    public RaceTrack(int distanceInMeters) 
    {
        _distanceInMeters = distanceInMeters;
    }

    public bool TryFinishTrack(RemoteControlCar car)
    {
        if (car.DistanceDriven() == _distanceInMeters)
            return true;

        if (car.BatteryDrained())
            return false;

        car.Drive();
        return TryFinishTrack(car);
    }
}
