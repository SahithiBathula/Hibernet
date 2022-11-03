package com.infinite.OyoHib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class OyoDAO {
SessionFactory sessionFactory;
	
	public  String generateRoomId(){
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession(); 
		Criteria cr=session.createCriteria(Room.class);
		List<Room> roomList= cr.list();
		session.close();
		String id=roomList.get(roomList.size()-1).getRoomID();
		int id1=Integer.parseInt(id.substring(1));
		id1++;
		String id2=String.format("R%03d",id1);
		return id2;
		
		
		
	}
	
	public String addRoom(Room room){
		//room.setRoomId("R001");
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession(); 
	    String roomId = generateRoomId();
	    room.setRoomID(roomId);
	    room.setStatus(Status.AVAILABLE);
		Criteria cr=session.createCriteria(Room.class);
		Transaction tran = session.beginTransaction();
		session.save(room);
		tran.commit();
		session.close();
		return "Room Added Successfully  ";
		
		
		
		
		
		
		
	}
	public List<Room> searchRoom(String searchtype, String searchvalue) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession(); 
		Criteria cr = session.createCriteria(Room.class);

		if (searchtype.equals("roomId")) {
			
			cr.add(Restrictions.eq("roomId",searchtype));
		} 
		if (searchtype.equalsIgnoreCase("type")) {
			cr.add(Restrictions.eq("type", searchvalue));
		}

		if (searchtype.equalsIgnoreCase("status")) {
			cr.add(Restrictions.eq("status", searchvalue));
		}
		if (searchtype.equalsIgnoreCase("costPerDay")) {
			
			int costPerDay =Integer.parseInt(searchvalue);
			cr.add(Restrictions.eq("costPerDay", searchvalue));
		}

		List<Room> lst = cr.list();
			return lst;
	}
	
	
	public Room searchById(String roomId) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession(); 
		Criteria cr = session.createCriteria(Room.class);
			cr.add(Restrictions.eq("roomId", roomId));
		List<Room> roomList = cr.list();
		return roomList.get(0);
	}

}