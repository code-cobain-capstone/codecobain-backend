package com.codecobain.codecobain.repository;

import com.codecobain.codecobain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//UserRepository
public interface UserRepository extends JpaRepository<User, Long>{

}
