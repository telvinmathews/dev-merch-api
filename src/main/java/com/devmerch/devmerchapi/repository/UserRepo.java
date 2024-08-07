package com.devmerch.devmerchapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devmerch.devmerchapi.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
