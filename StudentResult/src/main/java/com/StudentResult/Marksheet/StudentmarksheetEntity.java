package com.StudentResult.Marksheet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mark_sheet1")
public class StudentmarksheetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int roll_no;
	private int sem1_theory;
	private int sem1_practical;
	private int sem2_theory;
	private int sem2_practical;
	private int sem1_total;
	private int sem2_total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRollno(int roll_no) {
		this.roll_no = roll_no;
	}

	public int getSem1_theory() {
		return sem1_theory;
	}

	public void setSem1_theory(int sem1_theory) {
		this.sem1_theory = sem1_theory;
	}

	public int getSem1_practical() {
		return sem1_practical;
	}

	public void setSem1_practical(int sem1_practical) {
		this.sem1_practical = sem1_practical;
	}

	public int getSem2_theory() {
		return sem2_theory;
	}

	public void setSem2_theory(int sem2_theory) {
		this.sem2_theory = sem2_theory;
	}

	public int getSem2_practical() {
		return sem2_practical;
	}

	public void setSem2_practical(int sem2_practical) {
		this.sem2_practical = sem2_practical;
	}

	public int getSem1_total() {
		return sem1_total;
	}

	public void setSem1_total(int sem1_total) {
		this.sem1_total = sem1_total;
	}

	public int getSem2_total() {
		return sem2_total;
	}

	public void setSem2_total(int sem2_total) {
		this.sem2_total = sem2_total;
	}

}
