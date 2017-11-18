package analysis;

import static analysis.Metrics.*;

public class Main {

    public static void main(String[] args){
        analyseRepositories();
    }

    public static void analyseRepositories() {
        startMetrics();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        GitHubAPI githubAPIEntity = new GitHubAPI();
        githubAPIEntity.getMostStarredRepos("2017-05-01", "2017-05-08");
        System.out.println("The information is being processed. Keep calm.");
        githubAPIEntity.getMostCommittedRepos("2016-01-01", "2016-01-08");
        printMethodName(methodName);
        stopMetrics();
        gatherPerformance(methodName);
    }

}
