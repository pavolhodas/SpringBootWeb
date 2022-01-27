package com.example.demo.Snail;

import com.example.demo.Snail.Model.SnailRepository;
import com.example.demo.Snail.Model.SnailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnailServiceImpl implements SnailService{

    @Autowired
    SnailRepository snailRepository;

    @Override
    public void saveSnailTraveller(Snail snail) {
        snailRepository.save(snail);
    }
}
