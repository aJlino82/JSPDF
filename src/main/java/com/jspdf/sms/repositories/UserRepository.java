package com.jspdf.sms.repositories;

import com.jspdf.sms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}