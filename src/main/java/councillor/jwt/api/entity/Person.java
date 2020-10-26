package councillor.jwt.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;

    @Column
    private Integer councillorid;

    @Column
    private String name;

    @Column
    private String lastname;

    @Column
    private String email;

    @Column
    private String phonenumber;

    @Column
    private String address;

    @Column
    private Date birthdate;

    @Column
    private int gender;

    @Column
    private int persontypeid;

    @Column
    private boolean status;

    public Integer getUserid() {
        return userid;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public Integer getCouncillorId() {return councillorid;}
    public void setCouncillorid(Integer councillorid) {this.councillorid= councillorid;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getBirthdate() { return birthdate; }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public int getGender () { return gender; }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public int getPersontypeid () { return persontypeid; }
    public void setPersontypeid(int persontypeid) {
        this.persontypeid = persontypeid;
    }
    public boolean getStatus () { return status; }
    public void setStatus(boolean status) {
        this.status = status;
    }


}
