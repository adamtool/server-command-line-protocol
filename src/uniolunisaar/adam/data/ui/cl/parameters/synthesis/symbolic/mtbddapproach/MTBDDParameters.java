package uniolunisaar.adam.data.ui.cl.parameters.synthesis.symbolic.mtbddapproach;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import uniolunisaar.adam.exceptions.pnwt.CouldNotFindSuitableConditionException;
import uniolunisaar.adam.exceptions.pnwt.NetNotSafeException;
import uniolunisaar.adam.exceptions.pg.NoSuitableDistributionFoundException;
import uniolunisaar.adam.exceptions.pg.ParameterMissingException;
import uniolunisaar.adam.exceptions.pg.NotSupportedGameException;
import uniolunisaar.adam.exceptions.pg.SolvingException;
import uniolunisaar.adam.symbolic.mtbdd.solver.MTBDDSolverOptions;
import uniolunisaar.adam.data.ui.cl.parameters.synthesis.SpecificSolverParameters;
import uniolunisaar.adam.data.ui.cl.parameters.synthesis.symbolic.SymbolicSolverParameters;
import uniolunisaar.adam.logic.ui.cl.modules.synthesis.solver.symbolic.mtbddapproach.MTBDDSolverHandle;

/**
 *
 * @author Manuel
 */
public class MTBDDParameters extends SpecificSolverParameters {

    @Override
    public Map<String, Option> createOptions() {
        Map<String, Option> options = new HashMap<>();
      
        // For the different game outputs
        options.putAll(SymbolicSolverParameters.createOptions());

        return options;
    }

    @Override
    protected MTBDDSolverHandle createSolverHandle(String input, boolean skip, String name, String parameterLine) throws ParseException, uniol.apt.io.parser.ParseException, IOException, NotSupportedGameException, NetNotSafeException, NoSuitableDistributionFoundException, CouldNotFindSuitableConditionException, ParameterMissingException, SolvingException {
        return new MTBDDSolverHandle(input, skip, name, this, parameterLine);
    }

    // DELEGATES
    public boolean createGraphGame(CommandLine line) {
        return SymbolicSolverParameters.createGraphGame(line);
    }

    public boolean createGraphGameStrategy(CommandLine line) {
        return SymbolicSolverParameters.createGraphGameStrategy(line);
    }

    public boolean createPetriGameStrategy(CommandLine line) {
        return SymbolicSolverParameters.createPetriGameStrategy(line);
    }

    public void setMTBDDParameters(MTBDDSolverOptions options, CommandLine line) throws ParseException {
        options.setGg(SymbolicSolverParameters.createGraphGame(line));
        options.setGgs(SymbolicSolverParameters.createGraphGameStrategy(line));
        options.setGgs(SymbolicSolverParameters.createPetriGameStrategy(line));
    }

}