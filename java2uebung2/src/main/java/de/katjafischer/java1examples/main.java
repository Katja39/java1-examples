package de.katjafischer.java1examples;

public class main {
    public static void main(String[] args) {
        Smartphone Huawei = new Smartphone("Huawei", "P30", 6.47, "Black", 497.40);
        Smartphone Apple = new Smartphone("Apple", "iphone 12", 6.1, "Red", 911.71);
        Huawei.GetStatusSmartphone(Huawei);
        Huawei.setColour("Blue");
        Huawei.GetStatusSmartphone(Huawei);
    }

}
