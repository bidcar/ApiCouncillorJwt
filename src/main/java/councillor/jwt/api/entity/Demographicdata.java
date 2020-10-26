package councillor.jwt.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.Date;

@Entity
public class Demographicdata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer demographicdataid;

    @Column
    private Integer userid;

    @Column
    private int maritalstatus;

    @Column
    private int academiclevel;

    @Column
    private String workname;

    @Column
    private String workaddress;

    @Column
    private String workphone;

    @Column
    private Double workingincome;


    public Integer getDemographicdata() { return demographicdataid; }
    public void setDemographicdata(Integer demographicdata) {
        this.demographicdataid = demographicdata;
    }
    public Integer getUserid() {return userid;}
    public void setUserid(Integer userid) {this.userid= userid;}
    public Integer getMaritalStatus() {
        return maritalstatus;
    }
    public void setMaritalstatus(Integer maritalstatus) {
        this.maritalstatus = maritalstatus;
    }
    public Integer setAcademiclevel() {
        return academiclevel;
    }
    public void setAcademiclevel(Integer academiclevel) {
        this.academiclevel = academiclevel;
    }
    public String getWorkname() {
        return workname;
    }
    public void setWorkname(String workname) {
        this.workname = workname;
    }
    public String getWorkaddress() {
        return workaddress;
    }
    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress;
    }
    public String getWorkphone() {
        return workphone;
    }
    public void setWorkphone(String workphone) {
        this.workphone = workphone;
    }
    public Double getWorkingincome () { return workingincome; }
    public void setWorkingincome(Double workingincome) {
        this.workingincome = workingincome;
    }

}
