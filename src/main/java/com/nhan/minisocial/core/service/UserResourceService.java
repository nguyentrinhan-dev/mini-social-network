package com.nhan.minisocial.core.service;

import com.nhan.minisocial.core.entity.User;
import com.nhan.minisocial.core.resource.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserResourceService {

    @Autowired
    private UserService userService;


    private UserResource toResource(User user){
        UserResource userResource = new UserResource();
        userResource.setId(user.getId());
        userResource.setAvatar(user.getAvatar());
        userResource.setFullname(user.getFirstname() + " " + user.getLastname());
        return userResource;
    }

    public UserResource getUser(long id){
        User user = userService.getUser(id);
        return toResource(user);
    }
}
