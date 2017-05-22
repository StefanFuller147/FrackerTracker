package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="drill_sites")
public class DrillSite {
	
	//fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(name="num_of_wells")
	private int numOfWells;

	
	//getters and setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfWells() {
		return numOfWells;
	}

	public void setNumOfWells(int numOfWells) {
		this.numOfWells = numOfWells;
	}

	
	//toString()
	@Override
	public String toString() {
		return "DrillSite [id=" + id + ", name=" + name + ", numOfWells=" + numOfWells + "]";
	}
	
	

}
