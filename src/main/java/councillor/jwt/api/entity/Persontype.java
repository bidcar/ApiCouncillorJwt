package councillor.jwt.api.entity;

import javax.persistence.*;

@Entity
public class Persontype {
    @Column
    private String description;

    @Column
    private Integer councillorid;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer persontypeid;

    public Integer getPersonTypeId() { return persontypeid; }
    public String getDescription() {
        return description;
    }
    public Integer getCouncillorId() {
        return councillorid;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setcouncillorid(Integer councillorid) {
        this.councillorid = councillorid;
    }
    public void setPersontypeid(Integer persontypeid) {
        this.persontypeid = persontypeid;
    }




}

