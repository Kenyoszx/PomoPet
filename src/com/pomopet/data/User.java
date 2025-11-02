package com.pomopet.data;

public class User extends Student {
    
    // Atributos ->
    
    private String email;
    private String password;
    private String birthDate;
    private String gender;
    private Pet studentPet;

    //Construtor ->

    public User(String name, String email, String password, String birthDate, String gender) {
        super(name);
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
        this.gender = gender;
    }
    
    
    //Getters e Setters ->
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Pet getStudentPet() {
        return studentPet;
    }

    public void setStudentPet(Pet studentPet) {
        this.studentPet = studentPet;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
