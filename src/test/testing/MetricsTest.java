package testing;

import analysis.Metrics;
import org.junit.Test;

import static org.junit.Assert.*;

public class MetricsTest {
    @Test
    public void testPrintMethodName() {
        String actualResult = Thread.currentThread().getStackTrace()[1].getMethodName();
        String expected = "testPrintMethodName";
        assertEquals(expected, actualResult);
    }

    @Test
    public void testGatherPerformance() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = Metrics.gatherPerformance(methodName);
        assertTrue(result);
    }

}