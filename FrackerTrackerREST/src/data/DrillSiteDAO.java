package data;

import java.util.List;

import entities.DrillSite;

public interface DrillSiteDAO {
	
	public List<DrillSite> index();
	public DrillSite show(int id);
	public DrillSite update(DrillSite ds, int id);
	public DrillSite create(DrillSite ds);
	
	public boolean remove(int id);
	

}
