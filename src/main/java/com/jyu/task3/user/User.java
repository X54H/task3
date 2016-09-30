package com.jyu.task3.user;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class User {

    private int id;
    private String name;
    private String surname;
    private String nickname;
    private Date birth;
    private String age;

    public User(){}

    public User(int id, String name, String surname, String nickname, Date birth, String age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birth = birth;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {return nickname;}

    public void setNickname(String nickname) {this.nickname = nickname;}

    public Date getBirth() {return birth;}

    public void setBirth(Date birth) {this.birth = birth;}

    public String getAge() {   return age;}

    public void setAge(String age) {this.age = age;}

    public int getId() {return id; }

    public void setId(int id) {  this.id = id; }
}