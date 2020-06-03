package managedBeans;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import dataAccess.PetDAO;
import entities.Pet;

@ManagedBean(name = "petMB")
@SessionScoped
public class PetMB implements Serializable {
	private PetDAO petDAO;

	private int id;
	private String petName;
	private int petType;
	private int petAge;
	private int petSize;
	private String gender;
	private String shortDesc;
	private String detailDesc;

	private String imgPath;

	// Contractor
	public PetMB() {
		petDAO = new PetDAO();
	}

	public void getPet(int idPet) {
		Pet pet = petDAO.getPet(idPet);

		// Set pet data to managed bean properties
		this.id = pet.getId();
		this.petName = pet.getPetName();
		this.petType = pet.getPetType();
		this.petAge = pet.getPetAge();
		this.petSize = pet.getPetSize();
		this.gender = pet.getGender();
		this.shortDesc = pet.getShortDesc();
		this.detailDesc = pet.getDetailDesc();
	}

	public List<Pet> getAllPets() {
		return petDAO.getAllPets();
	}

	public void createPet() {

		Pet pet = new Pet();

		// Set new data to pet
		pet.setPetName(this.petName);
		pet.setPetType(this.petType);
		pet.setPetAge(this.petAge);
		pet.setPetSize(this.petSize);
		pet.setGender(this.gender);
		pet.setShortDesc(this.shortDesc);
		pet.setDetailDesc(this.detailDesc);
		
		// File data for save

		petDAO.create(pet);
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetType() {
		return petType;
	}

	public void setPetType(int petType) {
		this.petType = petType;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public int getPetSize() {
		return petSize;
	}

	public void setPetSize(int petSize) {
		this.petSize = petSize;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getDetailDesc() {
		return detailDesc;
	}

	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}
