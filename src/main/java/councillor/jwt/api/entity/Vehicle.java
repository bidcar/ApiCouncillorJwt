package councillor.jwt.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleid;

    @Column
    private Integer councillorid;

    @Column
    private Integer vehicletypeid;

    @Column
    private String brand;

    @Column
    private Integer model;

    @Column
    private String color;

    public Integer getVehicleid() {
        return vehicleid;
    }
    public void setVehicleid(Integer vehicleid) {
        this.vehicleid = vehicleid;
    }
    public Integer getCouncillorid() {return councillorid;}
    public void setCouncillorid(Integer councillorid) {this.councillorid= councillorid;}
    public Integer getVehicletypeid() {
        return vehicletypeid;
    }
    public void setVehicletypeid(Integer vehicletypeid) {
        this.vehicletypeid = vehicletypeid;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Integer getModel() {
        return model;
    }
    public void setModel(Integer model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
