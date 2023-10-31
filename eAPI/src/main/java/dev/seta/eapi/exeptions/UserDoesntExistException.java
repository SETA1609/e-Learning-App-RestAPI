package dev.seta.eapi.exeptions;

public class UserDoesntExistException extends Exception {
    public UserDoesntExistException(String message) {
        super(message);
    }
}
