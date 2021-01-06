package id.ac.unhas.ioiprofilelist.model;

public class Member {
    private String namaMember;
    private String detail;
    private int photo;
    private String moreDetailMember;
    private String rating;

    public String getNamaMember() {
        return namaMember;
    }

    void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public String getDetail() {
        return detail;
    }

    void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getMoreDetailMember() {
        return moreDetailMember;
    }

    void setMoreDetail(String moreDetailMember) {
        this.moreDetailMember = moreDetailMember;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
