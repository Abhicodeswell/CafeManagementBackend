package com.inn.cafe.dao;

import com.inn.cafe.POJO.User;
import com.inn.cafe.wrapper.UserWrapper;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    User findEmailById(@Param("email") String email);


@Transactional
@Modifying
Integer updateStatus(@Param("status") String status,@Param("id") Integer id);


    List<UserWrapper> getAllUser();

    List<String> getAllAdmin();
}
