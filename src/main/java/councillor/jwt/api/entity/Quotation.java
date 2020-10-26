package councillor.jwt.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Quotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer quotationid;

    @Column
    private Integer councillorid;

    @Column
    private Integer clientid;

    @Column
    private Integer agentsalesid;

    @Column
    private Integer vehicleid;

    @Column
    private Double initialfee;

    @Column
    private String currency;

    @Column
    private Double interestrate;

    @Column
    private Integer period;

    @Column
    private String descriptionofaccessories;

    @Column
    private Double vehicleamount;

    @Column
    private Double accesoriesamount;

    @Column
    private String quotarate;

    @Column
    private Double exchangerate;

    @Column
    private Date datecreated;


    public Integer getQuotationid() {
        return quotationid;
    }
    public void setQuotationid(Integer quotationid) {
        this.quotationid = quotationid;
    }
    public Integer getCouncillorId() {return councillorid;}
    public void setCouncillorid(Integer councillorid) {this.councillorid= councillorid;}
    public Integer getClientid() {return clientid; }
    public void setClientid(Integer clienid) {
        this.clientid = clienid;
    }
    public Integer getAgentsalesid() {
        return agentsalesid;
    }
    public void setAgentsalesid(Integer agentsalesid) {
        this.agentsalesid = agentsalesid;
    }
    public Integer getVehicleid() {
        return vehicleid;
    }
    public void setVehicleid(Integer vehicleid) {
        this.vehicleid = vehicleid;
    }
    public Double getInitialfee() {
        return initialfee;
    }
    public void setInitialfee(Double initialfee) {
        this.initialfee = initialfee;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Double getInterestrate() {
        return interestrate;
    }
    public void setInterestrate(Double interestrate) {
        this.interestrate = interestrate;
    }
    public Integer getPeriod() {
        return period;
    }
    public void setPeriod(Integer period) {
        this.period = period;
    }
    public String getDescriptionofaccessories() {
        return descriptionofaccessories;
    }
    public void setDescriptionofaccessories(String descriptionofaccessories) {
        this.descriptionofaccessories = descriptionofaccessories;
    }
    public Double getVehicleamount() {
        return vehicleamount;
    }
    public void setVehicleamount(Double vehicleamount) {
        this.vehicleamount = vehicleamount;
    }
    public Double getAccesoriesamount() {
        return accesoriesamount;
    }
    public void setAccesoriesamount(Double accesoriesamount) {
        this.accesoriesamount = accesoriesamount;
    }
    public String getQuotarate() {
        return quotarate;
    }
    public void setQuotarate(String quotarate) {
        this.quotarate = quotarate;
    }
    public Double getExchangerate() {
        return exchangerate;
    }
    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }
    public Date getDatecreated() {
        return datecreated ;
    }
    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }
}
