package com.eom.frispringbootstudy.step01.model.response;

import lombok.Getter;
import lombok.Setter;

public class BlogResponse {
    private String title;
    private String link;
    private String bloggerName;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setBloggerName(String bloggerName) {
        this.bloggerName = bloggerName;
    }
}
