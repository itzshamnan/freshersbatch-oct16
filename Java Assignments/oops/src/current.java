public class current extends Bank
{
    int amount=0;

    public void getAmount(int credit) {
        amount+=credit;
        Bank.total(amount);
    }
}
