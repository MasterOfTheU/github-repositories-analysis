package analysis;

public class ContributorInfo {

    private String name;
    private String profileURL;
    private String email;
    private int amountOfCommits;

    public ContributorInfo(String name, String profileURL, String email, int amountOfCommits) {
        this.name = name;
        this.profileURL = profileURL;
        this.email = email;
        this.amountOfCommits = amountOfCommits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmountOfCommits() {
        return amountOfCommits;
    }

    public void setAmountOfCommits(int amountOfCommits) {
        this.amountOfCommits = amountOfCommits;
    }

    @Override
    public String toString() {
        StringBuilder contributorInfo = new StringBuilder();
        contributorInfo.append(name)
                       .append("\n\tProfile URL: ").append(profileURL)
                       .append("\n\tEmail: ").append(email)
                       .append("\n\tNumber of commits: ").append(amountOfCommits);

        return contributorInfo.toString();
    }
}
