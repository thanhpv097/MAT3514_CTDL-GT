package project_21000703_phanvanthanh.model;

import java.util.ArrayList;

public class QLTModel {
    private ArrayList<NganhHoc> dsNganhHoc;

    public QLTModel() {
        this.dsNganhHoc = new ArrayList<NganhHoc>();
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
}
