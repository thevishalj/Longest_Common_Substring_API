package com.vishal.lcs.repository;

import com.vishal.lcs.model.LcsOutput;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LcsRepo extends MongoRepository<LcsOutput, String> {
}
