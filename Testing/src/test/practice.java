package test;

public class practice {
	
	String artist;
	String title;
	
	public void play() {
		System.out.println(artist + " is singing "+ title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		practice track1 = new practice();
		
		track1.artist = "Lata Mangeshkar";
		track1.title = "Rashtragit";
		
		track1.artist = "Kishore Kumuar";
		track1.title = "Mera Juta hain Japani";
		
		track1.play();
		
		
		

	}

}
