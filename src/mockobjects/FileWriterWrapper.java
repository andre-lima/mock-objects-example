/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockobjects;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ca291001
 */
public class FileWriterWrapper /*extends FileWriter*/ {
    private FileWriter writer;
    
    public FileWriterWrapper(FileWriter writer) {
        this.writer = writer;
    }
    
    public void write(String toWrite) throws IOException {
        writer.write(toWrite);
    }
    
}