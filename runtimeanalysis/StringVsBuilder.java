package BridgeLabz_Java.runtimeanalysis;

class StringVsBuilder {

    public static void main(String[] args) {

        // Using String (slow due to immutability)
        long start1 = System.nanoTime();

        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i; // creates new object every time
        }

        long end1 = System.nanoTime();
        System.out.println("String Time: " + (end1 - start1));

        // Using StringBuilder (efficient)
        long start2 = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }

        long end2 = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end2 - start2));
    }
}
