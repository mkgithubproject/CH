public class NotSufficientFundException extends RuntimeException {
    private String message;
    public NotSufficientFundException() {
        this.message = "You cannot withdraw , as balance is less than requested amount ";
    }
    public String getMessage() {
        return this.message;
    }
}
