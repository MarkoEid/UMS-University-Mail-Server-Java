package eg.fue.cs.users;

import eg.fue.cs.messages.Message;
import eg.fue.cs.jobs.Job;

public class PartTimeUser extends User {
     // Default constructor
    public PartTimeUser() {
        super("", 0, "", null); // Default values
    }

    // Parameterized constructor
    public PartTimeUser(String name, int age, String address, Job job) {
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
        // Allow sending to any FullTimeUser
        if (u instanceof FullTimeUser) {
            u.receiveMsg(msg);
            this.getSent().add(msg);
            return true;
        }
        // For PartTimeUser, allow sending only if both have non-null jobs and same specialty (job type)
        else if (u instanceof PartTimeUser) {
            Job myJob = this.getJob();
            Job otherJob = u.getJob();
            if (myJob != null && otherJob != null && myJob.getClass().equals(otherJob.getClass())) {
                u.receiveMsg(msg);
                this.getSent().add(msg);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteMsg(Message msg) {
        return super.deleteMsg(msg);
    }
}
