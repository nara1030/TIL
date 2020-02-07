package com.eom.openapi.controller;

import com.eom.openapi.service.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/search")
public class SearchController {
    private final SearchService searchService;  // Bean + private final: 일종의 Singleton?

    private SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    // search/cinema?query=joker
    @GetMapping("cinema")
    public String searchData(@RequestParam String query, Model model) {
        model.addAttribute("movieResponses", searchService.searchMovie(query));
        model.addAttribute("blogResponses", searchService.searchBlog(query));
        return "cinema";
    }
}
