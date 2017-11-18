package analysis;

import java.util.ArrayList;

public class RepositoryInfo {

    private String name;
    private String url;
    private String description;
    private String language;
    private int amountOfStars;
    private int amountOfCommits;
    private ArrayList<ContributorInfo> contributors;

    public RepositoryInfo(String name, String url, String description, String language, int amountOfStars, int amountOfCommits) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.language = language;
        this.amountOfStars = amountOfStars;
        this.amountOfCommits = amountOfCommits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAmountOfStars() {
        return amountOfStars;
    }

    public void setAmountOfStars(int amountOfStars) {
        this.amountOfStars = amountOfStars;
    }

    public int getAmountOfCommits() {
        return amountOfCommits;
    }

    public void setAmountOfCommits(int amountOfCommits) {
        this.amountOfCommits = amountOfCommits;
    }

    public ArrayList<ContributorInfo> getContributors() {
        return contributors;
    }

    public void setContributors(ArrayList<ContributorInfo> contributors) {
        this.contributors = contributors;
    }

    @Override
    public String toString() {
        StringBuilder repositoryInfo = new StringBuilder();
        repositoryInfo.append("Repository name: ").append(name.toUpperCase())
                                                  .append("\n\tURL: ").append(url)
                                                  .append("\n\tDescription: ").append(description)
                                                  .append("\n\tLanguage: ").append(language)
                                                  .append("\n\tStars: ").append(amountOfStars)
                                                  .append("\n\tNumber of commits: ").append(amountOfCommits)
                                                  .append("\n\tTop contributors: ").append(contributors);

        return repositoryInfo.toString();
    }
}
