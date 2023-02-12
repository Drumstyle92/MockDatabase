package it.develhope.MockDatabase.controllers;


import jakarta.persistence.*;

/**
 * @author Drumstyle92
 * Class representing the student table in the mock database
 */
@Entity
@Table(name = "student")
public class Student {
    /**
     * Id variable representing the primary key of the table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Variable representing the student name table column
     */
    @Column(name = "first_name")
    private String firstName;
    /**
     * Variable representing the student last name table column
     */
    @Column(name = "last_name")
    private String lastName;
    /**
     * Email variable representing the student email table column
     */
    @Column(unique = true, name = "email")
    private String email;

    /**
     * @param id Student id parameter
     * @param firstName Student name parameter
     * @param lastName Student last name parameter
     * @param email Student email parameter
     * Constructor of the class to which it belongs
     */
    public Student(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     * Method for encapsulation
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     * Method for encapsulation
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     * Method for encapsulation
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     * Method for encapsulation
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
