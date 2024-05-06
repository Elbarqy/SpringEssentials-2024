package com.elbarqy.SpringFundamentals.repos;

import com.elbarqy.SpringFundamentals.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
