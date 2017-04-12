/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockobjects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ca291001
 */
public class MockObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        
        FileWriterWrapper fw = new FileWriterWrapper(fileWriter);
        
        fw.write("test!!!!!!!\n");
        
        JavaGenerator.provideHeaderComment(fw);
        
        fileWriter.close();
        
    }
    
}