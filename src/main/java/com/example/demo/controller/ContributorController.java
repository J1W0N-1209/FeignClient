package com.example.demo.controller;

import com.example.demo.client.GithubFeignService;
import com.example.demo.dto.ContributorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ContributorController {
    private final GithubFeignService githubFeignService;

    @GetMapping("/v1/github/{owner}/{repo}")
    public List<ContributorDto> getContributors(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo
    ) {
        return githubFeignService.getContributor(owner, repo);
    }
}
