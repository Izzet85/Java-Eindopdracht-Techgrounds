import java.util.ArrayList;

public class School {
    ArrayList <String> teachers = new ArrayList<String>();
    ArrayList<String> students = new ArrayList<String>();
    ArrayList<String> classes = new ArrayList<String>();
    String schoolType;
    ArrayList<String> curriculum = new ArrayList<String>();

    public ArrayList<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<String> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(ArrayList<String> curriculum) {
        this.curriculum = curriculum;
    }

    public void addStudent(){


    }

    public void addTeacher(){


    }

}
