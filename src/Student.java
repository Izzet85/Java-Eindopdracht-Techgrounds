import java.util.ArrayList;

public class Student {
    String name;
    String dateOfBirth;
    String Class;
    ArrayList<String> grades = new ArrayList<String>();
    String profile;
    ArrayList<String> datesOfAbsent = new ArrayList<String>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
//
//    @Override
//    public String getClass() {
//        return Class;
//    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<String> grades) {
        this.grades = grades;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public ArrayList<String> getDatesOfAbsent() {
        return datesOfAbsent;
    }

    public void setDatesOfAbsent(ArrayList<String> datesOfAbsent) {
        this.datesOfAbsent = datesOfAbsent;
    }

    public void student (String name, String nationality){

    }

    public void student (String name,String nationality,String dateOfBirth,String profile){

    }


}
