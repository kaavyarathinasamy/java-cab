package org.web.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RATING")

public class Rating {
	public String vehicle_no;
	public int ratingstar;
	public String user_id;
	public String driver_id;
	public String getVehicle_no() {
		return vehicle_no;
	}
	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}
	public int getRatingstar() {
		return ratingstar;
	}
	public void setRatingstar(int ratingstar) {
		this.ratingstar = ratingstar;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}
	

}
