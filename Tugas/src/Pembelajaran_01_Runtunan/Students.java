package Pembelajaran_01_Runtunan;

public class Students {
    Integer NPM;
    String Fullname;
    String ClassName;
    Integer Semester;
    Float GPA;

    public Integer getNPM(Integer value) {
        this.NPM = value;
        return this.NPM;
    }

    public String getFullname(String value) {
        this.Fullname = value;
        return this.Fullname;
    }

    public String getClassName(String value) {
        this.ClassName = value;
        return this.ClassName;
    }

    public Integer getSemester(Integer value) {
        this.Semester = value;
        return this.Semester;
    }

    public Float getGPA(Float value) {
        this.GPA = value;
        return this.GPA;
    }
}
