import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FPT {
    private int id;
    private String name;
    private String description;
    private String[] category;
    private int number;
    private long price;

    @Override
    public String toString() {
        return
                " ID: " + id +
                ", Tên sản phẩm: " + name +
                ", Mô tả: " + description +
                ", Danh mục: " + Arrays.toString(category) +
                ", Số lượng: " + number +
                ", Giá bán:" + price
                ;
    }
}
