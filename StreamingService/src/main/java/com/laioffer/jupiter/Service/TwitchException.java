package com.laioffer.jupiter.Service;

public class TwitchException extends RuntimeException{
    public TwitchException(String errorMessage) {
        super(errorMessage);
    }
}
