package project_21000703_phanvanthanh.controller;
import project_21000703_phanvanthanh.view.QLTView;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;


public class QLTController implements Action{
    QLTView view;

    public QLTController(QLTView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionComand = e.getActionCommand();
        //JOptionPane.showMessageDialog(view, "bạn vừa nhấn vào: " + actionComand);
        if(actionComand.equals("Thêm")) {
            this.view.xoaFrom();
            this.view.model.setLuaChon("Thêm");
        } else if(actionComand.equals("Lưu")) {
            try {
                this.view.thucHienThemNganh();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if(actionComand.equals("Cập Nhật")) {
            this.view.hienThiThongTinNganhDaChon();
        } else if(actionComand.equals("Xóa")) {
            this.view.thucHienXoa();
        } else if(actionComand.equals("Hủy Bỏ")) {
            this.view.xoaFrom();
        } else if(actionComand.equals("Tìm Kiếm")) {
            this.view.thucHienTim();
        } else if(actionComand.equals("Hủy Tìm Kiếm")) {
            this.view.thucHienHuyTimKiem();
        }
    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }

}
