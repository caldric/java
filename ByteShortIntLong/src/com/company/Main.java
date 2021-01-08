package com.company;

public class Main {
  public static void main(String[] args) {
    // Ints
    int minInt = Integer.MIN_VALUE;
    System.out.println("Integer minimum value: " + minInt);

    int maxInt = Integer.MAX_VALUE;
    System.out.println("Integer maximum value: " + maxInt);

    // Bytes
    byte minByte = Byte.MIN_VALUE;
    System.out.println("Byte minimum value: " + minByte);

    byte maxByte = Byte.MAX_VALUE;
    System.out.println("Byte maximum value: " + maxByte);

    // Shorts
    short minShort = Short.MIN_VALUE;
    System.out.println("Short minimum value: " + minShort);

    short maxShort = Short.MAX_VALUE;
    System.out.println("Short maximum value: " + maxShort);

    // Longs
    long sampleLong = Long.valueOf(maxInt) + 2;
    System.out.println("Sample long value: " + sampleLong);

    long minLong = Long.MIN_VALUE;
    System.out.println("Long minimum value: " + minLong);

    long maxLong = Long.MAX_VALUE;
    System.out.println("Long maximum value: " + maxLong);
  }
}
