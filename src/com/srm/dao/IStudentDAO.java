/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.dao;

import com.srm.model.Student;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IStudentDAO extends GenericDAO<Student>{
    List<Student> findAll();
}
