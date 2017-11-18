package testing;

import analysis.GitHubAPI;
import analysis.RepositoryInfo;
import org.junit.Test;

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

}