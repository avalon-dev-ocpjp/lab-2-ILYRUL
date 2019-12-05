/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;

/**
 *
 * @author Ilya
 */
public class FileInfoAction implements Action {

    /**
     * {@inheritDoc}
     */
    String filename = "C:\\Users\\Ilya\\lab2\\Exam808_SampleQuestion.pdf";
    File source = new File(filename);

    private void fileSize() {
        if (!new File(filename).exists()) {
            System.out.println("Sorry, file is not existed");
        } else {
            String name = source.getName();
            String path = source.getAbsolutePath();
            System.out.printf("File name  is: " + name + "%nFile path is " + path + "%n");
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
