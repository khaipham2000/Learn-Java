import java.time.LocalDate;
import java.util.Arrays;

public class Magazine extends Library {
    private String official;
    private LocalDate releaseDay;
    private int page;
    private int number;

    public Magazine(int id, String name, String official, LocalDate releaseDay, String[] category,  int page, int number) {
        super(id, name, category);
        this.official = official;
        this.releaseDay = releaseDay;
        this.page = page;
        this.number = number;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public LocalDate getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(LocalDate releaseDay) {
        this.releaseDay = releaseDay;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Tạp chí: "+ super.toString()+
                 "-"+ official
                + "-"+ releaseDay
                + "-"+  Arrays.toString(getCategory())
                + "-" + page
                + "-" + number ;
    }
}
