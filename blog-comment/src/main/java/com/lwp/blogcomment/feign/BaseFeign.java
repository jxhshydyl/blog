package com.lwp.blogcomment.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("blog-base")
public interface BaseFeign {
    @RequestMapping("")
    String getBlogAlbumCategory();

}
