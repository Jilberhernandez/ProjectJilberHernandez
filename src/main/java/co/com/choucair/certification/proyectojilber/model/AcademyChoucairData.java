package co.com.choucair.certification.proyectojilber.model;

import co.com.choucair.certification.proyectojilber.tasks.Search;

public class AcademyChoucairData {
    private Search strUser;
    private Search strPassword;
    private Search strCourse;

    public Search getStrUser() {
        return strUser;
    }
    public void getStrUser(Search strUser) {
        this.strUser = strUser;
    }

    public Search getStrPassword() {
        return strPassword;
    }

    public void getStrPassword(Search strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(Search strCourse) {
        this.strCourse = strCourse;
    }
}


