package exercises;

public class LessonInformatika {
    public static void main(String[] args) {
        Student student1 = new Student(); // 1 student
        student1.id = 1;
        student1.name = "Mirali";
        student1.favLesson = "informatika";
        student1.age = 13;
        student1.student_info();

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Kanan";
        student2.favLesson = "informatika";
        student2.age = 10;
        student2.student_info();

        Student student3 = new Student();
        student3.id = 3;
        student3.name = "Shexriyar";
        student3.favLesson = "English";
        student3.age = 16;
        student3.student_info();

    }
}
