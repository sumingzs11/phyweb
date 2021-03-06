package com.buaabetatwo.phyweb.mapper;

import com.buaabetatwo.phyweb.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    @Select("SELECT * from users")
    List<User> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    User getById(int id);

    @Select("SELECT * FROM users WHERE email=#{email}")
    User getByEmail(String email);

    @Select("SELECT * FROM users WHERE student_id=#{student_id}")
    User getByStudentId(String student_id);

    @Insert("INSERT INTO users(name, email, student_id, password) VALUES(#{name}, #{email}, #{student_id}, #{password})")
    void insertByUser(User user);
}
