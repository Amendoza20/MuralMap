package com.amendoza.MuralMap.service;

import com.amendoza.MuralMap.model.User;
import com.amendoza.MuralMap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User addUser (User user) throws Exception{
        if(repository.findUserByUserName(user.getUserName()) == null){
            return repository.save(user);
        }
        throw new Exception("User already exists. Try \"updating\" instead?");
    }

    public User updateUser (String username, User user){
        User OGUser = findUserByUserName(username);
        if(user.getUserName() != null)
            OGUser.setUserName(user.getUserName());
        if(user.getFirstName() != null)
            OGUser.setFirstName(user.getFirstName());
        if(user.getLastName() != null)
            OGUser.setLastName(user.getLastName());
        if(user.getEmail() != null)
            OGUser.setEmail(user.getEmail());
        //How do we update password?
        return repository.save(user);
    }

    private User findUserByUserName(String username) {
        return repository.findUserByUserName(username);
    }
    private User findUserByEmail(String email) {
        return repository.findUserByEmail(email);
    }
}
