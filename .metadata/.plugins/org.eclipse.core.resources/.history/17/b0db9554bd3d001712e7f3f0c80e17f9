package entityTests;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.DrillSite;

public class DrillSiteTests {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	
	@Before
	public void setUp(){
		emf = Persistence.createEntityManagerFactory("FrackerTracker");
		em = emf.createEntityManager();
	}
	
	@After
	public void tearDown() throws Exception{
		em.close();
		emf.close();
	}
	@Test
	public void test() {
		boolean test = true;
		assertEquals(test, true);
	}
	
	@Test
	public void getDrillSite(){
		DrillSite ds = em.find(DrillSite.class, 1);
		assertEquals("Site1", ds.getName());
	}

}
