package testing;

import analysis.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testAnalyseRepositories() throws Exception {
        assertTrue(Main.analyseRepositories());

    }
}