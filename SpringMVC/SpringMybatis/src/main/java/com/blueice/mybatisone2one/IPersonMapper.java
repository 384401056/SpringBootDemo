package com.blueice.mybatisone2one;

import com.blueice.bean.Person;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface IPersonMapper {

    @Select("SELECT * FROM tb_person")
    @Results({
            //关联映射
            @Result(
                    column = "card_id",
                    property = "card",
                    //一对一关联关系,fetchType代表是立即加载(EAGER)还是懒加载(LAZY)
                    one=@One(select = "CarMapper.selectCardById",fetchType = FetchType.EAGER))
    })
    public List<Person> getAll();
}
