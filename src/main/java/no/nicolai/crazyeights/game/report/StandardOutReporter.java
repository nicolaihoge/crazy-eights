package no.nicolai.crazyeights.game.report;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class StandardOutReporter extends Reporter {

    public StandardOutReporter() {
        super(new BufferedWriter(new OutputStreamWriter(System.out)));
    }
}
