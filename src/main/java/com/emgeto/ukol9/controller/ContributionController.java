package com.emgeto.ukol9.controller;

import com.emgeto.ukol9.ContributionData;
import com.emgeto.ukol9.service.IsExistContribution;
import com.emgeto.ukol9.service.IsVisible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/contribution")
public class ContributionController {

    @PostMapping
    public ContributionData postData(@RequestBody ContributionData contributionData) {
       List<ContributionData> contributions = new ArrayList<>();
        contributions.add(contributionData);
        System.out.println(contributionData.isVisible());
        return contributionData;
    }

    @GetMapping
    public String getData (){return "data";
    }

    }




