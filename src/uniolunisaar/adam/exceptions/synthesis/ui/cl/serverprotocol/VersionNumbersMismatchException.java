package uniolunisaar.adam.exceptions.synthesis.ui.cl.serverprotocol;

/**
 *
 * Exception is thrown when the client is outdated.
 *
 * @author Manuel Gieseking
 */
public class VersionNumbersMismatchException extends Exception {

    public static final long serialVersionUID = 0xdeadbeef00000008l;

    /**
     *
     * Delegation to the corresponding method of the class 'Exception'.
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public VersionNumbersMismatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Calls the constructor of the class 'Exception' with the message: "The
     * version numbers don't match." and the given cause.
     *
     * @param cause - see description of class 'Exception'.
     */
    public VersionNumbersMismatchException(Throwable cause) {
        super("The version numbers don't match.", cause);
    }

    /**
     *
     * Delegation to the corresponding method of the class 'Exception'.
     *
     * @param message
     * @param cause
     */
    public VersionNumbersMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     *
     * Delegation to the corresponding method of the class 'Exception'.
     *
     * @param message
     */
    public VersionNumbersMismatchException(String message) {
        super(message);
    }
    
    /**
     *
     * Creates a new exception with the message: "The version numbers don't match.".
     *
     */
    public VersionNumbersMismatchException() {
        super("The version numbers don't match.");
    }
}
