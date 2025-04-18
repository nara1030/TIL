package com.eom.openapi.controller;

import com.eom.openapi.repository.response.BlogResponseList;
import com.eom.openapi.service.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/searchAPI")
public class SearchController {
    private final SearchService searchService;  // Bean + private final: 일종의 Singleton?

    SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    // 1. ResponseEntity는 HttpEntity를 상속받음으로써 HttpHeader와 Body를 가짐
    // ∴ HTTP 상태 코드를 전송하고 싶은 데이터와 전송 가능하므로 세밀한 제어 가능
    // (RestController가 Controller/ResponseBody와 다르게 별도의 View를 제공하지 않기 때문에 예외 발생 가능한데 이를 방지)
    // 2. @RequestParam(required = false)
    @GetMapping("blog")
    public ResponseEntity<BlogResponseList> searchBlogData(@RequestParam String query) {
        return searchService.search(query);
    }
}
