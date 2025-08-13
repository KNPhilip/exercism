using System;

class BirdCount
{
    private int[] birdsPerDay;

    public BirdCount(int[] birdsPerDay)
    {
        this.birdsPerDay = birdsPerDay;
    }

    public static int[] LastWeek()
    {
        int[] visitedLastWeek = [0, 2, 5, 3, 7, 8, 4];
        return visitedLastWeek;
    }

    public int Today()
    {
        return birdsPerDay[6];
    }

    public void IncrementTodaysCount()
    {
        birdsPerDay[6] += 1;
    }

    public bool HasDayWithoutBirds()
    {
        foreach(int element in birdsPerDay) 
        {
            if (element == 0) 
            {
                return true;
            }
        }
        return false;
    }

    public int CountForFirstDays(int numberOfDays)
    {
        int counter = 0;
        for (int i = 0; i < numberOfDays; i++)
        {
            counter += birdsPerDay[i];
        }
        return counter;
    }

    public int BusyDays()
    {
        int busyDays = 0;
        
        foreach(int element in birdsPerDay) 
        {
            if (element >= 5) 
            {
                busyDays++;
            }
        }
        return busyDays;
    }
}
