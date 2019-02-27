package com.herohr.springStudy.dao;

import com.herohr.springStudy.models.Appointment;
import org.apache.ibatis.annotations.Param;

public interface AppointmentDao {
    int insertAppointment(@Param("bookId") long bookId,@Param("studentId") long studentId);

    Appointment queryByKeyWithBook(@Param("bookId")long bookId, @Param("studentId")long studentId);
}
