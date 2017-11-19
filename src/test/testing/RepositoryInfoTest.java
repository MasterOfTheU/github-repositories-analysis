package testing;

import analysis.ContributorInfo;
import analysis.RepositoryInfo;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class RepositoryInfoTest {
    @Test
    public void getName() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        final Field field = repositoryInfo.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(repositoryInfo, "testName");
        String actualResult = repositoryInfo.getName();
        assertEquals("testName", actualResult);
    }

    @Test
    public void getUrl() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        final Field field = repositoryInfo.getClass().getDeclaredField("url");
        field.setAccessible(true);
        field.set(repositoryInfo, "testUrl");
        String actualResult = repositoryInfo.getUrl();
        assertEquals("testUrl", actualResult);
    }

    @Test
    public void getDescription() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        final Field field = repositoryInfo.getClass().getDeclaredField("description");
        field.setAccessible(true);
        field.set(repositoryInfo, "testDescription");
        String actualResult = repositoryInfo.getDescription();
        assertEquals("testDescription", actualResult);
    }

    @Test
    public void getLanguage() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        final Field field = repositoryInfo.getClass().getDeclaredField("language");
        field.setAccessible(true);
        field.set(repositoryInfo, "testLanguage");
        String actualResult = repositoryInfo.getLanguage();
        assertEquals("testLanguage", actualResult);
    }

    @Test
    public void getAmountOfStars() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        final Field field = repositoryInfo.getClass().getDeclaredField("amountOfStars");
        field.setAccessible(true);
        field.set(repositoryInfo, 190);
        int actualResult = repositoryInfo.getAmountOfStars();
        assertEquals(190, actualResult);
    }

    @Test
    public void getContributors() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        final Field field = repositoryInfo.getClass().getDeclaredField("contributors");
        field.setAccessible(true);
        ArrayList<ContributorInfo> contributors = new ArrayList<>();
        contributors.add(new ContributorInfo());
        contributors.add(new ContributorInfo());
        field.set(repositoryInfo, contributors);
        ArrayList<ContributorInfo> actualResult = repositoryInfo.getContributors();
        assertEquals(contributors, actualResult);
    }

    @Test
    public void getTotalCommits() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        final Field field = repositoryInfo.getClass().getDeclaredField("totalCommits");
        field.setAccessible(true);
        field.set(repositoryInfo, 5);
        int actualResult = repositoryInfo.getTotalCommits();
        assertEquals(5, actualResult);
    }

    @Test
    public void setName() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        repositoryInfo.setName("aaaaaaaaaaaaaaaaa");
        final Field field = repositoryInfo.getClass().getDeclaredField("name");
        field.setAccessible(true);
        assertEquals("aaaaaaaaaaaaaaaaa", field.get(repositoryInfo));

    }

    @Test
    public void setUrl() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        repositoryInfo.setUrl("uuuuuuuurllllllllllll");
        final Field field = repositoryInfo.getClass().getDeclaredField("url");
        field.setAccessible(true);
        assertEquals("uuuuuuuurllllllllllll", field.get(repositoryInfo));
    }

    @Test
    public void setDescription() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        repositoryInfo.setDescription("save me");
        final Field field = repositoryInfo.getClass().getDeclaredField("description");
        field.setAccessible(true);
        assertEquals("save me", field.get(repositoryInfo));
    }

    @Test
    public void setLanguage() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        repositoryInfo.setLanguage("gibberish");
        final Field field = repositoryInfo.getClass().getDeclaredField("language");
        field.setAccessible(true);
        assertEquals("gibberish", field.get(repositoryInfo));
    }

    @Test
    public void setAmountOfStars() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        repositoryInfo.setAmountOfStars(100);
        final Field field = repositoryInfo.getClass().getDeclaredField("amountOfStars");
        field.setAccessible(true);
        assertEquals(100, field.get(repositoryInfo));
    }

    @Test
    public void setContributors() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        ArrayList<ContributorInfo> contributors = new ArrayList<>();
        contributors.add(new ContributorInfo());
        repositoryInfo.setContributors(contributors);
        final Field field = repositoryInfo.getClass().getDeclaredField("contributors");
        field.setAccessible(true);
        assertEquals(contributors, field.get(repositoryInfo));
    }

    @Test
    public void setTotalCommits() throws NoSuchFieldException, IllegalAccessException {
        RepositoryInfo repositoryInfo = new RepositoryInfo();
        repositoryInfo.setTotalCommits(40);
        final Field field = repositoryInfo.getClass().getDeclaredField("totalCommits");
        field.setAccessible(true);
        assertEquals(40, field.get(repositoryInfo));
    }

    @Test
    public void constructorIsValid() {
        RepositoryInfo repositoryInfo = new RepositoryInfo("testName", "testURL", "description","language",  12);
        assertNotNull(repositoryInfo);
    }

}