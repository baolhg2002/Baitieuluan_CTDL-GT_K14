package oo;

public class StudentTestDrive {
    public static void main(String[] args) {
        
        Student tuanStudent = new Student();
        tuanStudent.hoc();

        Student ducStudent = new Student();
        ducStudent.thi();

        Student xyzStudent = new Student();
        xyzStudent.dangKyMonHoc();

        Student minhStudent = new Student(false, 20, "Ly Tieu Minh", "CNTT", 5.0);

        Student lamStudent = new Student(false, 19, "Ly Hoai Lam", "CNTT", 6.0);
    }
    
}
