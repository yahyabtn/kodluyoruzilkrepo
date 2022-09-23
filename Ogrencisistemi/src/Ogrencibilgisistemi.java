public class OgrencibilgiSistemi {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ali Yılmaz", "0967", " Mat");
        Teacher t2 = new Teacher("ERTAN", "032", "FZK");
        Teacher t3 = new Teacher("İsmail", "99", "BİO");

        Course mat = new Course("Matematik", "101", " Mat");
        mat.addTeacher(t1);


        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);


        Course biyoloji = new Course("Biyoloji", "103", "BİO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Ronaldo", "7", "3", mat, fizik, biyoloji);
        s1.addBulkExamNote(50, 90, 100);
        s1.isPass();
        s1.addBulkVerbalNote(80,90,100);

        Student s2 = new Student("Messi", "10", "3", mat, fizik, biyoloji);
        s2.addBulkExamNote(94,48,76);
        s2.isPass();
        s2.addBulkVerbalNote(70,80,95);

        Student s3=new Student("Tarkan","15","4",mat,fizik,biyoloji);
        s3.addBulkExamNote(17,68,67);
        s3.isPass();
        s3.addBulkVerbalNote(60,80,90);


    }
}