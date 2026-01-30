package ru.yandex.practicum;

public class NoSuggestionsAvailableException extends GameLogicException {
    public NoSuggestionsAvailableException(String message) {
        super(message);
    }

    public NoSuggestionsAvailableException(String message, Throwable cause) {
        super(message, cause);
    }
}
