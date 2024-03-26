package com.emgeto.ukol9.service;

import com.emgeto.ukol9.ContributionData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;
@Service
public class IsExistContribution {


    public String isExistContribution(List<ContributionData>contributionData) {
        for (ContributionData contributionData1 : contributionData)
            if (contributionData == null) {
                contributionData1.saveToFile(contributionData);
            } else {
                if (contributionData.contains(contributionData1.getContributionId())) {
                    return "status 409(conflict)";
                } else {
                    contributionData1.saveToFile(contributionData);

                }

            }


        return "file saved";
    }
}