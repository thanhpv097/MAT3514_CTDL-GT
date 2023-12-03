package project_21000703_phanvanthanh.view;

import project_21000703_phanvanthanh.controller.QLTController;
import project_21000703_phanvanthanh.model.NganhHoc;
import project_21000703_phanvanthanh.model.QLTModel;
import project_21000703_phanvanthanh.model.TruongDH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class QLTView extends JFrame {
    public JComboBox comboBox_TenTruongTimKiem ;
    public JPanel contentPane;
    public QLTModel model;
    public JTextField textField_MaNganhDaChon;
    public JTable table;
    public JTextField textField_MaNganh;
    public JTextField textField_TenNganh;
    public JTextField textField_MaTruong;
    public JTextField textField_DiemChuan;
    public JTextField textField_DiaChi;
    public JTextField textField_HocPhi;
    public JTextField textField_TenTruong;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    QLTView frame = new QLTView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public QLTView() {
        this.model = new QLTModel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 999, 683);

        Action action = new QLTController(this);

        contentPane = new JPanel();
        contentPane.setForeground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 985, 27);
        contentPane.add(menuBar);

        JMenu menuFile = new JMenu("File");
        menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        menuBar.add(menuFile);

        JMenuItem menuOpen = new JMenuItem("Open");
        menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        menuFile.add(menuOpen);

        JMenuItem menuClose = new JMenuItem("Close");
        menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        menuFile.add(menuClose);

        JSeparator separator = new JSeparator();
        menuFile.add(separator);

        JMenuItem menuExit = new JMenuItem("Exit");
        menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        menuFile.add(menuExit);

        JMenu menuAbout = new JMenu("About");
        menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        menuBar.add(menuAbout);

        JMenuItem mntmNewMenuItem = new JMenuItem("About Me");
        mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        menuAbout.add(mntmNewMenuItem);

        JLabel lable_TenTruong = new JLabel("Tên Trường");
        lable_TenTruong.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_TenTruong.setBounds(10, 57, 89, 34);
        contentPane.add(lable_TenTruong);

        JLabel lable_MaNganh = new JLabel("Mã Ngành");
        lable_MaNganh.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_MaNganh.setBounds(390, 57, 78, 34);
        contentPane.add(lable_MaNganh);

        textField_MaNganhDaChon = new JTextField();
        textField_MaNganhDaChon.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_MaNganhDaChon.setBounds(508, 57, 158, 35);
        contentPane.add(textField_MaNganhDaChon);
        textField_MaNganhDaChon.setColumns(10);

        JButton button_TimKiem = new JButton("Tìm Kiếm");
        button_TimKiem.addActionListener(action);
        button_TimKiem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_TimKiem.setBounds(702, 57, 118, 35);
        contentPane.add(button_TimKiem);

        comboBox_TenTruongTimKiem = new JComboBox();
        comboBox_TenTruongTimKiem.addItem("");
        for(NganhHoc nganh : this.model.getDsNganhHoc()) {
            comboBox_TenTruongTimKiem.addItem(nganh.getTruong().getTenTruong());
        }
        comboBox_TenTruongTimKiem.setForeground(Color.GRAY);
        comboBox_TenTruongTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 17));
        contentPane.add(comboBox_TenTruongTimKiem);
        comboBox_TenTruongTimKiem.setBounds(109, 58, 245, 34);
        this.setVisible(true);

        Component horizontalStrut = Box.createHorizontalStrut(20);
        horizontalStrut.setBackground(Color.BLACK);
        horizontalStrut.setBounds(0, 105, 985, 6);
        contentPane.add(horizontalStrut);

        JLabel lable_dsNganhHoc = new JLabel("Danh Sách Ngành Học");
        lable_dsNganhHoc.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_dsNganhHoc.setBounds(10, 121, 169, 34);
        contentPane.add(lable_dsNganhHoc);

        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 17));
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "M\u00E3 Ng\u00E0nh", "T\u00EAn Ng\u00E0nh", "\u0110i\u1EC3m chu\u1EA9n", "M\u00E3 Tr\u01B0\u1EDDng", "T\u00EAn Tr\u01B0\u1EDDng", "\u0110\u1ECBa Ch\u1EC9", "H\u1ECDc Ph\u00ED"
                }
        ));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 165, 985, 181);
        contentPane.add(scrollPane);

        Component horizontalStrut_1 = Box.createHorizontalStrut(20);
        horizontalStrut_1.setBackground(Color.BLACK);
        horizontalStrut_1.setBounds(0, 356, 985, 6);
        contentPane.add(horizontalStrut_1);

        JLabel lable_ThongTin = new JLabel("Thông Tin Ngành Học");
        lable_ThongTin.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_ThongTin.setBounds(10, 372, 169, 34);
        contentPane.add(lable_ThongTin);

        JLabel lable_MaNganh_1 = new JLabel("Mã Ngành");
        lable_MaNganh_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_MaNganh_1.setBounds(20, 417, 95, 34);
        contentPane.add(lable_MaNganh_1);

        textField_MaNganh = new JTextField();
        textField_MaNganh.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_MaNganh.setColumns(10);
        textField_MaNganh.setBounds(144, 416, 232, 35);
        contentPane.add(textField_MaNganh);

        JLabel lable_TenNganh = new JLabel("Tên Ngành");
        lable_TenNganh.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_TenNganh.setBounds(20, 462, 95, 34);
        contentPane.add(lable_TenNganh);

        textField_TenNganh = new JTextField();
        textField_TenNganh.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_TenNganh.setColumns(10);
        textField_TenNganh.setBounds(144, 461, 232, 35);
        contentPane.add(textField_TenNganh);

        JLabel lable_MaTruong = new JLabel("Mã Trường");
        lable_MaTruong.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_MaTruong.setBounds(20, 513, 95, 34);
        contentPane.add(lable_MaTruong);

        JLabel lable_TenTruong_1_1 = new JLabel("Tên Trường");
        lable_TenTruong_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_TenTruong_1_1.setBounds(20, 557, 95, 34);
        contentPane.add(lable_TenTruong_1_1);

        textField_MaTruong = new JTextField();
        textField_MaTruong.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_MaTruong.setColumns(10);
        textField_MaTruong.setBounds(144, 506, 232, 35);
        contentPane.add(textField_MaTruong);

        JLabel lable_DiemChuan = new JLabel("Điểm chuẩn");
        lable_DiemChuan.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_DiemChuan.setBounds(481, 416, 95, 34);
        contentPane.add(lable_DiemChuan);

        textField_DiemChuan = new JTextField();
        textField_DiemChuan.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_DiemChuan.setColumns(10);
        textField_DiemChuan.setBounds(604, 415, 232, 35);
        contentPane.add(textField_DiemChuan);

        JLabel lable_DiaChi = new JLabel("Địa Chỉ");
        lable_DiaChi.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_DiaChi.setBounds(481, 463, 95, 34);
        contentPane.add(lable_DiaChi);

        JLabel lable_HocPhi = new JLabel("Học Phí");
        lable_HocPhi.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_HocPhi.setBounds(481, 510, 95, 34);
        contentPane.add(lable_HocPhi);

        textField_DiaChi = new JTextField();
        textField_DiaChi.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_DiaChi.setColumns(10);
        textField_DiaChi.setBounds(604, 461, 232, 35);
        contentPane.add(textField_DiaChi);

        textField_HocPhi = new JTextField();
        textField_HocPhi.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_HocPhi.setColumns(10);
        textField_HocPhi.setBounds(604, 506, 232, 35);
        contentPane.add(textField_HocPhi);

        JButton button_Them = new JButton("Thêm");
        button_Them.addActionListener(action);
        button_Them.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_Them.setBounds(23, 603, 118, 35);
        contentPane.add(button_Them);

        JButton button_Xoa = new JButton("Xóa");
        button_Xoa.addActionListener(action);
        button_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_Xoa.setBounds(219, 603, 118, 35);
        contentPane.add(button_Xoa);

        JButton button_CapNhat = new JButton("Cập Nhật");
        button_CapNhat.addActionListener(action);
        button_CapNhat.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_CapNhat.setBounds(408, 603, 118, 35);
        contentPane.add(button_CapNhat);

        JButton button_HuyBo = new JButton("Hủy Bỏ");
        button_HuyBo.addActionListener(action);
        button_HuyBo.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_HuyBo.setBounds(812, 603, 118, 35);
        contentPane.add(button_HuyBo);

        JButton button_SapXepTheoDiem = new JButton("Sắp Xếp Theo Điểm");
        button_SapXepTheoDiem.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_SapXepTheoDiem.setBounds(221, 121, 220, 35);
        contentPane.add(button_SapXepTheoDiem);

        JButton button_SapXepTheoDiem_1 = new JButton("Sắp Xếp Theo Học Phí\r\n");
        button_SapXepTheoDiem_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_SapXepTheoDiem_1.setBounds(494, 120, 224, 35);
        contentPane.add(button_SapXepTheoDiem_1);

        JButton button_Luu = new JButton("Lưu");
        button_Luu.addActionListener(action);
        button_Luu.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_Luu.setBounds(617, 603, 118, 35);
        contentPane.add(button_Luu);

        textField_TenTruong = new JTextField();
        textField_TenTruong.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_TenTruong.setColumns(10);
        textField_TenTruong.setBounds(144, 557, 232, 35);
        contentPane.add(textField_TenTruong);

        JButton button_HuyTimKiem = new JButton("Hủy Tìm Kiếm");
        button_HuyTimKiem.addActionListener(action);
        button_HuyTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_HuyTimKiem.setBounds(838, 57, 137, 35);
        contentPane.add(button_HuyTimKiem);
    }
    public void xoaFrom() {
        textField_MaNganh.setText("");
        textField_TenNganh.setText("");
        textField_MaTruong.setText("");
        textField_DiaChi.setText("");
        textField_DiemChuan.setText("");
        textField_TenTruong.setText("");
        textField_HocPhi.setText("");
    }

    public void themHoacCapNhatNganhHoc(NganhHoc nganh) {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        if(!this.model.kiemTraTonTai(nganh)) {
            this.model.insert(nganh);
            modelTable.addRow(new Object[] {
                    nganh.getMaNganh(),
                    nganh.getTenNganh(),
                    nganh.getDiemChuan() + "",
                    nganh.getTruong().getMaTruong() + "",
                    nganh.getTruong().getTenTruong() + "",
                    nganh.getTruong().getDiaChi() + "",
                    nganh.getHocPhi() + ""});
        } else {
            this.model.update(nganh);
            int soLuongDong = modelTable.getRowCount();
            for(int i = 0; i < soLuongDong; i++) {
                String maNganh = modelTable.getValueAt(i, 0) + "";
                if(maNganh.equals(nganh.getMaNganh() + "")) {
                    modelTable.setValueAt(nganh.getMaNganh() + "", i, 0);
                    modelTable.setValueAt(nganh.getTenNganh() + "", i, 1);
                    modelTable.setValueAt(nganh.getDiemChuan() + "", i, 2);
                    modelTable.setValueAt(nganh.getTruong().getMaTruong() + "", i, 3);
                    modelTable.setValueAt(nganh.getTruong().getTenTruong() + "", i, 4);
                    modelTable.setValueAt(nganh.getTruong().getDiaChi() + "", i, 5);
                    modelTable.setValueAt(nganh.getHocPhi() + "", i, 6);

                }
            }

        }
    }
    public NganhHoc getNganhHocDangChon() {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        int indexRow = table.getSelectedRow();

        String maNganh = modelTable.getValueAt(indexRow, 0) + "";
        String tenNganh = modelTable.getValueAt(indexRow, 1) + "";
        double diemChuan = Double.valueOf(modelTable.getValueAt(indexRow, 2) + "");
        String maTruong = TruongDH.getTruongTheoMa(modelTable.getValueAt(indexRow, 3) + "");
        String tenTruong = TruongDH.getTruongTheoTen(modelTable.getValueAt(indexRow, 4) + "");
        String diaChi = TruongDH.getTruongTheoDC(modelTable.getValueAt(indexRow, 5) + "");
        long hocPhi = Long.valueOf((String) modelTable.getValueAt(indexRow, 6));
        TruongDH truong = new TruongDH(maTruong, tenTruong, diaChi);
        NganhHoc nganh = new NganhHoc(maNganh, tenNganh, truong, hocPhi, diemChuan);
        return nganh;
    }
    public void hienThiThongTinNganhDaChon() {
        NganhHoc nganh = getNganhHocDangChon();

        this.textField_MaNganh.setText(nganh.getMaNganh());
        this.textField_TenNganh.setText(nganh.getTenNganh());
        this.textField_DiemChuan.setText(nganh.getDiemChuan() + "");
        this.textField_MaTruong.setText(nganh.getTruong().getMaTruong());
        this.textField_TenTruong.setText(nganh.getTruong().getTenTruong() + "");
        this.textField_DiaChi.setText(nganh.getTruong().getDiaChi() + "");
        this.textField_HocPhi.setText(nganh.getHocPhi() + "");
    }

    public void thucHienXoa() {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        int indexRow = table.getSelectedRow();
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa không ?");
        if(luaChon == JOptionPane.YES_OPTION) {
            NganhHoc nganh = getNganhHocDangChon();
            this.model.delete(nganh);
            modelTable.removeRow(indexRow);
        }
    }

    public void thucHienThemNganh() {
        String maNganh = this.textField_MaNganh.getText() + "";
        String tenNganh = this.textField_TenNganh.getText();
        String maTruong = this.textField_MaTruong.getText();
        String tenTruong = this.textField_TenTruong.getText();
        String diaChi = this.textField_DiaChi.getText();
        TruongDH truong = new TruongDH(maTruong, tenTruong, diaChi);
        long hocPhi = Long.valueOf(this.textField_HocPhi.getText());
        double diemChuan = Double.valueOf(this.textField_DiemChuan.getText());

        NganhHoc nganh = new NganhHoc(maNganh, tenNganh, truong, hocPhi, diemChuan);
        this.themHoacCapNhatNganhHoc(nganh);
    }

    public void thucHienTim() {
        int indexTruong = this.comboBox_TenTruongTimKiem.getSelectedIndex() - 1;
        String maNganhDaChon = this.textField_MaNganhDaChon.getText();
        String tenTruongDaChon = (String) comboBox_TenTruongTimKiem.getSelectedItem();
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        int soLuongDong = modelTable.getRowCount();
        boolean tonTai = false;
        if(indexTruong >= 0) {
            for(int i = 0; i < soLuongDong; i++) {
                String tenTruong = modelTable.getValueAt(i, 4) + "";
                if(tenTruong.equals(tenTruongDaChon)) {
                    tonTai = true;
                }

            }
        }
        if(maNganhDaChon.length() > 0) {
            for(int i = 0; i < soLuongDong; i++) {
                String maNganh = modelTable.getValueAt(i, 0) + "";
                if(maNganh.equals(maNganhDaChon)) {
                    tonTai = true;
                }
            }
        }
        if(!tonTai) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy ngành học", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void thucHienHuyTimKiem() {

    }
}

