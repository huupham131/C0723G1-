package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Huu");
        student.setClasse("C0723G1");
    }
}
/*
Thay đổi access modifier cho setName và setClasses:
private: xảy ra lỗi vì không nằm chung 1 class
protected: không có lỗi.
default: không có lỗi
 */