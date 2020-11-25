package de.katjafischer.java1examples;

public class Smartphone {
        private String manufacturer;
        private String model;
        private double screenSize;
        private String colour;
        private double price;

        Smartphone(String manufacturer, String model, double screenSize, String colour, double price) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.screenSize = screenSize;
            this.colour = colour;
            this.price = price;
        }

        public void GetStatusSmartphone(Smartphone smartphone) {
            System.out.println(smartphone.getManufacturer() + "\n" + smartphone.getModel() + "\n"
                    + smartphone.getScreenSize() + "\n" + smartphone.getColour() + "\n" + smartphone.getPrice());
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

    }
