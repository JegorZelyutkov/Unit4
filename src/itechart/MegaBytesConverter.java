package itechart;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid value");
            return;
        }

        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes - (megaBytes * 1024);

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
}

