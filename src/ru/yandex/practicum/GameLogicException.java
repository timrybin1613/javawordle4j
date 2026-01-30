package ru.yandex.practicum;

public class GameLogicException extends GameException {
    public GameLogicException(String message) {
        super(message);
    }

    public GameLogicException(String message, Throwable cause) {
        super(message, cause);
    }
}
