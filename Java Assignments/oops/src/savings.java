public class savings {
    int amount=0;


    public void getAmount(int fixed) {
        amount+=fixed;
        Bank.total(amount);
    }
}
