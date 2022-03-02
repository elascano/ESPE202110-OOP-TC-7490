
package ec.edu.espe.cbook.model;

import java.time.LocalDate;

/**
 *
 * @author Cristian Arroba
 */
public class Contact {
    private int id;
    private String name;
    private String hobby;
    private String cellphoneNumber;
    private String sex;
    private String group;
    private float salary;
    //private LocalDate birthDate;
    private String birthDate;
    private String comments;

    public Contact(int id, String name, String hobby, String cellphoneNumber, String sex, String group, float salary, String birthDate, String comments) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
        this.cellphoneNumber = cellphoneNumber;
        this.sex = sex;
        this.group = group;
        this.salary = salary;
        this.birthDate = birthDate;
        this.comments = comments;
    }

    
    //Constructor LocalDate BirthDate
    /*public Contact(int id, String name, String hobby, String cellphoneNumber, String sex, String group, float salary, LocalDate birthDate, String comments) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
        this.cellphoneNumber = cellphoneNumber;
        this.sex = sex;
        this.group = group;
        this.salary = salary;
        //this.birthDate = birthDate;
        this.birthDate = birthDate;
        this.comments = comments;
    }
    
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hobby the hobby to set
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * @return the cellphoneNumber
     */
    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    /**
     * @param cellphoneNumber the cellphoneNumber to set
     */
    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the birthDate
     */
    //public LocalDate getBirthDate() {
        //return birthDate;
    //}
    
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    //public void setBirthDate(LocalDate birthDate) {
      //  this.birthDate = birthDate;
    //}
    
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    


    
    
}