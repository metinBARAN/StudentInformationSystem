public class Main {

    public static void main(String[] args) {

        Course matematik=new Course("matematik","101","MAT");
        Course fizik=new Course("fizik","102","FZK");
        Course kimya=new Course("kimya","103","KMY");
        Course verbalGradeMatematik=new Course("Verbal Grade Matematik","101101","VGM");
        Course verbalGradeFizik=new Course("Verbal Grade Fizik","102102","VGF");
        Course verbalGradeKimya=new Course("Verbal Grade Kimya","103103","VGK");

        Teacher t1=new Teacher("Burhan hoca","5468","MAT");
        Teacher t2=new Teacher("Ahmet hoca","47894","FZK");
        Teacher t3=new Teacher("Murat hoca","3564","KMY");

        matematik.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        verbalGradeMatematik.addTeacher(t1);
        verbalGradeFizik.addTeacher(t2);
        verbalGradeKimya.addTeacher(t3);

        Student s1=new Student("Eda","123","2",matematik,fizik,kimya,
                verbalGradeMatematik,verbalGradeFizik,verbalGradeKimya);

        s1.addBulkExampNote(10,20,30);
        s1.addBulkVerbalGradeNote(20,70,40);
        s1.isPass();

        Student s2=new Student("Emre","124","2",matematik,fizik,kimya,
                verbalGradeMatematik,verbalGradeFizik,verbalGradeKimya);

        s2.addBulkExampNote(70,75,60);
        s2.addBulkVerbalGradeNote(95,80,70);
        s2.isPass();

        Student s3=new Student("Anil","125","2",matematik,fizik,kimya,
                verbalGradeMatematik,verbalGradeFizik,verbalGradeKimya);

        s3.addBulkExampNote(9,50,60);
        s3.addBulkVerbalGradeNote(100,80,70);
        s3.isPass();
    }
}
