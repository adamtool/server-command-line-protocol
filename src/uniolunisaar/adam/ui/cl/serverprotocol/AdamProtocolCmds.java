package uniolunisaar.adam.ui.cl.serverprotocol;

/**
 * Specifies the possible commands the server can handle.
 *
 * @author Manuel Gieseking
 */
public enum AdamProtocolCmds {

    ERROR,
    ACCEPTANCE,
    TEXT,
    RESULT,
    CLOSE,
    CONV_PG2DOT,
    CONV_PG2PDF,
    CONV_PG2TIKZ,
    GEN_CM,
    GEN_DW,
    GEN_JP,
    GEN_PHIL,
    GEN_SR,
    GEN_WD,
    GEN_SS,
    GEN_CT,
    SOL_EXWIN,
    SOL_STRAT,
}
