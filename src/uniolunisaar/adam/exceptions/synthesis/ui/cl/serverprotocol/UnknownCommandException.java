package uniolunisaar.adam.exceptions.synthesis.ui.cl.serverprotocol;

/**
 * Exception stating that the given command is not known to the server.
 *
 * @author Manuel Gieseking
 */
public class UnknownCommandException extends Exception {

    public static final long serialVersionUID = 0xdeadbeef00000008l;
    private final String cmd;

    /**
     * Calls the corresponding constructor of the class 'Exception' with setting
     * the unknown command.
     *
     * @param cmd - the unknown command.
     * @param message - see description of class 'Exception'.
     * @param cause - see description of class 'Exception'.
     * @param enableSuppression - see description of class 'Exception'.
     * @param writableStackTrace - see description of class 'Exception'.
     */
    public UnknownCommandException(String cmd, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.cmd = cmd;
    }

    /**
     * Calls the corresponding constructor of the class 'Exception' with the
     * message stating that the given command is unknown to the server. It also
     * saves the unknown command.
     *
     * @param cmd - the unknown command.
     * @param cause - see description of class 'Exception'.
     */
    public UnknownCommandException(String cmd, Throwable cause) {
        super("'" + cmd + "' is not a suitable command and is not known to the server.", cause);
        this.cmd = cmd;
    }

    /**
     * Calls the corresponding constructor of the class 'Exception'. It also
     * saves the unknown command.
     *
     * @param cmd - the unknown command.
     * @param message - see description of class 'Exception'.
     * @param cause - see description of class 'Exception'.
     */
    public UnknownCommandException(String cmd, String message, Throwable cause) {
        super(message, cause);
        this.cmd = cmd;
    }

    /**
     * Calls the corresponding constructor of the class 'Exception'. It also
     * saves the unknown command.
     *
     * @param cmd - the unknown command.
     * @param message - see description of class 'Exception'.
     */
    public UnknownCommandException(String cmd, String message) {
        super(message);
        this.cmd = cmd;
    }

    /**
     * Calls the corresponding constructor of the class 'Exception' with the
     * message stating that the given command is unknown to the server. It also
     * saves the unknown command.
     *
     * @param cmd - the unknown command.
     */
    public UnknownCommandException(String cmd) {
        super("'" + cmd + "' is not a suitable command and is not known to the server.");
        this.cmd = cmd;
    }

    /**
     * Returns the command which is not known to the server.
     *
     * @return - the unknown command.
     */
    public String getCmd() {
        return cmd;
    }
}
