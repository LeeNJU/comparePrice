package edu.nju.comparePrice.models;

// Generated 2014-3-19 22:36:57 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Commodity generated by hbm2java
 */
@Entity
@Table(name = "commodity", catalog = "comparepricedb")
public class Commodity implements java.io.Serializable {

	private int id;
	private Brand brand;
	private String name;
	private double price;
	private int unit;
	private String link;
	private Set forbidCommodities = new HashSet(0);
	private Set comments = new HashSet(0);

	public Commodity() {
	}

	public Commodity(int id, Brand brand, String name, double price, int unit,
			String link) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.link = link;
	}

	public Commodity(int id, Brand brand, String name, double price, int unit,
			String link, Set forbidCommodities, Set comments) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.link = link;
		this.forbidCommodities = forbidCommodities;
		this.comments = comments;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brandId", nullable = false)
	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Column(name = "name", nullable = false, length = 16)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "unit", nullable = false)
	public int getUnit() {
		return this.unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	@Column(name = "link", nullable = false)
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "commodity")
	public Set getForbidCommodities() {
		return this.forbidCommodities;
	}

	public void setForbidCommodities(Set forbidCommodities) {
		this.forbidCommodities = forbidCommodities;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "commodity")
	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}
