package eg.fue.cs.messages;

import eg.fue.cs.users.User;

public class PrivateMessage extends Message {
    private String subject;
    private String body;
    private User from;
    private User to;

public PrivateMessage(String subject, String body, User from, User to) {
        // Check that both users have non-null jobs and that the job names match
        if (from != null && to != null && from.getJob() != null && to.getJob() != null &&
            !from.getJob().getName().equals(to.getJob().getName())) {
            System.err.println("Private messages can only be sent between users with the same job name.");
            //PrivateMessage can be only send from any one to any one of his type 
        }
        this.subject = subject;
        this.body = body;
        this.from = from;
        this.to = to;
    }

   public PrivateMessage() {
        this.subject = "";
        this.body = "";
        this.from = null;
        this.to = null;
    }


    // Getters
    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(User from) {
        this.from = from;
    }

    /**
     * @param to the to to set
     */
    public void setTo(User to) {
        this.to = to;
    }
}