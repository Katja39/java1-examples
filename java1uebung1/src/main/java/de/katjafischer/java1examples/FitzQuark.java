package de.katjafischer.java1examples;

public class FitzQuark {

    public void count() {
        for (int currentNumber = 1; currentNumber <= 100; currentNumber++) {
            if (currentNumber % 5 == 0 && currentNumber % 7 == 0) {
                System.out.println("FitzQuark");
            }
            else if (currentNumber % 5 == 0) {
                System.out.println("Fitz");
            }
            else if (currentNumber % 7 == 0) {
                System.out.println("Quark");
            } else {
                System.out.println(currentNumber);
            }

        }
    }
}
