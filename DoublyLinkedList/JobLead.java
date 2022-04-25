package DoublyLinkedList;

public class JobLead {
    // instance variable
   private String companyFullName;
   private String contactFullName;
   private String phoneNumber;
   private String title;
   private String description;
     // constructor
    public JobLead(String companyFullName, String contactFullName, String phoneNumber, String title, String description) {
        this.companyFullName = companyFullName;
        this.contactFullName = contactFullName;
        this.phoneNumber = phoneNumber;
        this.title = title;
        this.description = description;
    }
    // getter and setters
    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public String getContactFullName() {
        return contactFullName;
    }

    public void setContactFullName(String contactFullName) {
        this.contactFullName = contactFullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    // toString method override
    public String toString() {
        return
                "company: '" + companyFullName + '\'' +
                ", Contact: '" + contactFullName + '\'' +
                ", phone: '" + phoneNumber + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'';

    }
}
