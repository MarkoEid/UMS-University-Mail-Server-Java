/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eg.fue.cs.messages;

import eg.fue.cs.users.User;

/**
 *
 * @author HP
 */
public class Message {
     private String subject;
    private String body;
    private User from;
    private User to;

    // Default constructor
    public Message() {
        this.subject = "";
        this.body = "";
        this.from = null;
        this.to = null;
    }

    // Parameterized constructor
    public Message(String subject, String body, User from, User to) {
        this.subject = subject;
        this.body = body;
        this.from = from;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }
}
