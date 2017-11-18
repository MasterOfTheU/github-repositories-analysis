package testing;

import analysis.ContributorInfo;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class ContributorInfoTest {
    @Test
    public void getName() throws NoSuchFieldException, IllegalAccessException {
        ContributorInfo contributorInfo = new ContributorInfo();
        final Field field = contributorInfo.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(contributorInfo, "testName");
        String actualResult = contributorInfo.getName();
        assertEquals("testName", actualResult);
    }

    @Test
    public void getProfileURL() throws NoSuchFieldException, IllegalAccessException {
        ContributorInfo contributorInfo = new ContributorInfo();
        final Field field = contributorInfo.getClass().getDeclaredField("profileURL");
        field.setAccessible(true);
        field.set(contributorInfo, "testUrl");
        String actualResult = contributorInfo.getProfileURL();
        assertEquals("testUrl", actualResult);
    }

    @Test
    public void getAmountOfCommits() throws NoSuchFieldException, IllegalAccessException {
        ContributorInfo contributorInfo = new ContributorInfo();
        final Field field = contributorInfo.getClass().getDeclaredField("amountOfCommits");
        field.setAccessible(true);
        field.set(contributorInfo, 111);
        int actualResult = contributorInfo.getAmountOfCommits();
        assertEquals(111, actualResult);
    }

    @Test
    public void setName() throws NoSuchFieldException, IllegalAccessException {
        ContributorInfo contributorInfo = new ContributorInfo();
        contributorInfo.setName("DDD");
        final Field field = contributorInfo.getClass().getDeclaredField("name");
        field.setAccessible(true);
        assertEquals("DDD", field.get(contributorInfo));
    }

    @Test
    public void setProfileURL() throws NoSuchFieldException, IllegalAccessException {
        ContributorInfo contributorInfo = new ContributorInfo();
        contributorInfo.setProfileURL("URLLL");
        final Field field = contributorInfo.getClass().getDeclaredField("profileURL");
        field.setAccessible(true);
        assertEquals("URLLL", field.get(contributorInfo));
    }

    @Test
    public void setAmountOfCommits() throws NoSuchFieldException, IllegalAccessException {
        ContributorInfo contributorInfo = new ContributorInfo();
        contributorInfo.setAmountOfCommits(1);
        final Field field = contributorInfo.getClass().getDeclaredField("amountOfCommits");
        field.setAccessible(true);
        assertEquals(1, field.get(contributorInfo));
    }

}