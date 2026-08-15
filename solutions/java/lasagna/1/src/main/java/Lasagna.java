public class Lasagna {
    int expectedMinutesInOven=40;
    int layerPreparationInMinutes=2;
    
    public int expectedMinutesInOven()
    {
        return expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int actualMinutes)
    {
        return expectedMinutesInOven-actualMinutes;
    }

    public int preparationTimeInMinutes(int numberOfLayersAdded)
    {
        return layerPreparationInMinutes*numberOfLayersAdded;
    }

    public int totalTimeInMinutes(int numberOfLayersAdded, int actualMinutes)
    {
        return preparationTimeInMinutes(numberOfLayersAdded) + actualMinutes;
    }
}
