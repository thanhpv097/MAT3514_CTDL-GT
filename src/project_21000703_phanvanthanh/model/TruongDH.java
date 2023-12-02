package project_21000703_phanvanthanh.model;

import java.util.Objects;

public class TruongDH {
    private String maTruong;
    private String tenTruong;
    private String diaChi;
    public TruongDH(String maTruong, String tenTruong, String diaChi) {
        this.maTruong = maTruong;
        this.tenTruong = tenTruong;
        this.diaChi = diaChi;
    }
    public String getMaTruong() {
        return maTruong;
    }
    public void setMaTruong(String maTruong) {
        this.maTruong = maTruong;
    }
    public String getTenTruong() {
        return tenTruong;
    }
    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Override
    public String toString() {
        return "TruongDH [maTruong=" + maTruong + ", tenTruong=" + tenTruong + ", diaChi=" + diaChi + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(diaChi, maTruong, tenTruong);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TruongDH other = (TruongDH) obj;
        return Objects.equals(diaChi, other.diaChi) && Objects.equals(maTruong, other.maTruong)
                && Objects.equals(tenTruong, other.tenTruong);
    }
}