package councillor.jwt.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RequestReports {
    private String startdate;
    private String enddate;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    public String getStartdate() {
        return startdate;
    }
    public void setStartdate(String startdate) {this.startdate = startdate; }
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    public String getEnddate() {
        return enddate;
    }
    public void setEnddate(String enddate) {this.enddate = enddate; }
}
