package DP.Prototype.Example1.CopyProblem;


//This is Still violating OCP
public class AdministrativeEmail extends Email{
    private String cc;
    private String bcc;

    public AdministrativeEmail(String cc, String bcc, String sender, String receiver, String subject, String body) {
        super(sender, receiver, subject, body);
        this.cc = cc;
        this.bcc = bcc;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }
}
