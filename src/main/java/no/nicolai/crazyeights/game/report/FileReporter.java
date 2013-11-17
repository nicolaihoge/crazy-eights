package no.nicolai.crazyeights.game.report;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileReporter extends Reporter {

    public FileReporter(String fileName) throws IOException {
        super(new BufferedWriter(new FileWriter(fileName)));
    }
}
