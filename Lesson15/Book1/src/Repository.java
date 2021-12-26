import java.time.LocalDate;
import java.util.ArrayList;

public class Repository {
    public ArrayList<Book> getBook() {
        ArrayList<Book> listBook = new ArrayList<>();
        listBook.add(new Book(1, "Làm chủ lập trình", "Thái", 2021, new String[]{"Khoa học, Viễn tưởng "}, 200, "Kim Đồng", 2000));
        listBook.add(new Book(2, "Toán", "Cường", 2022, new String[]{"Khoa học, Logic "}, 250, "Thanh niên", 2000));
        listBook.add(new Book(3, "Văn", "Khải", 2021, new String[]{"Văn học "}, 220, "Thiếu nữ ", 2000));
        listBook.add(new Book(4, "Tiếng Anh", "Nam", 2023, new String[]{"Ngoại ngữ"}, 240, "Thời đại ", 2000));
        listBook.add(new Book(5, "Lịch sử", "Tuấn", 2019, new String[]{"Lịch sử"}, 221, "Tuổi thơ", 2000));

        return listBook;
    }

    public ArrayList<Magazine> getMagazine() {
        ArrayList<Magazine> listMagazine = new ArrayList<>();
        listMagazine.add(new Magazine(11, "Làm giàu ko khó", "Tiến Bịp", LocalDate.of(2021, 11, 1), new String[]{"Khoa học, Kinh tế "}, 132, 200));
        listMagazine.add(new Magazine(12, "Ice", "Sol", LocalDate.of(2015, 10, 21), new String[]{"Khoa học"}, 154, 250));
        listMagazine.add(new Magazine(13, "MenWear", "HN", LocalDate.of(2017, 5, 13), new String[]{"Đời sống, Thời trang"}, 200, 100));
        listMagazine.add(new Magazine(14, "Rapper", "HCM", LocalDate.of(2020, 3, 23), new String[]{"Đời sống, Âm nhạc "}, 345, 230));
        listMagazine.add(new Magazine(15, "Lý thuyết bay lắc cơ bản", "Khá Bảnh", LocalDate.of(2018, 7, 10), new String[]{"Đời sống, Ngục Tù"}, 132, 200));

        return listMagazine;
    }

    public ArrayList<DigitalDocument> getDocument(){
        ArrayList<DigitalDocument> listDocument = new ArrayList<>();
        listDocument.add(new DigitalDocument(21,"Toán Cao Cấp","Vinh Xô",2015,LocalDate.of(2015,10,13), new String[]{"Khoa học, Đại Số "}, 12, 2000));
        listDocument.add(new DigitalDocument(22,"Kinh Tế Vi Mô","Chồn Máu Liều",2013,LocalDate.of(2015,5,3), new String[]{"Khoa học, Trừu Tượng "}, 102, 1400));
        listDocument.add(new DigitalDocument(23,"Triết Học","Tân 1 Cú",2014,LocalDate.of(2015,7,23), new String[]{"Khoa học, Đời Sống "}, 123, 3900));
        listDocument.add(new DigitalDocument(24,"Lý Thuyết Hình Học","Hoàng Lan Tôn",2022,LocalDate.of(2015,2,16), new String[]{"Hình Học "}, 412, 1900));
        listDocument.add(new DigitalDocument(25,"Công Nghệ Lõi","Hạnh Láng",2017,LocalDate.of(2015,8,27), new String[]{"Khoa học, Công Nghệ"}, 182, 3000));
        listDocument.add(new DigitalDocument(26,"Ẩm thực Hà Nội","Duy Nến",2020,LocalDate.of(2015,9,16), new String[]{"Ẩm Thực"}, 1200, 700));

        return listDocument;

    }

}
