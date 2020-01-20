package com.amendoza.MuralMap.repository;

import com.amendoza.MuralMap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findUserByUserName(String userName);

    User findUserByEmail(String email);
}
