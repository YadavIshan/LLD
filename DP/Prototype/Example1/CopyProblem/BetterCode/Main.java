package DP.Prototype.Example1.CopyProblem.BetterCode;

public class Main {
    public static void main(String[] args) {
        Email email = new Email("sender@example.com", "receiver@example.com", "Subject", "Body");
        //Here our driver/Main was deciding which copy constructor to call that was violating the OCP
        Email email2 = new Email(email); // This is calling a copy constructor


        //Prototype Pattern
        Email email3 = email.copy();
        AdministrativeEmail administrativeEmail = new AdministrativeEmail("cc@example.com", "BCC@example.com", "sender@example.com", "receiver@example.com", "Subject", "Body");
        //Here instead of Main/Driver class determining which copy constructor to call, the object itself is determining which copy constructor to call
        AdministrativeEmail administrativeEmail2 = administrativeEmail.copy();
    }
}
