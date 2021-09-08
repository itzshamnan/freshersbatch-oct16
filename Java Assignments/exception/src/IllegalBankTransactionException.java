public class IllegalBankTransactionException extends RuntimeException
{
    private String msg;

    public IllegalBankTransactionException(String msg){
        // String-arg constructor
        this.msg=msg;
    }
    public String getMessage() {
        return msg;
    }

}
