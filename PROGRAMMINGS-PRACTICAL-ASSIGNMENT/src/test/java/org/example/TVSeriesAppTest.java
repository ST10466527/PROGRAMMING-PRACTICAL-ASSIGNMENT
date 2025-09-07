package org.example;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class TVSeriesAppTest {

    @Test
    public void testMainWithExitInput() {
        String simulatedInput = "x\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Just test that it doesn't crash
        TVSeriesApp.main(new String[]{});
    }
}