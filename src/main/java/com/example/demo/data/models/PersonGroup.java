package com.example.demo.data.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the person_group database table.
 * 
 */
@Entity
@Table(name="person_group")
public class PersonGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PersonGroupPK id;

	private int quantity;

	//bi-directional many-to-one association to Person
	@ManyToOne
	//@JoinColumn(name="group_id")
	@MapsId("groupId")
	private Person person1;

	//bi-directional many-to-one association to Person
	@ManyToOne
	//@JoinColumn(name="member_id")
	@MapsId("memberId")
	private Person person2;

	public PersonGroup() {
	}

	public PersonGroupPK getId() {
		return this.id;
	}

	public void setId(PersonGroupPK id) {
		this.id = id;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Person getPerson1() {
		return this.person1;
	}

	public void setPerson1(Person person1) {
		this.person1 = person1;
	}

	public Person getPerson2() {
		return this.person2;
	}

	public void setPerson2(Person person2) {
		this.person2 = person2;
	}

}