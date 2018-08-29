package spring.mvc.DAO;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {

    @Insert("insert into Blog (blogTitle, blogContent) values (#{blogTitle},#{blogContent})")
    void addBlog(@Param("blogTitle") String blogTitle, @Param("blogContent") String blogContent);
}
