/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.mapper;

import com.srm.model.Student;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class StudentMapper implements RowMapper<Student>{

    @Override
    public Student mapRow(ResultSet rs) {
        try {
            Student student = new Student();
            student.setId(rs.getLong("id"));
            student.setMa_sinh_vien(rs.getLong("ho_ten"));
            student.setHo_ten(rs.getString("ho_ten"));
            student.setSo_dien_thoai(rs.getString("so_dien_thoai"));
            student.setDia_chi(rs.getString("dia_chi"));
            student.setNgay_sinh(rs.getTimestamp("ngay_sinh"));
            student.setGioi_tinh(rs.getBoolean("gioi_tinh"));
            student.setTrang_thai(rs.getBoolean("trang_thai"));
            return student;
        } catch(SQLException e) {
            return null;
        }
    }
    
}
