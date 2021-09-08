public class InsufficientBalanceException extends RuntimeException{
    private String msg;

    public InsufficientBalanceException(String msg){
        // String-arg constructor
        this.msg=msg;
    }
    /*public InsufficientBalanceException(Throwable cause, String message) {
        super(cause);
        this.msg = msg;
    }*/

    public String getMessage() {
        return msg;
    }

}
