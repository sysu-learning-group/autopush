package com.jason.autopush.auth.service;

import com.jason.autopush.auth.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @Author jason
 * @CreateTime 2020/5/19 11:06 下午
 **/
@Service
public interface CustomUserDetailService extends UserDetailsService {
    void create(User user);

    void reset(User user);

    void lock(User user, String lock);

    void unlock(User user, String unlock);

    void deleteUser(Long id);

    void resetUserPassword(User user);

    boolean lockState(Long id);

    void updateRoles(Long userId, String roles);

    void addRoles(Long userId, String roles);

    void updateUser(Long userId, User user);
}
