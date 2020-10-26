package councillor.jwt.api.entity;

public class RequestQuotation {
    private Quotation quotation;
    private Person client;
    private Person agent;
    private Demographicdata demographicdata;
    private Vehicle vehicle;

    public Quotation getQuotation() {
        return quotation;
    }
    public void setQuotation(Quotation quotation) {
        this.quotation = quotation;
    }
    public Person getClient() {
        return client;
    }
    public void setClient(Person client) {
        this.client = client;
    }
    public Person getAgent() {
        return agent;
    }
    public void setAgent(Person agent) {this.agent = agent; }
    public Demographicdata getDemographicdata() {
        return demographicdata;
    }
    public void setDemographicdata(Demographicdata demographicdata) {this.demographicdata = demographicdata; }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {this.vehicle = vehicle; }

}
