package abstractclass;

public class OlympicsResultsDisplayer {
	public static void main(String[] args) {
		
		Athelete oAthelete = new NeerajChopra();
		oAthelete.eat();
		oAthelete.sleep();
		

		oAthelete.event();
		oAthelete.accomplishment();

		oAthelete = new RaviKumar();
		oAthelete.event();
		oAthelete.accomplishment();

		oAthelete = new PVSindhu();
		oAthelete.event();
		oAthelete.accomplishment();

	}
}
