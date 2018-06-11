package com.example.demo.data.models;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

/**
 * The primary key class for the person_group database table.
 */
@Embeddable
public class PersonGroupPK implements Serializable {
    private static final long serialVersionUID = 876771378160122534L;
    //default serial version id, required for serializable classes.

    @ManyToOne
    private Person group;

    @ManyToOne
    private Person members;

    public PersonGroupPK() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonGroupPK that = (PersonGroupPK) o;
        return Objects.equals(group, that.group) &&
                Objects.equals(members, that.members);
    }

    @Override
    public int hashCode() {

        return Objects.hash(group, members);
    }

    public Person getGroup() {

        return group;
    }

    public void setGroup(Person group) {
        this.group = group;
    }

    public Person getMembers() {
        return members;
    }

    public void setMembers(Person members) {
        this.members = members;
    }
}