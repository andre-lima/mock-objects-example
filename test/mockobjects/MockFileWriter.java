package mockobjects;

import mockobjects.FileWriterWrapper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ca291001
 */
public class MockFileWriter extends FileWriterWrapper {
    private String writtenData = "";
    
    public MockFileWriter() {
        super(null);
    }
    
    @Override
    public void write (String str) {
        writtenData = writtenData + str;
    }
    
    public String getWrittenData(){
        return writtenData;
    }
}