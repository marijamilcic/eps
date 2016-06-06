package rs.elektrovojvodina.api.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import rs.elektrovojvodina.api.database.HibernateUtil;
import rs.elektrovojvodina.api.domain.*;


public class CalendarDAO {

	@SuppressWarnings("unchecked")
	public List<CalendarOfMaintenance> getDate(int page, int limit, String sort, String q) {
		Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
		session.beginTransaction();
		
		String queryString = "SELECT c " +
							 "FROM CalendarOfMaintenance c ";
		
		if (q != null && !q.isEmpty()) {
			queryString += "WHERE c.dateOfCreation :query AND c.status IN ()";
		}
		
		Query query = session.createQuery(queryString);
		
		if (!q.isEmpty()) {
			query.setString("name", q);
		}
		
		List<CalendarOfMaintenance> all = query
				.setFirstResult((page - 1) * limit)
				.setMaxResults(limit)
				.list();

		session.close();

		return all;
	}
	
}
