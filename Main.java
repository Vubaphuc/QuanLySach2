import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khai báo sách
        Sach sach1 = new Sach("tiêu đề", "Thể loại", " tác giả", 01, 20, 2022 );
        Sach sach2 = new Sach("tiêu đề", "Thể loại", " tác giả", 01, 20, 2022 );
        Sach sach3 = new Sach("tiêu đề", "Thể loại", " tác giả", 01, 20, 2022 );
        Sach sach4 = new Sach("tiêu đề", "Thể loại", " tác giả", 01, 20, 2022 );
        Sach sach5 = new Sach("tiêu đề", "Thể loại", " tác giả", 01, 20, 2022 );

        sach1.setId(01);
        sach2.setId(02);
        sach3.setId(03);
        sach4.setId(04);
        sach5.setId(05);
        sach1.setTitle("Sách Giáo Khoa");
        sach2.setTitle("Sách Toán");
        sach3.setTitle("Sách Lịch Sử");
        sach4.setTitle("Sách GDCD");
        sach5.setTitle("Sách Ngoại Ngữ");
        sach1.setCategory("Khoa Học");
        sach2.setCategory("Hình sự");
        sach3.setCategory("Nhân Văn");
        sach4.setCategory("Xã Hội");
        sach5.setCategory("Kinh tế");
        sach1.setAuthor("Thành");
        sach2.setAuthor("Trang");
        sach3.setAuthor("Minh");
        sach4.setAuthor("Vũ");
        sach5.setAuthor("Khoa");
        sach1.setPage_number(70);
        sach2.setPage_number(20);
        sach3.setPage_number(30);
        sach4.setPage_number(80);
        sach5.setPage_number(50);
        sach1.setRelease_year(2024);
        sach2.setRelease_year(2021);
        sach3.setRelease_year(2020);
        sach4.setRelease_year(2023);
        sach5.setRelease_year(2018);

        Sach sachs[] = {sach1, sach2, sach3, sach4, sach5};

        int menu;
        do {
            System.out.println("Menu.........");
            System.out.println("1. Lấy thông tin toàn bộ sách");
            System.out.println("2. Tim sách theo tên");
            System.out.println("3. Tìm sách theo thể loại");
            System.out.println("4. Sắp xếp sách theo số trang");
            System.out.println("5. Sắp xếp sách theo năm xuất bản");
            System.out.println("0. Thoát Chương trình");
            menu = new Scanner(System.in).nextInt();
            switch (menu){
                case 1:
                    System.out.println("thông tin toàn bộ sách");
                    for (int i = 0; i < sachs.length; i++) {
                        System.out.println(sachs[i].toString());
                    }
                    break;
                case 2:
                    System.out.println("Tim sách theo tên");
                    String keyWord = new Scanner(System.in).nextLine();
                    for (int i = 0; i <sachs.length; i++){
                        if (sachs[i].getTitle().contains(keyWord)){
                            System.out.println(sachs[i].toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Tim sách theo thể loại");
                    String keyWord1 = new Scanner(System.in).nextLine();
                    for (int i = 0; i <sachs.length; i++){
                        if (sachs[i].getCategory().contains(keyWord1)){
                            System.out.println(sachs[i].toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Sắp xếp sách theo số trang");
                    Sach  temp = null;
                    for (int i = 0; i < sachs.length-1; i++){
                        for (int j = 0;j < sachs.length-i-1; j++){
                            if (sachs[j].getPage_number()>sachs[j+1].getPage_number()){
                                temp = sachs[j];
                                sachs[j] = sachs[j+1];
                                sachs[j+1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < sachs.length;i++){
                        System.out.println(sachs[i].toString());
                    }
                    break;
                case 5:
                    System.out.println("Sắp xếp sách theo năm sản xuất");
                    Sach  temp1 = null;
                    for (int i = 0; i < sachs.length-1; i++){
                        for (int j = 0; j < sachs.length-i-1; j++){
                            if (sachs[j].getRelease_year()>sachs[j+1].getRelease_year()){
                                temp1 = sachs[j];
                                sachs[j] = sachs[j+1];
                                sachs[j+1] = temp1;
                            }
                        }
                    }
                    for (int i = 0; i < sachs.length;i++){
                        System.out.println(sachs[i].toString());
                    }

                    break;
            }
        }while (menu!=0 && menu>5);
    }
}