package project_21000703_phanvanthanh.model;

import java.util.Objects;

public class NganhHoc {
    private String maNganh;
    private String tenNganh;
    private TruongDH truong;
    private long hocPhi;
    private double diemChuan;
    public NganhHoc() {
    }
    public NganhHoc(String maNganh, String tenNganh, TruongDH truong, long hocPhi, double diemChuan) {
        this.maNganh = maNganh;
        this.tenNganh = tenNganh;
        this.truong = truong;
        this.hocPhi = hocPhi;
        this.diemChuan = diemChuan;
    }
    public String getMaNganh() {
        return maNganh;
    }
    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }
    public String getTenNganh() {
        return tenNganh;
    }
    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }
    public TruongDH getTruong() {
        return truong;
    }
    public void setTruong(TruongDH truong) {
        this.truong = truong;
    }
    public long getHocPhi() {
        return hocPhi;
    }
    public void setHocPhi(long hocPhi) {
        this.hocPhi = hocPhi;
    }
    public double getDiemChuan() {
        return diemChuan;
    }
    public void setDiemChuan(double diemChuan) {
        this.diemChuan = diemChuan;
    }
    @Override
    public String toString() {
        return "NganhHoc [maNganh=" + maNganh + ", tenNganh=" + tenNganh + ", truong=" + truong + ", hocPhi=" + hocPhi
                + ", diemChuan=" + diemChuan + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(diemChuan, hocPhi, maNganh, tenNganh, truong);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NganhHoc other = (NganhHoc) obj;
        return Double.doubleToLongBits(diemChuan) == Double.doubleToLongBits(other.diemChuan) && hocPhi == other.hocPhi
                && Objects.equals(maNganh, other.maNganh) && Objects.equals(tenNganh, other.tenNganh)
                && Objects.equals(truong, other.truong);
    }

}