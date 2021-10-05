package Oop.QuanLySach;

import java.util.Scanner;

public class BanDoc {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String type;
    private static int autorIncrement = 10000;

    public BanDoc(){
    }

    public BanDoc(int id, String name, String address, String phone, String type) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void intput() {
        this.setId(BanDoc.autorIncrement);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên Bạn Đọc: ");
        name = scanner.nextLine();
        System.out.println("Nhập Địa Chỉ: ");
        address = scanner.nextLine();
        System.out.println("Nhập Số điện thoại: ");
        phone = scanner.nextLine();
        type=scanner.nextLine();
        System.out.println("Loại Bạn Đọc: ");
        System.out.println("1.Sinh Viên");
        System.out.println("2.Học sinh cao học");
        System.out.println("3.Giáo viên");
        boolean check=true;
        do {
            System.out.println("Hãy chọn loại bạn đọc");
            int setup=scanner.nextInt();
            scanner.nextLine();
            switch (setup){
                case 1: this.setType(LoaiBanDoc.SINH_VIEN);
                    System.out.println("Sinh viên");
                    check=true;
                    break;
                case 2: this.setType(LoaiBanDoc.HOC_SINH_CAO_HOC);
                    System.out.println("Học Sinh cao học");
                    check=true;
                    break;
                case 3: this.setType(LoaiBanDoc.GIAO_VIEN);
                    System.out.println("Giáo viên");
                    check=true;
                    break;
                default:
                    System.out.println("Nhập lại ");
                    check=false;
                    break;
            }
        }while (!check);
        BanDoc.autorIncrement++;


    }

    public void output() {
        System.out.println("Mã bạn đọc: " + this.id);
        System.out.println("Tên bạn đọc: " + this.name);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Số điện thoại: " + this.phone);
        System.out.println("LOại bạn đọc: "+this.getType());
    }

    @Override
    public String toString() {
        return "BanDoc{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", type=" + type +
                '}';
    }
}
