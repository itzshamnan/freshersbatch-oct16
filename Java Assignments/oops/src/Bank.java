public class Bank {
    public static int amount=0;

    public static void total(int deposit) {
        amount+=deposit;
    }
    public int balance(){
        return amount;
    }

}
