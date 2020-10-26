package councillor.jwt.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResponseQuotation {
    private String id;
    private String message;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message= message;}

}
