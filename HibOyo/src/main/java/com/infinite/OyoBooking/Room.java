package com.infinite.OyoBooking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oyo")
public class Room {
	
	@Id
	@Column(name="RoomID")
	private int RoomID;
	
	@Column(name="Type")
	private String Type;
	
	@Column(name="Status")
	private Status Status;
	
	@Column(name="CostPerDay")
	private int CostPerDay;

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Status getStatus() {
		return Status;
	}

	public void setStatus(Status status) {
		Status = status;
	}

	public int getCostPerDay() {
		return CostPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		CostPerDay = costPerDay;
	}

	@Override
	public String toString() {
		return "Room [RoomID=" + RoomID + ", Type=" + Type + ", Status=" + Status + ", CostPerDay=" + CostPerDay + "]";
	}

}
