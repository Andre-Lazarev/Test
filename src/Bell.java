public class Bell {

    private int k = 0;

    public int sound() {
        if (k % 2 == 0) {
            System.out.println("ding");
            k++;
        } else {
            System.out.println("dong");
            k++;
        }
        return k;
    }

    public static void main(String[] args) {
        Bell bell = new Bell();
        for (int i = 1; i < 100; i++) {
            bell.sound();
        }
    }
}



