package spring.mvc.service;


import org.springframework.stereotype.Service;
import spring.mvc.DAO.UserMapper;

import javax.annotation.Resource;

@Service
public class LoginService {
    @Resource
    private UserMapper userMapper;

    public boolean isValidUser(String userName, String password){
        String userPassword = userMapper.selectUserByUserId(userName);
        if(userPassword != null && userPassword.equals(password)){
            return true;
        }
        return false;
    }
}
