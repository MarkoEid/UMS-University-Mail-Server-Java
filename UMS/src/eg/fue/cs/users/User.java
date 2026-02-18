package eg.fue.cs.users;

import eg.fue.cs.jobs.Job;
import eg.fue.cs.jobs.Lecturer;
import eg.fue.cs.jobs.Student;
import eg.fue.cs.jobs.TeacherAssistant;
import eg.fue.cs.messages.Message;
import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private String address;
    private Job job;
    private ArrayList<Message> inbox;
    private ArrayList<Message> sent;

   public User(String name, int age, String address, Job job) {
    if (job instanceof Student || job instanceof TeacherAssistant || job instanceof Lecturer) 
        //Any user can only be only Teacher assistants, students and lecturers  
    {
        this.job = job;
    } else {
        this.job = null;
    }
    this.name = name;
    this.age = age;
    this.address = address;
    this.inbox = new ArrayList<>();
    this.sent = new ArrayList<>();
}


public void changeJob(Job job) {
    if (job instanceof Student || job instanceof TeacherAssistant || job instanceof Lecturer)
        //Any user can only be only Teacher assistants, students and lecturers  
    {
        this.setJob(job);
    }
}


    public void receiveMsg(Message msg) {
        getInbox().add(msg);
    }
    
    public boolean sendMsg(User u, Message msg) {
        if (u == null || msg == null) {
            return false;
        }
        
        if (this.getJob() instanceof Student)
            //Student can send message to students only 
        {
            if (!(u.job instanceof Student)) {
                return false;
            }
        }
        
        if (this.getJob() instanceof TeacherAssistant) 
            //Teacher Assistant can send a message to (all Teacher assistants, students and lecturers ) of his specialty  
        {
            if (!(u.job instanceof TeacherAssistant || u.job instanceof Student || u.job instanceof Lecturer)) {
                return false;
            }
        }
        
        u.receiveMsg(msg);
        getSent().add(msg);
        return true;
    }
    
    public boolean deleteMsg(Message msg) {
        return getInbox().remove(msg);
    }

    public ArrayList<Message> getInbox() {
        return inbox;
    }

    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the job
     */
    public Job getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(Job job) {
        this.job = job;
    }

    /**
     * @param inbox the inbox to set
     */
    public void setInbox(ArrayList<Message> inbox) {
        this.inbox = inbox;
    }

    /**
     * @return the sent
     */
    public ArrayList<Message> getSent() {
        return sent;
    }

    /**
     * @param sent the sent to set
     */
    public void setSent(ArrayList<Message> sent) {
        this.sent = sent;
    }

  
    
    
    
}