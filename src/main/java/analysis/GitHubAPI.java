package analysis;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * This class provides methods for computing most starred and most committed repositories.
 */
public class GitHubAPI {
    private final String token = "1ed25ab18f61fb7baa9fa58c5a3c90e9ac0baaa1";
    private URI uri;

    public ArrayList<RepositoryInfo> getMostStarredRepos(String sinceYYYYMMDD, String untilYYYYMMDD) {
        try {
            uri = new URIBuilder()
                    .setScheme("https")
                    .setHost("api.github.com")
                    .setPath("/search/repositories")
                    .setParameter("q", "stars:10000..*")
                    .setParameter("q", "created:"+sinceYYYYMMDD+".."+untilYYYYMMDD)
                    .setParameter("sort", "stars")
                    .setParameter("order", "desc")
                    .build();

            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(uri);
            System.out.println(uri);
            httpget.setHeader("Authorization", "token " + token);
            httpget.setHeader("Accept", "application/vnd.github.v3+json");

            CloseableHttpResponse response = httpClient.execute(httpget);
            HttpEntity httpEntity = response.getEntity();

            ArrayList<RepositoryInfo> listOfStarredRepos = new OrgJSONConverter().computeMostStarredRepos(EntityUtils.toString(httpEntity));
            return listOfStarredRepos;
        }
        catch (IOException | URISyntaxException e) { e.printStackTrace(); }
        catch (JSONException e) {
            System.out.println("Objects were not found in specified period of time.");
        }

    return null;
    }

    public ArrayList<RepositoryInfo> getMostCommittedRepos(String sinceYYYYMMDD, String untilYYYYMMDD) {
        try {
            uri = new URIBuilder()
                    .setScheme("https")
                    .setHost("api.github.com")
                    .setPath("/search/repositories")
                    .setParameter("q", "created:"+sinceYYYYMMDD+".."+untilYYYYMMDD)
                    .build();

            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(uri);
            System.out.println(uri);
            httpget.setHeader("Authorization", "token " + token);
            httpget.setHeader("Accept", "application/vnd.github.v3+json");

            CloseableHttpResponse response = httpClient.execute(httpget);
            HttpEntity httpEntity = response.getEntity();

            ArrayList<RepositoryInfo> listOfCommittedRepos = new OrgJSONConverter().computeMostCommittedRepos(EntityUtils.toString(httpEntity));
            return listOfCommittedRepos;
        }
        catch (IOException | URISyntaxException e) { e.printStackTrace(); }
        catch (JSONException e) {
            System.out.println("Objects were not found in specified period of time.");
        }

        return null;
    }

}
