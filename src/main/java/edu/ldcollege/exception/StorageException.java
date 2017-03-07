package edu.ldcollege.exception;

/**
 * Created by shenli on 2017/2/25.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
