package de.meistertos;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "socialbet", description = "...",
        mixinStandardHelpOptions = true)
public class SocialbetCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(SocialbetCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
