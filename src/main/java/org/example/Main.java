package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true, 3));
        System.out.println(hasTeen(15, 7, 80));
        System.out.println((isCatPlaying(false,35)));
        System.out.println(area(1.2, 4.5));
        System.out.println(areaCircle(2));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock <= 23 && clock >= 0){
            return clock < 20 && clock > 8 && isBarking;
        } else return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if (firstAge < 19 && firstAge > 9) {
            return true;
        } else if (secondAge < 19 && secondAge > 9) {
            return true;
        } else if (thirdAge < 19 && thirdAge > 9) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(temp <= 35 && temp >= 25 && !isSummer) {
            return true;
        } else if(isSummer && temp <= 45 && temp >= 35){
            return true;
        } else {
            return false;
        }
    }

    public static double area(double width, double height) {
        if(width <= 0 || height <= 0) {
            return -1;
        } else {
            return width * height;
        }
    }

    public static double areaCircle(double radius) {
        if(radius <= 0) {
            return -1;
        } else {
            return Math.PI * Math.sqrt(radius);
        }
    }

}
