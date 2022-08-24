public class Student {

    String name;
    String studentNo;
    String clases;
    Course matematik;
    Course fizik;
    Course kimya;
    Course verbalGradeMatematik;
    Course verbalGradeFizik;
    Course verbalGradeKimya;
    double avarage;
    double verbalGradeAvarage;
    double lessonAvarage;
    boolean isPass;

    Student(String name, String studentNo, String clases, Course matematik, Course fizik, Course kimya,
            Course verbalGradeMatematik, Course verbalGradeFizik, Course verbalGradeKimya) {

        this.name = name;
        this.studentNo = studentNo;
        this.clases = clases;
        this.matematik = matematik;
        this.fizik = fizik;
        this.kimya = kimya;
        this.verbalGradeMatematik = verbalGradeMatematik;
        this.verbalGradeFizik = verbalGradeFizik;
        this.verbalGradeKimya = verbalGradeKimya;
        this.avarage = 0.0;
        this.verbalGradeAvarage=0.0;
        this.lessonAvarage=0.0;
        this.isPass = false;
        isCeckPass();


    }

    void addBulkExampNote(int matematik, int fizik, int kimya) {

        if (matematik > 0 && matematik <= 100) {
            this.matematik.note = matematik;
        }
        if (fizik > 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya > 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    void addBulkVerbalGradeNote(int verbalGradeMatematik, int verbalGradeFizik, int verbalGradeKimya){
        if (verbalGradeMatematik >0 && verbalGradeMatematik<=100) {
            this.verbalGradeMatematik.verbalGradeNote = verbalGradeMatematik;
        }
        if (verbalGradeFizik >0 && verbalGradeFizik<=100) {
            this.verbalGradeFizik.verbalGradeNote = verbalGradeFizik;
        }
        if (verbalGradeKimya>0&&verbalGradeKimya<=100){
            this.verbalGradeKimya.verbalGradeNote = verbalGradeKimya;
        }

    }

    void isPass(){
        if (this.matematik.note==0||this.fizik.note==0||this.kimya.note==0&&
                this.verbalGradeMatematik.verbalGradeNote==0||this.verbalGradeFizik.verbalGradeNote==0||
                this.verbalGradeKimya.verbalGradeNote==0){
            System.out.println("Hatali not girdiniz ");
        }else{
            this.isPass=this.isCeckPass();
            printNote();
            System.out.println("Ortalama: "+this.lessonAvarage);
            if (this.isPass){
                System.out.println("Sinifi gecti.");
            }else{
                System.out.println("Sinifta Kaldi");
            }
        }
    }

    void calcAvarage(){
        this.avarage=(this.matematik.note)*(0.8);
        this.avarage=(this.fizik.note)*(0.8);
        this.avarage=(this.kimya.note)*(0.8);

        this.verbalGradeAvarage=(this.verbalGradeMatematik.verbalGradeNote)*(0.20);
        this.verbalGradeAvarage=(this.verbalGradeFizik.verbalGradeNote)*(0.20);
        this.verbalGradeAvarage=(this.verbalGradeFizik.verbalGradeNote)*(0.20);

        this.lessonAvarage=(this.matematik.note*0.8)+(this.verbalGradeMatematik.verbalGradeNote*0.2);
        this.lessonAvarage=(this.fizik.note*0.8)+(this.verbalGradeFizik.verbalGradeNote*0.2);
        this.lessonAvarage=(this.kimya.note*0.8)+(this.verbalGradeKimya.verbalGradeNote*0.2);

    }

    boolean isCeckPass(){
        calcAvarage();
        return this.lessonAvarage>55;
    }
    void printNote(){
        System.out.println("-------------------------");
        System.out.println("Ogrenci: "+this.name);
        System.out.println("Matematik: "+this.matematik.note);
        System.out.println("Fizik: "+this.fizik.note);
        System.out.println("Kimya: "+this.kimya.note);
        System.out.println("Matematik Sozlu Notu: "+this.verbalGradeMatematik.verbalGradeNote);
        System.out.println("Fizik Sozlu Notu: "+this.verbalGradeFizik.verbalGradeNote);
        System.out.println("Kimya Sozlu Notu: "+this.verbalGradeKimya.verbalGradeNote);

    }


}

