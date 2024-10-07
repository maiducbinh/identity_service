package com.example.crud.exception;

public enum ErrorCode {
//    define error code and message for this specific app instead of using the existed exception's message
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Exception"),
    INVALID_KEY(1003, "Invalide message key"),
    USER_EXISTED(1002, "User already existed"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    INVALID_PASSWORD(1004, "Username must be at least 8 characters"),
    USER_NOT_EXISTED(1005, "User not existed"),
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
