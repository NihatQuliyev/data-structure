package exception;

import enums.Exceptions;

public class GeneralException extends RuntimeException{

    String message;

    public GeneralException(Exceptions exceptions) {
        super(exceptions.getMessage());
    }

    @Override
    public String getMessage() {
        return message;
    }
}
