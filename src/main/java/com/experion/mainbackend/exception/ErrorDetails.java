package com.experion.mainbackend.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDetails {
    private String message;

    public ErrorDetails(String message) {
    }
}
