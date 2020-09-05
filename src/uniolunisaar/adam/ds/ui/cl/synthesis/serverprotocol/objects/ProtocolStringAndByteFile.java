package uniolunisaar.adam.ds.ui.cl.synthesis.serverprotocol.objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import org.apache.commons.io.IOUtils;

/**
 * This class serves for sending a file and a string in once. The file can be
 * given as a path and will be send as byte array.
 *
 * @author Manuel Gieseking
 */
public class ProtocolStringAndByteFile implements Serializable {

    public static final long serialVersionUID = 0xdeadbeef00000008l;
    private final byte[] file;
    private final String str;

    /**
     * A Constructor with the path to the file and the string which should be
     * exchanged with the server. The file is given as a path to the file.
     *
     * @param path - the path to the file which should be exchanged with the
     * server.
     * @param str - the string which should be exchanged with the server.
     * @throws IOException - is thrown when reading the file from the path
     * fails.
     */
    public ProtocolStringAndByteFile(String path, String str) throws IOException {
        file = IOUtils.toByteArray(new FileInputStream(path));
        this.str = str;
    }

    /**
     * Returns the file which should be exchanged with the server.
     *
     * @return - the file to exchange.
     */
    public byte[] getFile() {
        return file;
    }

    /**
     * Returns the string which should be exchanged with the server.
     *
     * @return - the string to exchange.
     */
    public String getStr() {
        return str;
    }
}
