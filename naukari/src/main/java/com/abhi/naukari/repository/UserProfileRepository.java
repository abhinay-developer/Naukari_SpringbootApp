package com.abhi.naukari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.naukari.entity.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, String>{

}
