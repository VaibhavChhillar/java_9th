import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDAO {
    private SessionFactory factory;

    public StudentDAO() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public void createStudent(Student s) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(s);
            session.getTransaction().commit();
        }
    }

    // Add read, update, delete methods similarly
}
