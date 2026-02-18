package eg.fue.cs.users;

import eg.fue.cs.jobs.Job;
import eg.fue.cs.messages.Message;

public class FullTimeUser extends User {
    // Default constructor
    public FullTimeUser() {
        super("", 0, "", null); // Default values
    }

    // Parameterized constructor
    public FullTimeUser(String name, int age, String address, Job job) {
        super(name, age, address, job);
    }
    
    @Override
    public void changeJob(Job job) {
        super.changeJob(job);
    }
    
    @Override
    public void receiveMsg(Message msg) {
        super.receiveMsg(msg);
    }
    
    @Override
    public boolean sendMsg(User u, Message msg) {
        if (u == null || msg == null) {
            return false;
        }
        u.receiveMsg(msg);
        this.getSent().add(msg);
        return true;
    }
    
    @Override
    public boolean deleteMsg(Message msg) {
        return super.deleteMsg(msg);
    }
}
