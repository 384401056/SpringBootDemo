package com.blueice.springjpa.repository;

import com.blueice.springjpa.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
@Component
public interface PersonMongoRepository extends MongoRepository<Student,String> {

    Student findByName(String name);

    @Query("{'age':?0}")//?代表要传入的参数age.用原生的sql语句这是使用的是MongoDB的查询语句。
    List<Student> withFindByAge(String age);
}
