public class LoopDemo {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("and back down...");

        do {
            System.out.println(i);
            i--;
        } while(i >= 0);

        System.out.println(i);

        System.out.println("Below is the for loop");
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }
    }
}
