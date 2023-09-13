package com.sistema.exames.exceptions;

public class UserFoundException extends Exception {

    public UserFoundException() {
        super("O usuário com esse nome já está cadastrado!");
    }

    public UserFoundException(String message) {
        super(message);
    }
}
