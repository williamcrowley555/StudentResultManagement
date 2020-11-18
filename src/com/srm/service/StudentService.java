/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.service;

import com.srm.dao.IStudentDAO;
import com.srm.dao.StudentDAO;
import com.srm.model.Student;
import java.util.List;

/**
 *
 * @author HP
 */
public class StudentService implements IStudentService {
    
    private IStudentDAO studentDao;
    
    public StudentService() {
        studentDao = new StudentDAO();
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
    
}
