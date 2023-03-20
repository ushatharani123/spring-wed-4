package com.StudentsApplication.studentsapplication.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity( name = "Students" )
public class Student {
            
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column( name = "idStudents" )
	    private int id;

	    private String name;

	    private String email;

	    private String address;

	    @Column( name = "birth_date" )
	    private Date birthDate;


	    public Student()
	    {
	    	super();
	    }

	    public Student( String name, String email, Date birthDate )
	    {
	        this.name = name;
	        this.email = email;
	        this.birthDate = birthDate;
	    }

	    @Override
	    public String toString()
	    {
	        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\''
	            + ", address='" + address + '\'' + ", birthDate=" + birthDate + '}';
	    }
	}

