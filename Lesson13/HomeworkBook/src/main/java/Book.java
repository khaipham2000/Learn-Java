import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Book {
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("author")
    private String author;
    @SerializedName("category")
    private String[] category;
    @SerializedName("publishingYear")
    private int publishingYear;
    @SerializedName("publishingCompany")
    private String publishingCompany;
    @SerializedName("pageNumber")
    private int pageNumber;

    @Override
    public String toString() {
        return
                "ID: " + id +
                ", Tên sách: " + title +
                ", Tác giả: " + author +
                ", Thể loại: " + Arrays.toString(category) +
                ", Năm phát hành: " + publishingYear +
                ", Công ty phát hành: " + publishingCompany +
                ", Số trang: " + pageNumber;
    }
}
