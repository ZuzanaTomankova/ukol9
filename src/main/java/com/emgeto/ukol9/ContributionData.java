package com.emgeto.ukol9;

import java.io.*;
import java.util.List;

public class ContributionData {
    private String contribution;
    private int contributionId;
    private boolean isVisible;
    private String user;

    public ContributionData() {
    }

    public ContributionData(String contribution, int contributionId, boolean isVisible, String user) {
        this.contribution = contribution;
        this.contributionId = contributionId;
        this.isVisible = isVisible;
        this.user = user;
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

    public int getContributionId() {
        return contributionId;
    }

    public void setContributionId(int contributionId) {
        this.contributionId = contributionId;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


        public void saveToFile(List<ContributionData>contributionData) throws RuntimeException {
            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("src/main/java/com.emgeto.ukol9/resource/contributionText")))) {

                writer.println("Contribution list");
                for (ContributionData contributions : contributionData) {
                    writer.println(contributions.getContribution() + "\t"
                            + contributions.getContributionId() + "\t"
                            +contributions.isVisible() + "\t"
                            + (contributions.getUser()+ "\t"));
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException("Soubor "+"src/main/java/com.emgeto.ukol9/resource/contributionText"+" nebyl nalezen!\n"
                        + e.getLocalizedMessage());
            } catch (IOException e) {
                throw new RuntimeException("Chyba výstupu při zápisu do souboru: "+"src/main/java/com.emgeto.ukol9/resource/contributionText"
                        +":\n"+ e.getLocalizedMessage());
            }

        }


    }
