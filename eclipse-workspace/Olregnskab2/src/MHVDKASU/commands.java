package MHVDKASU;

public enum commands {
	Add_Person("add person"),
	Buy_Drink("Bought drink"),
	Cheers("cheers");
	
	private final String command;
	
	commands(final String str) {
		command = str;
	}
	public final String getCommand() {
		return command;
	}
	public static class Constants {
		public static final String a_person = "Add person";
		public static final String b_drink = "Bought drink";
		public static final String cheers = "Cheers";
	}
	public static void main(String[] args) {
		for (commands p:commands.values()) {
			System.out.println(p.getCommand());
		}
	}
	

}
