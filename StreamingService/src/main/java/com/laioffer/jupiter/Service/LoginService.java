package com.laioffer.jupiter.Service;

import com.laioffer.jupiter.dao.LoginDao;
import com.laioffer.jupiter.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public String verifyLogin(String userId, String password) throws IOException {
        password = Util.encryptPassword(userId, password);
        return loginDao.verifylogin(userId, password);
    }

}

