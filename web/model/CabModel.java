package org.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAB_MODEL")

public class CabModel {
	@id
	public String vech_id;
	public String register_no;
	public int seat_capacity;
	public float fare_per_km;
	public String model_name;
	public String getVech_id() {
		return vech_id;
	}
	public void setVech_id(String vech_id) {
		this.vech_id = vech_id;
	}
	public String getRegister_no() {
		return register_no;
	}
	public void setRegister_no(String register_no) {
		this.register_no = register_no;
	}
	public int getSeat_capacity() {
		return seat_capacity;
	}
	public void setSeat_capacity(int seat_capacity) {
		this.seat_capacity = seat_capacity;
	}
	public float getFare_per_km() {
		return fare_per_km;
	}
	public void setFare_per_km(float fare_per_km) {
		this.fare_per_km = fare_per_km;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	
}
	