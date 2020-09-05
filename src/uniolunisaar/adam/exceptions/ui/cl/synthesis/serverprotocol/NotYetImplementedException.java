package uniolunisaar.adam.exceptions.ui.cl.synthesis.serverprotocol;

/**
 * Exception for stating that a given command is not yet implemented on the
 * server.
 *
 * @author Manuel Gieseking
 */
public class NotYetImplementedException extends Exception {

    public static final long serialVersionUID = 0xdeadbeef00000008l;
    private final String cmd;

    /**
     * Calls the corresponding constructor of the class 'Exception'. It also
     * saves the currently not yet implemented command 'cmd'.
     *
     * @param cmd - the not yet implemented command.
     * @param message - see description of class 'Exception'.
     * @param cause - see description of class 'Exception'.
     * @param enableSuppression - see description of class 'Exception'.
     * @param writableStackTrace - see description of class 'Exception'.
     */
    public NotYetImplementedException(String cmd, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.cmd = cmd;
    }

    /**
     * Calls the corresponding constructor of the class 'Exception' with the
     * message that the given command is not yet implemented on the server.
     *
     * @param cmd - the not yet implemented command.
     * @param cause - see description of class 'Exception'.
     */
    public NotYetImplementedException(String cmd, Throwable cause) {
        super("'" + cmd + "' is not yet implemented on the server.", cause);
        this.cmd = cmd;
    }

    /**
     * Calls the corresponding constructor of the class 'Exception'. It also
     * saves the not yet implemented command 'cmd'.
     *
     * @param cmd - the not yet implemented command.
     * @param message - see description of class 'Exception'.
     * @param cause - see description of class 'Exception'.
     */
    public NotYetImplementedException(String cmd, String message, Throwable cause) {
        super(message, cause);
        this.cmd = cmd;
    }

    /**
     * Calls the corresponding constructor of the class 'Exception'. It also
     * saves the not yet implemented command 'cmd'.
     *
     * @param cmd - the not yet implemented command.
     * @param message - see description of class 'Exception'.
     */
    public NotYetImplementedException(String cmd, String message) {
        super(message);
        this.cmd = cmd;
    }

    /**
     * Calls the corresponding constructor of the class 'Exception' with the
     * message that the given command is not yet implemented on the server. It
     * also saves the not yet implemented command 'cmd'.
     *
     *
     * @param cmd - the not yet implemented command.
     */
    public NotYetImplementedException(String cmd) {
        super("'" + cmd + "' is not yet implemented on the server.");
        this.cmd = cmd;
    }

    /**
     * Returns the not yet implemeted command.
     *
     * @return - the not yet implemented command.
     */
    public String getCmd() {
        return cmd;
    }
}
