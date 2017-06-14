package com.blueice.springprofile;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2017/6/11.
 */
public interface StudentRepository extends MongoRepository<Student,String> {
    Student findByName(String name);
}
