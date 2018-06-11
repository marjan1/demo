package com.example.demo.data.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String address;

	private byte isGroup;

	private String name;

	//bi-directional many-to-one association to PersonGroup
	@OneToMany(mappedBy="person1")
	private List<PersonGroup> personGroups1;

	//bi-directional many-to-one association to PersonGroup
	@OneToMany(mappedBy="person2")
	private List<PersonGroup> personGroups2;

	public Person() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public byte getIsGroup() {
		return this.isGroup;
	}

	public void setIsGroup(byte isGroup) {
		this.isGroup = isGroup;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PersonGroup> getPersonGroups1() {
		return this.personGroups1;
	}

	public void setPersonGroups1(List<PersonGroup> personGroups1) {
		this.personGroups1 = personGroups1;
	}

	public PersonGroup addPersonGroups1(PersonGroup personGroups1) {
		getPersonGroups1().add(personGroups1);
		personGroups1.setPerson1(this);

		return personGroups1;
	}

	public PersonGroup removePersonGroups1(PersonGroup personGroups1) {
		getPersonGroups1().remove(personGroups1);
		personGroups1.setPerson1(null);

		return personGroups1;
	}

	public List<PersonGroup> getPersonGroups2() {
		return this.personGroups2;
	}

	public void setPersonGroups2(List<PersonGroup> personGroups2) {
		this.personGroups2 = personGroups2;
	}

	public PersonGroup addPersonGroups2(PersonGroup personGroups2) {
		getPersonGroups2().add(personGroups2);
		personGroups2.setPerson2(this);

		return personGroups2;
	}

	public PersonGroup removePersonGroups2(PersonGroup personGroups2) {
		getPersonGroups2().remove(personGroups2);
		personGroups2.setPerson2(null);

		return personGroups2;
	}

}