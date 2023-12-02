package project_21000703_phanvanthanh.test;

import project_21000703_phanvanthanh.view.QLTView;

import javax.swing.UIManager;
public class Test{
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new QLTView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
