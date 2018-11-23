package com.zwfu.fm.service.system;

import com.zwfu.fm.bean.system.User;

/**
 * TODO
 *
 * @author LiSong
 * @date 2018/11/22 17:08
 */
public interface UserService {

    /**
     * 根据用户id获取用户数据
     * @param userId
     * @return user
     * @author LiSong
     * @date 2018-11-22 17:10:13
     */
    User getUserById(Integer userId);

}
