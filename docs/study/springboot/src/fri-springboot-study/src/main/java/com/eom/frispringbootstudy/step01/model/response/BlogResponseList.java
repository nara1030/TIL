package com.eom.frispringbootstudy.step01.model.response;

import java.util.ArrayList;
import java.util.List;

public class BlogResponseList {
    private List<BlogResponse> blogResponseList;

    public BlogResponseList() {
        blogResponseList = new ArrayList<>();
    }

    /*
     Resolved [org.springframework.http.converter.HttpMessageNotWritableException:
     No converter for [class com.eom.frispringbootstudy.step01.model.response.BlogResponseList]
     */
    public void setBlogResponseList(BlogResponse blogResponse) {
        blogResponseList.add(blogResponse);
    }

    public List<BlogResponse> getBlogResponseList() {
        return blogResponseList;
    }
}
