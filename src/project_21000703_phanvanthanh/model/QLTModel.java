package project_21000703_phanvanthanh.model;

import java.util.ArrayList;

public class QLTModel {
    private ArrayList<NganhHoc> dsNganhHoc;
    private String luaChon;

    public QLTModel() {
        this.dsNganhHoc = new ArrayList<NganhHoc>();
        this.luaChon = "";
    }
    public QLTModel(ArrayList<NganhHoc> dsNganhHoc) {
        this.dsNganhHoc = dsNganhHoc;
    }
    public ArrayList<NganhHoc> getDsNganhHoc() {
        return dsNganhHoc;
    }
    public void setDsNganhHoc(ArrayList<NganhHoc> dsNganhHoc) {
        this.dsNganhHoc = dsNganhHoc;
    }
    public void insert(NganhHoc nganhHoc) {
        this.dsNganhHoc.add(nganhHoc);
    }
    public void delete(NganhHoc nganhHoc) {
        this.dsNganhHoc.remove(nganhHoc);
    }
    public void update(NganhHoc nganhHoc) {
        this.delete(nganhHoc);
        this.insert(nganhHoc);
    }
    public String getLuaChon() {
        return luaChon;
    }
    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
    }
    public boolean kiemTraTonTai(NganhHoc nganh) {
        boolean tonTai = false;
        for(NganhHoc nganhHoc : dsNganhHoc) {
            if(nganhHoc.getMaNganh().equals(nganh.getMaNganh())) {
                tonTai = true;
            }
        }
        return tonTai;
    }
}
