package com.blueice.mybatiscache;

import com.blueice.bean.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/4/25.
 */
public interface ICacheMapper {
    @Select("SELECT * FROM tb_user WHERE id = #{id}")
    public User selectById(int id);
}
