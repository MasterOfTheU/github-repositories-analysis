package testing;

import analysis.GitHubAPI;
import analysis.RepositoryInfo;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class GitHubAPITest {
    @Test
    public void getMostStarredRepos() throws Exception {
        GitHubAPI githubAPIEntity = new GitHubAPI();
        ArrayList<RepositoryInfo> repositories = githubAPIEntity.getMostStarredRepos("2014-06-02", "2014-06-10");
        assertNotNull(repositories);
    }

    @Test
    public void getMostCommittedRepos() throws Exception {
        GitHubAPI githubAPIEntity = new GitHubAPI();
        ArrayList<RepositoryInfo> repositories = githubAPIEntity.getMostCommittedRepos("2012-06-02", "2012-06-10");
        assertNotNull(repositories);
    }

    @Test
    public void uriIsValidMostCommitted() throws IOException, URISyntaxException {
        GitHubAPI githubAPIEntity = new GitHubAPI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        githubAPIEntity.getMostCommittedRepos("2000006002", "2012006*/10");
        String expected = ("https://api.github.com/search/repositories?q=created%3A2000006002..2012006*%2F10\nObjects were not found in specified period of time.");
        String actualResult = outContent.toString().trim().replace("\r","");
        assertEquals(expected, actualResult);
    }

    @Test
    public void outContentIsEmpty() throws IOException, URISyntaxException {
        GitHubAPI githubAPIEntity = new GitHubAPI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        githubAPIEntity.getMostStarredRepos("00", "2012006*/10");
        String expected = ("https://api.github.com/search/repositories?q=created%3A00..2012006*%2F10\nObjects were not found in specified period of time.");
        outContent.reset();
        assertNotEquals(expected, outContent.toString());
    }
}