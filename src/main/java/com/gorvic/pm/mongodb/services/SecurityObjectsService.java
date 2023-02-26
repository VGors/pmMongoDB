package com.gorvic.pm.mongodb.services;

import com.gorvic.pm.mongodb.repositories.SecurityObjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
//@EnableMongoRepositories

public class SecurityObjectsService {
    private final SecurityObjectRepository securityObjectRepository;
}