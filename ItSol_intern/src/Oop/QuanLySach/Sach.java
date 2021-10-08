package Oop.QuanLySach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sach {
    private int idBook;
    private String namebook;
    private String nameAuthor;
    private String specialized;
    private LocalDate year;
    private  static int auId=100000;

    public Sach() {
        this.idBook = auId++;
    }

    public Sach(int idBook, String namebook, String nameAuthor, String specialized, LocalDate year) {
        this.idBook = auId++;
        this.namebook = namebook;
        this.nameAuthor = nameAuthor;
        this.specialized = specialized;
        this.year = year;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        this.setIdBook(Sach.auId);
        scanner.nextLine();
        System.out.println("Nhập tên sách: ");
        this.namebook = scanner.nextLine();
        System.out.println("Nhập tên tác giả: ");
        this.nameAuthor = scanner.nextLine();
        System.out.println("Nhập loại sách: ");
        System.out.println("1.Khoa học tự nhiên");
        System.out.println("2.Văn học - nghệ thuật");
        System.out.println("3.Điện tử viễn thông");
        System.out.println("4.Công nghệ thông tin");
        System.out.println("Nhập sự lựa chọn: ");
        boolean check = true;
        do {
            int n=new Scanner(System.in).nextInt();
            switch (n){
                case 1: this.setSpecialized(LoaiSach.CONG_NGHE);
                    System.out.println("Công Nghệ");
                    check=true;
                    break;
                case 2:this.setSpecialized(LoaiSach.DIEN_TU);
                    System.out.println("Điện tử");
                    check=true;
                    break;
                case 3:this.setSpecialized(LoaiSach.KHOA_HOC);
                    System.out.println("Khoa học");
                    check=true;
                    break;
                case 4:this.setSpecialized(LoaiSach.VAN_HOC);
                    System.out.println("Văn học");
                    check=true;
                    break;
                default:
                    System.out.println("Nhập sai nhập lại");
                    check=false;
                    break;
            }
        }while (!check);
        Sach.auId++;
        System.out.println("Nhập năm: ");
        String date = scanner.nextLine();
        this.year = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }

    public void output() {
        System.out.println("Nhập mã sách: " + this.idBook);
        System.out.println("Nhập tên sách: " + this.namebook);
        System.out.println("Tên tác giả: " + this.nameAuthor);
        System.out.println("Loại sách: " + this.specialized);
        System.out.println("Năm: " + this.year);
    }

    @Override
    public String toString() {
        return "Sach{" +
                "idBook=" + idBook +
                ", namebook='" + namebook + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", specialized=" + specialized +
                ", year=" + year +
                '}';
    }
}
