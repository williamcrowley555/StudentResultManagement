/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.controller;

import com.srm.bean.DanhMucBean;
import com.srm.view.FacultyJPanel;
import com.srm.view.HomeJPanel;
import com.srm.view.StudentJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class ViewRemoteComtroller {
    private JPanel root;
    private String kindSelected;
    private List<DanhMucBean> listItem = null;
    
    public ViewRemoteComtroller(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(0, 0, 255));
        jlbItem.setBackground(new Color(0, 0, 255));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new HomeJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
           item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
     }
}

    class LabelEvent implements MouseListener {
        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new HomeJPanel();
                    break;
                case "SinhVien":
                    node = new StudentJPanel();
                    break;
                case "Khoa":
                    node = new FacultyJPanel();
                    break;
                // more
                default:
                    break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
           setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(0, 0, 255));
            jlbItem.setBackground(new Color(0, 0, 255));
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(0, 0, 255));
            jlbItem.setBackground(new Color(0, 0, 255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                  jpnItem.setBackground(new Color(0, 176, 255));
                  jlbItem.setBackground(new Color(0, 176, 255));
            }
        }
    }
    
    private void setChangeBackground(String kind) {
        for (DanhMucBean item : listItem) {
            if(item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(0, 0, 255));
                item.getJlb().setBackground(new Color(0, 0, 255));
            } else {
                item.getJpn().setBackground(new Color(0, 176, 255));
                item.getJlb().setBackground(new Color(0, 176, 255));
            }
        }
    }
}
