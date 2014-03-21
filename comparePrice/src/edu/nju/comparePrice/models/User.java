package edu.nju.comparePrice.models;

// Generated 2014-3-19 22:36:57 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "comparepricedb")
public class User implements java.io.Serializable{

	private int id;
	private String password;
	private String name;
	private Set comments = new HashSet(0);
	private Set navies = new HashSet(0);

	public User() {
	}

	public User(int id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public User(int id, String password, String name, Set comments, Set navies) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.comments = comments;
		this.navies = navies;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "password", nullable = false, length = 16)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", nullable = false, length = 16)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set getNavies() {
		return this.navies;
	}

	public void setNavies(Set navies) {
		this.navies = navies;
	}

}
