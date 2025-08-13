class WeighingMachine
{
    private double weight;
    
    public WeighingMachine(int precision) 
    {
        Precision = precision;
    }

    public int Precision { get; private init; }

    public double Weight 
    { 
        get => weight; 
        set
        {
            ArgumentOutOfRangeException.ThrowIfNegative(value);
            weight = value;
        }
    }

    public string DisplayWeight { get => $"{(weight - TareAdjustment).ToString($"F{Precision}")} kg"; }

    public double TareAdjustment { get; set; } = 5;
}
