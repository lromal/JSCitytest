package com.JSCity;

import java.io.File;
import java.io.IOException;

import eu.printingin3d.javascad.exceptions.IllegalValueException;
import eu.printingin3d.javascad.utils.SaveScadFiles;

public class Main {

    /**
     * @param args
     * @throws IOException
     * @throws IllegalValueException
     */
    public static void main(String[] args) throws IllegalValueException, IOException {
        new SaveScadFiles(new File(".\\target")).
                addModel("lego_brick.scad", new LegoBrick(1, 6)).
                saveScadFiles();
        System.out.println("LegoBrick was created!");
        System.out.println("You can find it in \"target\" directory");

    }
}
