package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.service.BlogService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Resource
    private BlogService blogService;

    @RequestMapping("/newBlog")
    public void postBlog(

            @RequestParam("blogTitle") String blogTitle,
            @RequestParam("blogContext") String blogContext,
            HttpServletResponse response
    ) throws IOException {
        boolean validTitle = blogTitle.length() > 0 && blogTitle.length() < 21;
        boolean validContext = blogContext.length() > 0 && blogContext.length() < 101;

        if (validTitle && validContext) {
            blogService.addBlog(blogTitle, blogContext);
            response.setStatus(200);
            response.getWriter().write("博客保存成功");

        } else {
            response.setStatus(400);
            response.getWriter().write("Error！博客保存失败,博客标题不能为空且不能超过20个英文字符,博客内容不能为空且不能超过100个英文字符");
        }


    }

}
