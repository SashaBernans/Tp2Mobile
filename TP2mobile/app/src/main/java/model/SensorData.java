package model;

public class SensorData{
    SensorID id = SensorID.TEMPERATURE_ID;

    SensorValue[] values;


    public SensorData(SensorID id,
                      SensorValue[] values)
    {
        this.values= values;
        this.id= id;
    }

    public SensorValue[] getValues()
    {
        return values;
    }
    public SensorID getId()
    {
        return id;
    }
}
