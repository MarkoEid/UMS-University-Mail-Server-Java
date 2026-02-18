package ums;

import eg.fue.cs.jobs.Job;
import eg.fue.cs.jobs.Lecturer;
import eg.fue.cs.jobs.Student;
import eg.fue.cs.jobs.TeacherAssistant;
import eg.fue.cs.users.User;
import eg.fue.cs.messages.Message;
import eg.fue.cs.messages.PrivateMessage;
import eg.fue.cs.messages.PublicMessage;
import eg.fue.cs.users.FullTimeUser;
import eg.fue.cs.users.PartTimeUser;

public class UMS {
    public static void main(String[] args) {
        
////         Create jobs
//               Job taJob = new TeacherAssistant("TA", "Assists lecturers", "CS Faculty", "CS Dept", 2022);
//        Job lecturerJob = new Lecturer("Lecturer", "Teaches students", "CS Faculty", "CS Dept", 5);
//        Job studentJob = new Student("Student", "Learns subjects", "CS Faculty", "CS Dept", 3);
//
//        // Create users
//        User user1 = new User("Alice", 25, "123 Street, City", taJob);
//        User user2 = new User("Bob", 30, "456 Avenue, City", lecturerJob);
//
//        // Create and send messages
//        Message msg1 = new Message("Greeting", "Hello Bob!", user1, user2);
//        
//        user1.sendMsg(user2, msg1);
//        user2.receiveMsg(msg1);
//         System.out.println(user1.getInbox().size());
//         System.out.println(user2.getInbox().size());
//        // Change job
//       System.out.println("Before change: " + user1.getJob());
//     user1.changeJob(studentJob);
//        System.out.println("After change: " + user1.getJob());
//
////         Delete a message
//        user2.deleteMsg(msg1);
//
//       System.out.println("User2 Inbox: " + user2.getInbox().size());
//        System.out.println("User1 Sent Messages: " + user1.getSent().size());

        
///////////////////////first version/////////////////////////////////



//      // Creating Jobs
//        Job taJob = new TeacherAssistant("TA", "Assists lecturers", "CS Faculty", "CS Dept", 2022);
//        Job lecturerJob = new Lecturer("Lecturer", "Teaches students", "CS Faculty", "CS Dept", 5);
//        Job studentJob = new Student("Student", "Learns subjects", "CS Faculty", "CS Dept", 3);
//
//        // Creating Users
//        User ta = new User("John", 25, "123 Street", taJob);
//        User lecturer = new User("Dr. Smith", 40, "456 Avenue", lecturerJob);
//        User student1 = new User("Alice", 20, "789 Boulevard", studentJob);
//        User student2 = new User("Bob", 21, "789 Boulevard", studentJob);
//
//        // Creating Messages
//        Message msg1 = new Message("Hello", "Welcome to the system", ta, student1);
//        Message msg2 = new Message("Assignment", "Submit by Friday", lecturer, student1);
//        Message msg3 = new Message("Group Work", "Let's collaborate", student1, student2);
//
//        // Testing Messaging
//        System.out.println(ta.sendMsg(student1, msg1)); // Should be true
//        System.out.println(lecturer.sendMsg(student1, msg2)); // Should be true
//        System.out.println(student1.sendMsg(lecturer, msg3)); // Should be false
//        System.out.println(ta.sendMsg(student1, msg1)); // Should be true
//
//        // Testing Inbox
//        System.out.println(student1.getInbox().size()); // Should be 2
//        System.out.println(student2.getInbox().size()); // Should be 1
//
//        // Deleting a Message
//        student1.deleteMsg(msg1);
//        System.out.println(student1.getInbox().size()); // Should be 1
//
//        // Changing Job
//        student1.changeJob(taJob);
//        System.out.println(student1.getJob().getName()); // Should be "TA"

///////////////////////////second version////////////////////
///////////////////////////review the instance////////////////////
//////////////////////////get.class///////////////////////

// Creating Jobs
Job taJob = new TeacherAssistant("TA", "Teaching Support", "CS Faculty", "CS Department", 2022);
Job lecturerJob = new Lecturer("Lecturer", "Teaching", "CS Faculty", "CS Department", 5);
Job studentJob = new Student("Student", "Learning", "CS Faculty", "CS Department", 2);
//
//// Creating Users
PartTimeUser partTimeUser1 = new PartTimeUser("Ali", 25, "Cairo", taJob);
PartTimeUser partTimeUser2 = new PartTimeUser("Sara", 23, "Alexandria", taJob);
PartTimeUser partTimeUser3 = new PartTimeUser("ahmed", 23, "zzz", studentJob);
FullTimeUser fullTimeUser1 = new FullTimeUser("Omar", 30, "Giza", lecturerJob);
FullTimeUser fullTimeUser2 = new FullTimeUser("Laila", 22, "Tanta", studentJob);

// Creating Messages
Message msg1 = new PublicMessage("Welcome", "Hello everyone!", partTimeUser1, fullTimeUser1);
Message msg2 = new PrivateMessage("Important", "Meeting at 5 PM", fullTimeUser2, partTimeUser3);
Message msg3 = new PublicMessage("Notice", "Exam postponed", fullTimeUser2, fullTimeUser1);

// Sending Messages
System.out.println("Sending Messages:");
System.out.println(partTimeUser1.sendMsg(fullTimeUser1, msg1)); // Allowed (PartTimeUser -> FullTimeUser)
System.out.println(fullTimeUser1.sendMsg(partTimeUser1, msg2)); // Allowed (FullTimeUser -> PartTimeUser)
System.out.println(fullTimeUser2.sendMsg(fullTimeUser1, msg3)); // Allowed (FullTimeUser -> FullTimeUser)

// Trying invalid message sending
Message msg4 = new PrivateMessage("Hello", "How are you?", partTimeUser1, fullTimeUser2);
System.out.println(partTimeUser1.sendMsg(partTimeUser2, msg4)); // Not allowed 

// Receiving Messages (corrected method name)
System.out.println("Receiving Messages:");
fullTimeUser1.receiveMsg(msg1);
partTimeUser1.receiveMsg(msg2);
fullTimeUser1.receiveMsg(msg3);

// Deleting a Message
System.out.println("Deleting Message:");
System.out.println(fullTimeUser1.deleteMsg(msg1)); // Should return true


      


    }
    


    
}

