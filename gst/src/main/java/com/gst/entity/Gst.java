package com.gst.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gsts")
public class Gst {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int taxpercentage;
private long hsn;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTaxpercentage() {
	return taxpercentage;
}
public void setTaxpercentage(int taxpercentage) {
	this.taxpercentage = taxpercentage;
}
public long getHsn() {
	return hsn;
}
public void setHsn(long hsn) {
	this.hsn = hsn;
}

}
