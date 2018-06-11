package com.example.demo.data.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the person_group database table.
 * 
 */
@Embeddable
public class PersonGroupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="group_id")
	private int groupId;

	@Column(name="member_id")
	private int memberId;

	public PersonGroupPK() {
	}
	public int getGroupId() {
		return this.groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getMemberId() {
		return this.memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PersonGroupPK)) {
			return false;
		}
		PersonGroupPK castOther = (PersonGroupPK)other;
		return 
			(this.groupId == castOther.groupId)
			&& (this.memberId == castOther.memberId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.groupId;
		hash = hash * prime + this.memberId;
		
		return hash;
	}
}