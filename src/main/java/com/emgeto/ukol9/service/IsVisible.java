package com.emgeto.ukol9.service;

import com.emgeto.ukol9.ContributionData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IsVisible {

    public String isVisible(List<ContributionData> contributionData) {
        for (ContributionData contributionData1 : contributionData)
            if (contributionData1.isVisible()) {
                return contributionData1.getContribution();

            }

        return "user is not visible";
    }



}
