package spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.mvc.DAO.BlogMapper;

@Service
public class BlogService {
    @Autowired
    private BlogMapper blogMapper;

    public void addBlog(String blogTitle, String blogContent){
        blogMapper.addBlog(blogTitle, blogContent);
    }
}
