
import Controllers.MainController;
import Model.School;
import View.MainView;

public class App {


	public static void main(String[] args) throws Exception {
			var school   = new School();
			var view = new MainView(); // main view for all feattures

			var controller = new MainController(view ,school);

			controller.start();

		//  each controller would call the start() method on the MainView)
		
	}

	

}
