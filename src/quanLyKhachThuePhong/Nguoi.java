package quanLyKhachThuePhong;

public class Nguoi {
    private int Id;
    private String fullName;
    private String ngaySing;
    private int soCMT;
    private int phongID;

    public Nguoi() {
    }

    public Nguoi(int id, String fullName, String ngaySing, int soCMT) {
        Id = id;
        this.fullName = fullName;
        this.ngaySing = ngaySing;
        this.soCMT = soCMT;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNgaySing() {
        return ngaySing;
    }

    public void setNgaySing(String ngaySing) {
        this.ngaySing = ngaySing;
    }

    public int getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(int soCMT) {
        this.soCMT = soCMT;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "Id=" + Id +
                ", fullName='" + fullName + '\'' +
                ", ngaySing='" + ngaySing + '\'' +
                ", soCMT=" + soCMT +
                ", phongID=" + phongID +
                "}\n";
    }
}
