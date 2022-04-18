public class IllegalAmountException extends RuntimeException {
    private String message; // instance variable
    public IllegalAmountException(String msg) {
        // constructor
             this.message=msg;
    }
    // getMessage() function returns message for exception class
    public String getMessage() {
        return this.message;
    }
}
