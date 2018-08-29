package spring.mvc.DAO;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select userPassword from User where userName=#{userName}")
    String selectUserByUserId(String userName);
}
