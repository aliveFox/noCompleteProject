package com.zwfu.fm.service.impl.system;

import com.zwfu.fm.bean.system.User;
import com.zwfu.fm.service.system.UserService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author LiSong
 * @date 2018/11/22 17:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer userId) {
        User user = new User();
        user.setUsername("李松");
        return user;
    }
}
