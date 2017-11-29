package org.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="BILL")
public class Bill {
	
	public int bill_no;
	public String date;
	public float start_km;
	public float end_km;
	public float total_km;
	public float travel_charge;
	public float ac_charge;
	public float waiting_charge;
	public float gst;
	public float total_charge;
	public int getBill_no() {
		return bill_no;
	}
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getStart_km() {
		return start_km;
	}
	public void setStart_km(float start_km) {
		this.start_km = start_km;
	}
	public float getEnd_km() {
		return end_km;
	}
	public void setEnd_km(float end_km) {
		this.end_km = end_km;
	}
	public float getTotal_km() {
		return total_km;
	}
	public void setTotal_km(float total_km) {
		this.total_km = total_km;
	}
	public float getTravel_charge() {
		return travel_charge;
	}
	public void setTravel_charge(float travel_charge) {
		this.travel_charge = travel_charge;
	}
	public float getAc_charge() {
		return ac_charge;
	}
	public void setAc_charge(float ac_charge) {
		this.ac_charge = ac_charge;
	}
	public float getWaiting_charge() {
		return waiting_charge;
	}
	public void setWaiting_charge(float waiting_charge) {
		this.waiting_charge = waiting_charge;
	}
	public float getGst() {
		return gst;
	}
	public void setGst(float gst) {
		this.gst = gst;
	}
	public float getTotal_charge() {
		return total_charge;
	}
	public void setTotal_charge(float total_charge) {
		this.total_charge = total_charge;
	}
}
