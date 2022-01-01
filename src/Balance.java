public class Balance {

    private int right;
    private int left;

    public void addRight(int n) {
        right += n;
    }

    public void addLeft(int n) {
        left += n;
    }

    public char getSituation() {
        char ch = ' ';
        if (right == left) {
            ch = '=';
        } else if (right > left) {
            ch = 'R';
        } else ch = 'L';
        return ch;
    }

    public static void main(String[] args) {
        Balance balance = new Balance();
        balance.addLeft(11);
        balance.addRight(10);
        System.out.println(balance.getSituation());
    }
}
