public class IllegalAmountException extends RuntimeException {
    private String message;
    public IllegalAmountException() {
        this.message = "You cannot deposite , requested amount should be greater than zero.";
    }
    public String getMessage() {
        return this.message;
    }
}
