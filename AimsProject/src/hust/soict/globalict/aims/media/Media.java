package hust.soict.globalict.aims.media;

public class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;

    public void nbMedia() {
	
    }
    private static int nbMedia = 0;
    public void setID(String title){
	   this.title = title;
	   this.nbMedia = nbMedia++;
	   int id = nbMedia;
    }
    public int getID() {
    	return id;
    }
    
    public class Book extends Media{

		public Book(String title, String category, float cost, int id) {
			super(title, category, cost, id);
			// TODO Auto-generated constructor stub
		}
    	
    }
    
    public class DigitalVideoDisc extends Media {

		public DigitalVideoDisc(String title, String category, float cost, int id) {
			super(title, category, cost, id);
			// TODO Auto-generated constructor stub
		}
    }
    	
    
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media(String title, String category, float cost, int id) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = id;
	}
    	

    

}
