package uniolunisaar.adam.exceptions.ui.cl.synthesis;

import org.apache.commons.cli.ParseException;

/**
 *
 * @author Manuel Gieseking
 */
public class NoSuitableSolverException extends ParseException {

    private static final long serialVersionUID = 1L;

    public NoSuitableSolverException(String message) {
        super("'" + message + "' defines no suitable solver.");
    }
}
