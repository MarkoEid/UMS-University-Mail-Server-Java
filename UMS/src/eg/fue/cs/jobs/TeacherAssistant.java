/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eg.fue.cs.jobs;

/**
 *
 * @author HP
 */
public class TeacherAssistant extends Job {
    private String name;
    private String description;
    private String faculty;
    private String department;
    private int graduationYear;

    
    public TeacherAssistant() {
        this.name = " ";
        this.description = " ";
        this.faculty = " ";
        this.department = " ";
        this.graduationYear = 0;
    }


    public TeacherAssistant(String name, String description, String faculty, String department, int graduationYear) {
        this.name = name;
        this.description = description;
        this.faculty = faculty;
        this.department = department;
        this.graduationYear = graduationYear;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the graduationYear
     */
    public int getGraduationYear() {
        return graduationYear;
    }

    /**
     * @param graduationYear the graduationYear to set
     */
    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
