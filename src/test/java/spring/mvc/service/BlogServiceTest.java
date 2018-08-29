package spring.mvc.service;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BlogServiceTest {


    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BlogService blogService = (BlogService) context.getBean("blogService");
        blogService.addBlog("aaa","bbb");

    }

}
