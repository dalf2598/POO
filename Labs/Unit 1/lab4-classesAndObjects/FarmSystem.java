import model.Egg;
public class FarmSystem{
		
		public static void main(String args[]){
			Egg egg[]= new Egg[5];
			egg[0]= new Egg();
			egg[0].setId(10);
			System.out.println(egg[0].getId());
			egg[0].id = 8;
		}
}
