package com.experion.mainbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "manager")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Manager {

    @Id
    @Column(name="emp_id")
    private Long emp_id;


    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String emp_lastname;

    @Column(name="email")
    private String email;

    @Column(name = "mobile")
    private Long mobileNumber;

    @Column(name = "password")
    private String passWord;

    @Column(name = "roleid")
    private Integer roleId;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "manager",fetch = FetchType.LAZY)
    private Set<Chitty> chits= new HashSet<>();

    public Manager(Long emp_id, String firstName, String emp_lastname, String email, Long mobileNumber, String passWord, Integer roleId, Set<Chitty> chits) {
        this.emp_id = emp_id;
        this.firstName = firstName;
        this.emp_lastname = emp_lastname;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.passWord = passWord;
        this.roleId = roleId;
        this.chits = chits;
    }

    public Manager() {
    }


    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmp_lastname() {
        return emp_lastname;
    }

    public void setEmp_lastname(String emp_lastname) {
        this.emp_lastname = emp_lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Set<Chitty> getChits() {
        return chits;
    }

    public void setChits(Set<Chitty> chits) {
        this.chits = chits;
    }
}
