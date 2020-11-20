/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.utility;

import com.srm.model.Student;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ClassTableModel {
    public DefaultTableModel setTableSinhVien(List<Student> listItem, String[] listColumn) {
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }
            
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows > 0) {
            for(int i = 0; i < rows; ++i) {
                Student student = listItem.get(i);
                obj = new Object[columns];
                obj[0] = student.getMa_sinh_vien();
                obj[1] = i + 1;
                obj[2] = student.getHo_ten();
                obj[3] = student.getNgay_sinh();
                obj[4] = student.isGioi_tinh() == true ? "Nam" : "Nữ";
                obj[5] = student.getSo_dien_thoai();
                obj[6] = student.getDia_chi();
                obj[7] = student.isTrang_thai();
                dtm.addRow(obj);
            }
        }
        return dtm;
    }
}
