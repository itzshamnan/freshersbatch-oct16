import javax.naming.InsufficientResourcesException;

public class savings {
    //int id;
    private double balance=5000;

    public void getBalance() {
        System.out.println("Your Balance is : "+balance);
    }


    public void withdraw(double amount) throws InsufficientBalanceException,IllegalBankTransactionException {
        if( balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else if (amount<0){
            throw new IllegalBankTransactionException("Invalid Amount");
        }
        balance-=amount;
        System.out.println("Your balance after withdrawing "+amount+" is "+balance);
    }
    public static void main(String[] args) {
        savings user=new savings();
        user.getBalance();
        user.withdraw(-5300);





    }
}

