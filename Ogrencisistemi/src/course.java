public class course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    int verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;


    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("Öğretmen ve Bölüm dersleri uyuşmuyor!");
        }

    }

    void printTeacher() {
        this.teacher.print();
    }
}