import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Customer {
    private int id;
    private String name;
    private String birth;
    private Gender gender;
    private String address;
    private String phone;
    private String email;

    @Override
    public String toString() {
        return " Customer: " +
                " ID: " + id +
                ", Tên: " + name +
                ", Ngày sinh: " + birth +
                ", Giới tính: " + gender +
                ", Quê quán: " + address +
                ", Số điện thoại: " + phone +
                ", Email: " + email
                ;
    }
}
