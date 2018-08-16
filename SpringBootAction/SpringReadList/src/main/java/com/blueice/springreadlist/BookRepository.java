package com.blueice.springreadlist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 定义仓库接口.继承自JpaRepository接口，自身已经有18个方法了。
 * Created by Administrator on 2017/6/10.
 */
//<Book,Long> 指明了王仓库操作的对象类型和ID的属性
public interface BookRepository extends JpaRepository<Book,Long> {


    List<Book> findByReader(String reader);


}
