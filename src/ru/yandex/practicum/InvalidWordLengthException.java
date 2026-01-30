package ru.yandex.practicum;

public class InvalidWordLengthException extends GameException {
    public InvalidWordLengthException(String message) {
        super(message);
    }

    public InvalidWordLengthException(String message, Throwable cause) {
        super(message, cause);
    }
}
