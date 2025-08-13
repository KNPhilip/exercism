using System;

static class AssemblyLine
{
    public static double SuccessRate(int speed)
    {
        if (speed == 0) {
            return 0;
        }
        else if (speed >= 1 && speed <= 4) {
            return 1;
        }
        else if (speed >= 5 && speed <= 8) {
            return 0.90;
        }
        else if (speed == 9) {
            return 0.80;
        }
        else {
            return 0.77;
        }
    }
    
    public static double ProductionRatePerHour(int speed)
    {
        int baseProductionRate = 221; // Cars per hour at speed 1
        double successRate;

        // Determine success rate based on the speed
        if (speed >= 1 && speed <= 4)
        {
            successRate = 1.0;
        }
        else if (speed >= 5 && speed <= 8)
        {
            successRate = 0.9;
        }
        else if (speed == 9)
        {
            successRate = 0.8;
        }
        else if (speed == 10)
        {
            successRate = 0.77;
        }
        else
        {
            return 0;
        }

        // Calculate production rate per hour
        double productionRate = speed * baseProductionRate * successRate;
        return productionRate;
    }

    public static int WorkingItemsPerMinute(int speed)
    {
        // Get the production rate per hour
        double productionRatePerHour = ProductionRatePerHour(speed);

        // Convert the production rate per hour to a per-minute rate
        double productionRatePerMinute = productionRatePerHour / 60;

        // Return the integer part of the production rate per minute
        return (int)productionRatePerMinute;
    }
}
