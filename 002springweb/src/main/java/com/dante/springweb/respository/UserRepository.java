package com.dante.springweb.respository;


import com.dante.springweb.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String name);

    User findByUserNameOrEmail(String email, String username);
}
