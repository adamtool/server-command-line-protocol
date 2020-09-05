package uniolunisaar.adam.ds.synthesis.ui.cl.serverprotocol.objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import org.apache.commons.io.IOUtils;

/**
 * This class serves for exchanging files with the server. A file can be given
 * by a path and will be send as an byte array.
 *
 * @author Manuel Gieseking
 */
public class ProtocolByteFile implements Serializable {

    public static final long serialVersionUID = 0xdeadbeef00000008l;
    private byte[] file;

    /**
     * A constructor with the path to a file which should be exchanges with the
     * server.
     *
     * @param path - the path to the file which should be exchanged with the
     * server.
     * @throws IOException - thrown when opening the file failes.
     */
    public ProtocolByteFile(String path) throws IOException {
        file = IOUtils.toByteArray(new FileInputStream(path));
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
     * Set the file which should be exchanged with the server.
     *
     * @param file - the file to exchange.
     */
    public void setFile(byte[] file) {
        this.file = file;
    }
}
