package oop.example;

import java.util.Scanner;

public class BasicOOP {
    /*
    Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
    Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
Các nhân viên có thuộc tính riêng: công việc.
Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.

Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:

Thêm mới cán bộ.
Tìm kiếm theo họ tên.
Hiện thị thông tin về danh sách các cán bộ.
Thoát khỏi chương trình.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OfficerManager officerManager = new OfficerManager();
        while (true) {
            System.out.println("Application Officer Manager");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");

            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    insertOficer();
                    break;
                }
                case "2":{
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();
                    officerManager.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    System.out.println("Show information officers");
                    officerManager.printOfficers();
                    break;
                }
                case "4":{
                    return;
                }
                default:{
                    System.out.println("Invalid input");
                    continue;
                }
            }
        }
    }
    public static void insertOficer() {
        OfficerManager officerManager = new OfficerManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: to insert Engineer");
        System.out.println("Enter b: to insert Worker");
        System.out.println("Enter c: to insert Staff");
        String type = sc.nextLine();

        switch (type) {
            case "a": {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter gender: ");
                String gender = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter Major: ");
                String major = sc.nextLine();
                Engineer engineer = new Engineer(name, age, gender, address, major);
                officerManager.addOfficer(engineer);
                System.out.println(engineer);
                break;
            }
            case "b": {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter gender: ");
                String gender = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter Level: ");
                int level = sc.nextInt();
                sc.nextLine();
                Worker worker = new Worker(name, age, gender, address, level);
                officerManager.addOfficer(worker);
                System.out.println(worker);
                break;
            }
            case "c": {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter gender: ");
                String gender = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter task: ");
                String task = sc.nextLine();
                Staff staff = new Staff(name, age, gender, address, task);
                officerManager.addOfficer(staff);
                System.out.println(staff);
                break;
            }
            default:{
                System.out.println("Invalid input");
            }
        }
    }
}
