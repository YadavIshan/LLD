package DP.Prototype.Example1.CopyProblem.BetterCode;

public class Email implements Copyable<Email> {
    private String sender;
    private String receiver;
    private String subject;
    private String body;

    public Email(String sender, String receiver, String subject, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }

    public Email(Email email) {
        this.sender = email.sender;
        this.receiver = email.receiver;
        this.subject = email.subject;
        this.body = email.body;
    }

    @Override
    public Email copy() {
        return new Email(this);
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void display() {
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
