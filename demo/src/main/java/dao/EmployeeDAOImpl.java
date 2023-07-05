package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import model.Employee;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	Session currentSession = entityManager.unwrap(Session.class);

	@Override
	public List<Employee> get() {
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	@Override
	public Employee get(int id) {
		return currentSession.get(Employee.class, id);
	}

	@Override
	public void save(Employee emp) {
		currentSession.persist(emp);
	}

	@Override
	public void delete(int id) {
		currentSession.remove(currentSession.get(Employee.class, id));

	}

}
