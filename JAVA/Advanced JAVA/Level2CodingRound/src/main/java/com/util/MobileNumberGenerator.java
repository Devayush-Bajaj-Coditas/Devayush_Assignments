package com.util;

import java.util.Random;

public class MobileNumberGenerator {

    public long getNewNumber() {
        Random random = new Random();
        long number = random.nextInt(1000000000);
        String finalNumber = "9" + number;
        long newNumber = Long.parseLong(finalNumber);
        return newNumber;
    }
}
