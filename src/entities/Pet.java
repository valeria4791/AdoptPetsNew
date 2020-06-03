package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PetData
 *
 */
@Entity
@NamedQueries({ @NamedQuery(name = "AllPets", query = "SELECT p FROM Pet p") })
public class Pet implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String petName;
	private int petType;
	private int petAge;
	private int petSize;
	private String gender;
	private String shortDesc;
	private String detailDesc;

	public Pet() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public String getPetName() {
		return this.petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public int getPetType() {
		return this.petType;
	}

	public void setPetType(int petType) {
		this.petType = petType;
	}

	public int getPetAge() {
		return this.petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public int getPetSize() {
		return this.petSize;
	}

	public void setPetSize(int PetSize) {
		this.petSize = PetSize;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getShortDesc() {
		return this.shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getDetailDesc() {
		return this.detailDesc;
	}

	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

}
