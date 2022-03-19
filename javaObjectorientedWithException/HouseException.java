public class HouseException extends Exception{
    String message;
    public HouseException() {

    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
