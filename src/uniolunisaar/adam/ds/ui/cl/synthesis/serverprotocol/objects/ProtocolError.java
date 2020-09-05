package uniolunisaar.adam.ds.ui.cl.synthesis.serverprotocol.objects;

import java.io.Serializable;

/**
 * This class serves for exchanging an Error with the server. The Error can be
 * equipped with a message.
 *
 * @author Manuel Gieseking
 */
public class ProtocolError implements Serializable {

    public static final long serialVersionUID = 0xdeadbeef00000008l;
    private final Exception ex;
    private final String msg;

    /**
     * A constructor with the Exception and message which should be exchanged
     * with the server.
     *
     * @param ex - the exceptin which should be exchanged with the server.
     * @param msg - the message to the exception which should be exchanged.
     */
    public ProtocolError(Exception ex, String msg) {
        this.ex = ex;
        this.msg = msg;
    }

    /**
     * Returns the exception which should be exchanged with the server.
     *
     * @return - the exception to exchange.
     */
    public Exception getEx() {
        return ex;
    }

    /**
     * Returns the message belonging to the exception which should be exchanged.
     *
     * @return - the message to the exception which should be exchanged.
     */
    public String getMsg() {
        return msg;
    }
}
