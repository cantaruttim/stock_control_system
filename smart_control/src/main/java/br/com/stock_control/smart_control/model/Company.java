package br.com.stock_control.smart_control.model;

public class Company {
    private String companyName;
    private String companyRegistrationNumber;
    private String companyAddress;
    private String companyPhone;
    private String companyEmail;
    private String companyWebsite;
    private String companyType;

    public Company() {}
    
    public Company(
        String companyName, 
        String companyRegistrationNumber, 
        String companyAddress, 
        String companyPhone,
        String companyEmail, 
        String companyWebsite, 
        String companyType) {
            this.companyName = companyName;
            this.companyRegistrationNumber = companyRegistrationNumber;
            this.companyAddress = companyAddress;
            this.companyPhone = companyPhone;
            this.companyEmail = companyEmail;
            this.companyWebsite = companyWebsite;
            this.companyType = companyType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }


}

