package com.jason.autopush.auth.service.Impl;

import com.jason.autopush.auth.Exception.AuthErrorCode;
import com.jason.autopush.auth.dao.mapper.UserMapper;
import com.jason.autopush.auth.entity.RoleMapper;
import com.jason.autopush.auth.entity.Role;
import com.jason.autopush.auth.entity.User;
import com.jason.autopush.auth.service.CustomUserDetailService;
import com.jason.autopush.common.ClientRequestException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailServiceImpl implements CustomUserDetailService {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private UserMapper usersMapper;

    @Resource
    private RoleMapper rolesMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = usersMapper.selectByUsername(s);

        if (user == null)
            throw new UsernameNotFoundException(s);

        Role role = rolesMapper.selectByUserId(user.getId());
        if (role != null && StringUtils.isNotBlank(role.getRole())) {
            String[] userRoles = role.getRole().split(",");

            List<GrantedAuthority> authorities = new ArrayList<>();
            for (String userRole : userRoles) {
                SimpleGrantedAuthority r = new SimpleGrantedAuthority("ROLE_" + userRole);
                authorities.add(r);
            }

        }
    }


    @Override
    public void create(User user) {
        boolean isExisting = usersMapper.isUsernameExist(user.getUsername());
        if (isExisting == true)
            throw new ClientRequestException(AuthErrorCode.NAMEEXIST, "user already exists: " + user.getUsername());
        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);

        usersMapper.insert(user);

        log.info("new user has been created: {}", user.getUsername());
    }

    @Override
    public void reset(User user) {

    }

    @Override
    public void lock(User user, String lock) {

    }

    @Override
    public void unlock(User user, String unlock) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public void resetUserPassword(User user) {

    }

    @Override
    public boolean lockState(Long id) {
        return false;
    }

    @Override
    public void updateRoles(Long userId, String roles) {

    }

    @Override
    public void addRoles(Long userId, String roles) {

    }

    @Override
    public void updateUser(Long userId, User user) {

    }
}