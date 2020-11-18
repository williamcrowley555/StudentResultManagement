/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.dao;

import com.srm.mapper.StudentMapper;
import com.srm.model.Student;
import java.util.List;

/**
 *
 * @author HP
 */
public class StudentDAO extends AbstractDAO<Student> implements IStudentDAO {

    @Override
    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        return query(sql, new StudentMapper());
    }
    
}
