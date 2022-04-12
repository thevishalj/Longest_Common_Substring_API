package com.vishal.lcs.repository;

import com.vishal.lcs.model.LcsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LcsRepo extends MongoRepository<LcsModel, String> {
}
