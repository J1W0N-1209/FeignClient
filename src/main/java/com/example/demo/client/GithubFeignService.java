package com.example.demo.client;

import com.example.demo.dto.ContributorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GithubFeignService {
    private final GithubFeignClient githubFeignClient;

    public List<ContributorDto> getContributor(String owner, String repo) {
        List<ContributorDto> contributorDtos = githubFeignClient.getContributors(owner, repo);
        return contributorDtos;
    }
}
