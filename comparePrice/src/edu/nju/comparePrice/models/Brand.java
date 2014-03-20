package edu.nju.comparePrice.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// Generated 2014-3-19 22:36:57 by Hibernate Tools 3.4.0.CR1



/**
 * Brand generated by hbm2java
 */
@Entity
@Table(name = "brand", catalog = "comparepricedb")
public class Brand implements java.io.Serializable {

	private int id;
	private String name;
	private Integer weight;
	private Set commodities = new HashSet(0);

	public Brand() {
	}

	public Brand(int id) {
		this.id = id;
	}

	public Brand(int id, String name, Integer weight, Set commodities) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.commodities = commodities;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 16)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "weight")
	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
	public Set getCommodities() {
		return this.commodities;
	}

	public void setCommodities(Set commodities) {
		this.commodities = commodities;
	}

}
