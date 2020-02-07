package com.eom.openapi.util.searchConfig;

public enum Category {
    BLOG("/v1/search/blog.json"),
    MOVIE("/v1/search/movie.json");

    private String category;

    private Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
