package IRCTC.entities;

public class User {
    private String name;
    private String password;
    private String hashedPassword;

    private List<Ticket> ticketBooked;

    private String userId;
}