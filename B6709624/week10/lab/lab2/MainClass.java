package oot.b6709624.week10.lab.lab2;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // 1: สร้าง Array ชื่อ employees
        Employee[] employees = new Employee[3];

        // 2 & 3: ข้อมูลของ John Smith
        employees[0] = new Employee("John Smith", new JobInfo("Manager",
                "Sales and Marketing", "pass123"));

        employees[1] = new Employee("Jane Doe", new JobInfo("Developer",
                "Research and Development", "secure456"));

        // 4: ข้อมูลของ Alice (ดูจากตำแหน่ง Analyst ในผลลัพธ์)
        employees[2] = new Employee("Alice Wonderland", new JobInfo("Analyst",
                "Finance and Accounting", "key789"));

        Scanner sc = new Scanner(System.in);
        
        // วนลูปเรียกเมธอด
        for (Employee e : employees) {
            // 5: เรียกเมธอดแสดงผล/ตรวจสอบรหัสผ่าน
            // **สำคัญ** ชื่อต้องตรงกับในไฟล์ Employee.java ของคุณ
            e.verifyUser(sc); 
            System.out.println();
        }
        sc.close();
    }
}
