public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int verbalGradeNote;
    int verbalGrade;
    Teacher courseTeacher;


    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.verbalGradeNote=0;
        this.verbalGrade=0;

    }
    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.courseTeacher=teacher;
            System.out.println("Islem basarili.");
        }else{
            System.out.println("Akademisyen bu dersi alamaz.");
        }

    }

    void printTeacher(){
        if (courseTeacher!=null){
            System.out.println(this.name+" dersinin akademisyeni "+courseTeacher.name);
        }else{
            System.out.println(this.name+" bu dersin akademisyeni atamamistir");
        }
    }
}
