import java.util.Arrays;

public class Book extends Library {
    private String director;
    private int releaseYear;
    private int page;
    private String company;
    private int number;

    public Book(int id, String name, String director, int releaseYear, String[] category, int page, String company, int number) {
        super(id, name, category);
        this.director = director;
        this.releaseYear = releaseYear;
        this.page = page;
        this.company = company;
        this.number = number;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Sách Giáo Khoa: "+  super.toString()
                + "-" + director
                + "-" + releaseYear
                + "-" + Arrays.toString(getCategory())
                + "-" + page
                + "-" + company
                + "-" + number;
    }
}
