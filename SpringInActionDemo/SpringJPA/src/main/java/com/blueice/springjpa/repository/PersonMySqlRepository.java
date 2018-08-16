package com.blueice.springjpa.repository;

import com.blueice.springjpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
@Component
public interface PersonMySqlRepository extends JpaRepository<Person,Integer> {
    @Override
    List<Person> findAll();
}
