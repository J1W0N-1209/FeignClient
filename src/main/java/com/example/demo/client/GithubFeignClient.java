package com.example.demo.client;

import com.example.demo.dto.ContributorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "feign", url = "https://api.github.com/repos")
public interface GithubFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/{owner}/{repo}/contributors")
    List<ContributorDto> getContributors(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo
    );
}
