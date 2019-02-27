package com.herohr.springStudy.dao;

import com.herohr.springStudy.models.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {
    Student queryById(long studentId);

    Student queryAll(@Param("offset") int offset, @Param("limit")int limit);

    int insertStudent(@Param("studentId") long studentId, @Param("name")String name);
}
