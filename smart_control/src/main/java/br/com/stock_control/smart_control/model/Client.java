package br.com.stock_control.smart_control.model;

public class Client {

    private String clientName;
    private String clientRegistrationNumber;
    private String clientAddress;
    private String clientPhone;
    private String clientEmail;
    private String clientWebsite;
    private String clientType;
    private String clientContactPerson;
    private String clientContactPersonPhone;
    private String clientContactPersonEmail;
    private String clientContactPersonPosition;
    private String clientContactPersonDepartment;
    private String clientBussinessArea;

    public Client() {}

    public Client(String clientName, String clientRegistrationNumber, String clientAddress, String clientPhone,
            String clientEmail, String clientWebsite, String clientType, String clientContactPerson,
            String clientContactPersonPhone, String clientContactPersonEmail, String clientContactPersonPosition,
            String clientContactPersonDepartment, String clientBussinessArea) {
        this.clientName = clientName;
        this.clientRegistrationNumber = clientRegistrationNumber;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.clientWebsite = clientWebsite;
        this.clientType = clientType;
        this.clientContactPerson = clientContactPerson;
        this.clientContactPersonPhone = clientContactPersonPhone;
        this.clientContactPersonEmail = clientContactPersonEmail;
        this.clientContactPersonPosition = clientContactPersonPosition;
        this.clientContactPersonDepartment = clientContactPersonDepartment;
        this.clientBussinessArea = clientBussinessArea;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientRegistrationNumber() {
        return clientRegistrationNumber;
    }

    public void setClientRegistrationNumber(String clientRegistrationNumber) {
        this.clientRegistrationNumber = clientRegistrationNumber;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientWebsite() {
        return clientWebsite;
    }

    public void setClientWebsite(String clientWebsite) {
        this.clientWebsite = clientWebsite;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientContactPerson() {
        return clientContactPerson;
    }

    public void setClientContactPerson(String clientContactPerson) {
        this.clientContactPerson = clientContactPerson;
    }

    public String getClientContactPersonPhone() {
        return clientContactPersonPhone;
    }

    public void setClientContactPersonPhone(String clientContactPersonPhone) {
        this.clientContactPersonPhone = clientContactPersonPhone;
    }

    public String getClientContactPersonEmail() {
        return clientContactPersonEmail;
    }

    public void setClientContactPersonEmail(String clientContactPersonEmail) {
        this.clientContactPersonEmail = clientContactPersonEmail;
    }

    public String getClientContactPersonPosition() {
        return clientContactPersonPosition;
    }

    public void setClientContactPersonPosition(String clientContactPersonPosition) {
        this.clientContactPersonPosition = clientContactPersonPosition;
    }

    public String getClientContactPersonDepartment() {
        return clientContactPersonDepartment;
    }

    public void setClientContactPersonDepartment(String clientContactPersonDepartment) {
        this.clientContactPersonDepartment = clientContactPersonDepartment;
    }

    public String getClientBussinessArea() {
        return clientBussinessArea;
    }

    public void setClientBussinessArea(String clientBussinessArea) {
        this.clientBussinessArea = clientBussinessArea;
    }
    
    
    
}
