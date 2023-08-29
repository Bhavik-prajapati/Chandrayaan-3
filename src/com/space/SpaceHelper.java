package com.space;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SpaceHelper {

    @Test
    void testSpacecraft() {
        SpaceCraft spc = new SpaceCraft(0, 0, 0, 'N');
        char[] cmds = {'f', 'r', 'u', 'b', 'l'};
        spc.executeCommands(cmds);
        String expectedOutput = "Final Position: (-1, 1, 1)\n" +
                                "Final Direction: N";
        String actualOutput = spc.printFinalAnswer();
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testSpacecraft2() {
        SpaceCraft spc = new SpaceCraft(0, 0, 0, 'N');
        char[] cmds = {'f', 'r', 'u','l'};
        spc.executeCommands(cmds);
        String expectedOutput = "Final Position: (0, 1, 1)\n" +
                                "Final Direction: N";
        String actualOutput = spc.printFinalAnswer();
        assertEquals(expectedOutput, actualOutput);
    }
    	
    @Test
    void testSpacecraft3() {
        SpaceCraft spc = new SpaceCraft(0, 0, 0, 'N');
        char[] cmds = {'f', 'r'};
        spc.executeCommands(cmds);
        String expectedOutput = "Final Position: (0, 1, 0)\n" +
                                "Final Direction: E";
        String actualOutput = spc.printFinalAnswer();
        assertEquals(expectedOutput, actualOutput);
    }
}
