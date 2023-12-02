package project_21000703_phanvanthanh.view;

import project_21000703_phanvanthanh.model.QLTModel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
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
import java.awt.event.ActionEvent;

public class QLTView extends JFrame {

    private JPanel contentPane;
    QLTModel model;
    private JTextField textField_1;
    private JTable table;
    private JTextField textField_ID;
    private JTextField textField_TenNganh;
    private JTextField textField;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
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
        lable_MaNganh.setBounds(427, 57, 78, 34);
        contentPane.add(lable_MaNganh);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_1.setBounds(530, 57, 188, 35);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JButton button_TimKiem = new JButton("Tìm Kiếm");
        button_TimKiem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_TimKiem.setBounds(769, 57, 118, 35);
        contentPane.add(button_TimKiem);

        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
        comboBox.setForeground(Color.WHITE);
        comboBox.setBounds(109, 58, 267, 34);
        contentPane.add(comboBox);

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
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                },
                new String[] {
                        "STT", "M\u00E3 Ng\u00E0nh", "T\u00EAn Ng\u00E0nh", "\u0110i\u1EC3m chu\u1EA9n", "T\u00EAn Tr\u01B0\u1EDDng", "M\u00E3 Tr\u01B0\u1EDDng", "\u0110\u1ECBa Ch\u1EC9", "H\u1ECDc Ph\u00ED"
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

        textField_ID = new JTextField();
        textField_ID.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_ID.setColumns(10);
        textField_ID.setBounds(144, 416, 232, 35);
        contentPane.add(textField_ID);

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

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField.setColumns(10);
        textField.setBounds(144, 506, 232, 35);
        contentPane.add(textField);

        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_2.setColumns(10);
        textField_2.setBounds(144, 560, 232, 35);
        contentPane.add(textField_2);

        JLabel lable_DiemChuan = new JLabel("Điểm chuẩn");
        lable_DiemChuan.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_DiemChuan.setBounds(481, 416, 95, 34);
        contentPane.add(lable_DiemChuan);

        textField_3 = new JTextField();
        textField_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_3.setColumns(10);
        textField_3.setBounds(604, 415, 232, 35);
        contentPane.add(textField_3);

        JLabel lable_DiaChi = new JLabel("Địa Chỉ");
        lable_DiaChi.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_DiaChi.setBounds(481, 463, 95, 34);
        contentPane.add(lable_DiaChi);

        JLabel lable_HocPhi = new JLabel("Học Phí");
        lable_HocPhi.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lable_HocPhi.setBounds(481, 510, 95, 34);
        contentPane.add(lable_HocPhi);

        textField_4 = new JTextField();
        textField_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_4.setColumns(10);
        textField_4.setBounds(604, 461, 232, 35);
        contentPane.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        textField_5.setColumns(10);
        textField_5.setBounds(604, 506, 232, 35);
        contentPane.add(textField_5);

        JButton button_Them = new JButton("Thêm");
        button_Them.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_Them.setBounds(23, 603, 118, 35);
        contentPane.add(button_Them);

        JButton button_Xoa = new JButton("Xóa");
        button_Xoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_Xoa.setBounds(219, 603, 118, 35);
        contentPane.add(button_Xoa);

        JButton button_CapNhat = new JButton("Cập Nhật");
        button_CapNhat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button_CapNhat.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_CapNhat.setBounds(408, 603, 118, 35);
        contentPane.add(button_CapNhat);

        JButton button_HuyBo = new JButton("Hủy Bỏ");
        button_HuyBo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button_HuyBo.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_HuyBo.setBounds(812, 603, 118, 35);
        contentPane.add(button_HuyBo);

        JButton button_SapXepTheoDiem = new JButton("Sắp Xếp Theo Điểm");
        button_SapXepTheoDiem.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_SapXepTheoDiem.setBounds(221, 121, 181, 35);
        contentPane.add(button_SapXepTheoDiem);

        JButton button_SapXepTheoDiem_1 = new JButton("Sắp Xếp Theo Học Phí\r\n");
        button_SapXepTheoDiem_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_SapXepTheoDiem_1.setBounds(494, 120, 199, 35);
        contentPane.add(button_SapXepTheoDiem_1);

        JButton button_Luu = new JButton("Lưu");
        button_Luu.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button_Luu.setBounds(617, 603, 118, 35);
        contentPane.add(button_Luu);
        this.setVisible(true);
    }
}

