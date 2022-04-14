public class InvalidStringException extends Exception{
    private String message;
    public InvalidStringException() {
        this.message = "Given input string is a Invalid string.";
    }
    public String getMessage() {
        return this.message;
    }
}
