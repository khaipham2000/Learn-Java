import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Movie {

    @SerializedName("id")
    private int id;

    @SerializedName("movie_name")
    private String name;

    @SerializedName("genres")
    private String genre;

    @SerializedName("directors_name")
    private String director;

    @SerializedName("minutes")
    private int length;

    @SerializedName("realease_date")
    private String release;

    @SerializedName("views")
    private int view;

    @Override
    public String toString() {
        return
                "id: " + id +
                ", Tên phim: " + name + '\'' +
                ", Thể loại:" + genre + '\'' +
                ", Đạo diễn: " + director + '\'' +
                ", Thời lượng:" + length +
                ", Ngày công chiếu:" + release + '\'' +
                ", Lượt xem: " + view +
                '}';
    }
}
