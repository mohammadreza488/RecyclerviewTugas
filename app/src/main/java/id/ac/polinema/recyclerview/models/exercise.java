package id.ac.polinema.recyclerview.models;

public class exercise {

    private String judul;
    private String company;
    private String image;


    public exercise(String judul, String company, String image) {
        this.judul = judul;
        this.company = company;
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
