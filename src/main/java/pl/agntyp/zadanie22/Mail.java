package pl.agntyp.zadanie22;


public class Mail {
    private String address;
    private String sender;
    private String subject;
    private String mailContent;

    public Mail() {
    }

    public Mail(String address, String sender, String subject, String mailContent) {
        this.address = address;
        this.sender = sender;
        this.subject = subject;
        this.mailContent = mailContent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }
}
