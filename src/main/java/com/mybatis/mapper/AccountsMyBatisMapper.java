package com.mybatis.mapper;

import com.mybatis.model.Accounts;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AccountsMyBatisMapper {
    @Select("select * from accounts")
    List<Accounts> findAll();

    @Select("SELECT * FROM accounts WHERE id = #{id}")
    Accounts findById(int id);

    @Delete("DELETE FROM accounts WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO accounts(id, username, email, createdon) " +
            " VALUES (#{id}, #{userName},#{email}, #{createdOn})")
    int insert(Accounts accounts);

    @Update("Update accounts set username=#{userName}, " +
            "email=#{email} where id=#{id}")
    int update(Accounts accounts);
}
