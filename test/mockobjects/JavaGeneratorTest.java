/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockobjects;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ca291001
 */
public class JavaGeneratorTest {
    
    public JavaGeneratorTest() {
    }

    @Test
    public void testProvideHeaderComment() throws Exception {
        MockFileWriter mfw = new MockFileWriter();
        
        JavaGenerator.provideHeaderComment(mfw);
        
        String expectedResult = "/*\n * This file was generated with the PerGen tool.\n * This code is free to use and distribute.\n */\n\n";
        assertEquals(expectedResult, mfw.getWrittenData());

    }

    @Test
    public void testProvidePackageDeclaration() throws Exception {

    }

    @Test
    public void testProvideClassDeclaration() throws Exception {

    }

    @Test
    public void testProvideDefaultConstructor() throws Exception {

    }

    @Test
    public void testProvidePOJOsIdGetterSetter() throws Exception {

    }

    @Test
    public void testProvideClassEnd() throws Exception {

    }

    @Test
    public void testProvideDAOsImports() throws Exception {

    }
    
}