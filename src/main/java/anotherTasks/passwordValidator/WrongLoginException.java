package anotherTasks.passwordValidator;

public class WrongLoginException extends Exception {
    WrongLoginException() {
    }

    WrongLoginException(String message) {

        super(message);
    }
}
