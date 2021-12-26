import java.time.LocalDate;
import java.util.Arrays;

public class DigitalDocument extends Library {
    private String director;
    private int releaseYear;
    private LocalDate uploadDate;
    private double size;
    private long download;

    public DigitalDocument(int id, String name, String director, int releaseYear, LocalDate uploadDate, String[] category, double size, long download) {
        super(id, name, category);
        this.director = director;
        this.releaseYear = releaseYear;
        this.uploadDate = uploadDate;
        this.size = size;
        this.download = download;
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

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public long getDownload() {
        return download;
    }

    public void setDownload(long download) {
        this.download = download;
    }

    @Override
    public String toString() {
        return "Tài liệu điện tử: "+ super.toString()
                + "-" + director
                + "-" + releaseYear
                + "-" + uploadDate
                + "-"+ Arrays.toString(getCategory())
                + "-" + size
                + "-" + download
                ;
    }
}
