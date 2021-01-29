
public enum Minion {
	
	Dave ("This minion is named Dave."), 
	Carl ("This minion is named Carl."), 
	Kevin ("This minion is named Kevin."), 
	Stuart ("This minion is named Stuart."), 
	Jerry ("This minion is named Jerry."), 
	Tim ("This minion is named Tim."); 
	
	private final String description;
	
	Minion (String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	

}
