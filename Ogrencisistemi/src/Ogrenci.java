public class Ogrenci {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;
    double avarage1;
    double avarage2;
    double avarage3;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;

        this.isPass = false;


    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;

        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }


    }

    void addBulkVerbalNote(int verbnote1, int verbnote2, int verbnote3) {
        if (verbnote1 >= 0 && verbnote1 <= 100) {
            this.c1.verbalNote = verbnote1;
        }
        if (verbnote2 >= 0 && verbnote2 <= 100) {
            this.c2.verbalNote = verbnote2;
        }
        if (verbnote3 >= 0 && verbnote3 <= 100) {
            this.c3.verbalNote = verbnote3;

        }
        System.out.println("Sözlü notu ortalamanız :" + (verbnote1 + verbnote2 + verbnote3) / 3);

    }


    void isPass() {
        System.out.println("****************");
        calsAvarage();
        if (this.avarage > 55) {
            System.out.println("Tebrikler geçtiniz !");
            this.isPass = true;
        } else {
            System.out.println("Maalesef kaldınız :( ");
            this.isPass = false;
        }
        printNote();
    }

    void calsAvarage() {
        avarage1 = this.c1.note * 0.8 + this.c1.verbalNote * 0.2;
        avarage2 = this.c2.note * 0.8 + this.c2.verbalNote * 0.2;
        avarage3 = this.c3.note * 0.8 + this.c3.verbalNote * 0.2;
        this.avarage = (avarage1 + avarage2 + avarage3) / 3.0;


    }


    void printNote() {

        System.out.println("Öğrenci  :" + this.name);
        System.out.println(this.c1.name + " Notu :" + this.c1.note);
        System.out.println(this.c2.name + " Notu :" + this.c2.note);
        System.out.println(this.c3.name + " Notu :" + this.c3.note);
        System.out.println("Ortalamanız :" + this.avarage);
    }
}