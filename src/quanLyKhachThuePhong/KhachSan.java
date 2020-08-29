package quanLyKhachThuePhong;

import java.math.BigInteger;
import java.util.List;

public class KhachSan {
    private int soNgayTro;
    private int loaiPhongTro;
    private double giaPhong;
    private List<Nguoi> nguoi;

    public KhachSan() {}

    public KhachSan(int soNgayTro, double giaPhong, List<Nguoi> nguoi) {
        this.soNgayTro = soNgayTro;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }

    public int getSoNgayTro() {
        return this.soNgayTro;
    }
    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public int getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(int loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public List<Nguoi> getNguoi() {
        return nguoi;
    }

    public void setNguoi(List<Nguoi> nguoi) {
        this.nguoi = nguoi;
    }
}
