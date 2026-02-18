package eg.fue.cs.messages;

import eg.fue.cs.users.User;

public class PublicMessage extends Message {
    private String subject;
    private String body;
    private User from;
    private User to;

    public PublicMessage(String subject, String body, User from, User to) {
        this.subject = subject;
        this.body = body;
        this.from = from;
        this.to = to;
    }
       public PublicMessage() {
        this.subject = "";
        this.body = "";
        this.from = null;
        this.to = null;
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

    public User getTo() {
        return to;
    }


}