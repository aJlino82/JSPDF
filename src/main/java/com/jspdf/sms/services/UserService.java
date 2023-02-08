package com.jspdf.sms.services;

import com.jspdf.sms.models.User;
import com.jspdf.sms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public <S extends User> S save(S entity) {
        return userRepository.save(entity);
    }

    public Optional<User> findById(Long aLong) {
        return userRepository.findById(aLong);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
