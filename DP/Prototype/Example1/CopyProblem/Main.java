package DP.Prototype.Example1.CopyProblem;

public class Main {
    public static void main(String[] args) {
        Email email = new Email("sender@example.com", "receiver@example.com", "Subject", "Body");

        Email email2 = new Email(email); //This is calling a copy constructor
        email2.display();
    }
}
