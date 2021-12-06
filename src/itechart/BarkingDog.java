package itechart;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
        if (hourOfTheDay < 0 || hourOfTheDay > 23) {
            return false;
        } else return barking && (hourOfTheDay < 8 || hourOfTheDay > 22);
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 8));
    }
}
