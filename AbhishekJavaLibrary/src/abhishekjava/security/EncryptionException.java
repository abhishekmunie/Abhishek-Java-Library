/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishekjava.security;

/**
 * Signals that an Encruption exception of some sort has occurred. This
 * class is the general class of exceptions produced by failed or
 * interrupted Encruption operations.
 * 
 * @author Abhishek
 */
public class EncryptionException extends Exception {

    /**
     * Constructs an {@code EncryptionException} with the specified cause and a
     * detail message of {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of {@code cause}).
     * This constructor is useful for Encode exceptions that are little more
     * than wrappers for other throwables.
     *
     * @param cause
     *        The cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A null value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     */
    public EncryptionException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs an {@code EncryptionException} with the specified detail message
     * and cause.
     *
     * <p> Note that the detail message associated with {@code cause} is
     * <i>not</i> automatically incorporated into this exception's detail
     * message.
     *
     * @param message
     *        The detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method)
     *
     * @param cause
     *        The cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A null value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     */
    public EncryptionException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs an {@code EncryptionException} with the specified detail message.
     *
     * @param message
     *        The detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method)
     */
    public EncryptionException(String message) {
        super(message);
    }

    /**
     * Constructs an {@code EncryptionException} with {@code null}
     * as its error detail message.
     */
    public EncryptionException() {
    }
}
