package Chap6;

public class ArmorTest2 {
	public static void main(String[] args) {
		Armor suit = new Armor();
		suit = null;
		suit.setName("mark6");
		// suit.getHeight(180);
		System.out.println(suit.getName() + " : " + suit.getHeight());
	}

}