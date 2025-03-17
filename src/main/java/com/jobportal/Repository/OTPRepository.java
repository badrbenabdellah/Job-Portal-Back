package com.jobportal.Repository;

import com.jobportal.Entity.OTP;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OTPRepository extends MongoRepository<OTP, String> {
}
