package calculator;

public class BadInputException extends Exception{
    public BadInputException(String error_msg) {
        super("error! : " + error_msg);
    }
}
