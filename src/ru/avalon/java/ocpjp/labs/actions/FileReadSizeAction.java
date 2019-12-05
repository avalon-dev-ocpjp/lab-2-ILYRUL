
package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;

/**
 *
 * @author Ilya
 */
public class FileReadSizeAction implements Action {

    /**
     * {@inheritDoc}
     */
    String filename = "C:\\Users\\Ilya\\lab2\\Exam808_SampleQuestion.pdf";
    File source = new File(filename);

    private void fileSize() {
        if (!new File(filename).exists()) {
            System.out.println("Sorry, file is not existed");
        } else {
            long bytes = source.length();
            System.out.printf("File size is: %d bytes%n", bytes);
        }
    }

    @Override
    public void run() {
        fileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {

    }
    
}
