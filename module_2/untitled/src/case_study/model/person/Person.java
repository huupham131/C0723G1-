package case_study.model.person;

import java.util.Date;

public abstract class Person {
    private String name;
    private Date dateOfBirth;
    private String gender;
    private int IdCard;
    private int phoneNumber;
    private String email;
    public Person(){
    }

    public Person(String name, Date dateOfBirth, String gender, int idCard, int phoneNumber, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.IdCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", IdCard=" + IdCard +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
