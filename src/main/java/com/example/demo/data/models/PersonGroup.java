package com.example.demo.data.models;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the person_group database table.
 */
@Entity
@Table(name = "person_group")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.group", joinColumns = @JoinColumn(name = "group_id", nullable = false)),
        @AssociationOverride(name = "primaryKey.member", joinColumns = @JoinColumn(name = "member_id", nullable = false))
})
public class PersonGroup implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private PersonGroupPK primaryKey = new PersonGroupPK();

    private int quantity;

    //bi-directional many-to-one association to Person
//	@ManyToOne
    //@JoinColumn(name="group_id")
//	@MapsId("groupId")
    private Person group;

    //bi-directional many-to-one association to Person
    //@ManyToOne
    //@JoinColumn(name="member_id")
//	@MapsId("memberId")
    private Person members;

    public PersonGroup() {
    }

    public PersonGroupPK getPrimaryKey() {
        return this.primaryKey;
    }

    public void setPrimaryKey(PersonGroupPK primaryKey) {
        this.primaryKey = primaryKey;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Transient
    public Person getGroup() {
        return this.primaryKey.getGroup();
    }

    public void setGroup(Person group) {
        this.primaryKey.setGroup(group);
    }

    @Transient
    public Person getMembers() {
        return this.primaryKey.getMembers();
    }

    public void setMembers(Person members) {
        this.primaryKey.setMembers(members);
    }

}