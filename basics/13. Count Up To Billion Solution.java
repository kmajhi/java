public class CountUpToBillion {
    public static void main(String[] args) {
        int limit = 1_000_000_000;

        for (int i = 1; i <= limit; i++) {
            System.out.println(i);

            // Optional: Add a delay to slow down the printing (for demonstration purposes)
            // You may need to adjust the delay based on your system and preferences.
            try {
                Thread.sleep(1); // Sleep for 1 millisecond
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
