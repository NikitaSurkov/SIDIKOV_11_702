package ru.itis;

public class Belarus extends Transport {

    private static int potato;

    public Belarus(String model, int fuelConsumption, int potato){
        super(model,fuelConsumption);
        this.potato = potato;
    }
    public static int getPotatoAmount() {
        return potato;
    }
}
