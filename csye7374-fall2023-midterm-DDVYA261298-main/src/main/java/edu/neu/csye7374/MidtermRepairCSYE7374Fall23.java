package edu.neu.csye7374;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MidtermRepairCSYE7374Fall23 {
	public static final int MAJOR = 4;
	public static final int MINOR = 5;
	public static final String[] DEV_LOG = {
			"Initial revision",
			"* END OF DEV LOG - DO NOT DELETE *"
	};
	public static final String VERSION = MAJOR + "." + MINOR + DEV_LOG.length;

	public interface RepairProcedureAPI {
		String getCode();
		String getDesc();
		double getCost();
	}

	static class RepairProcedureFactory {
		private static RepairProcedureFactory instance;
		private List<RepairProcedureAPI> repairProcedures;

		private RepairProcedureFactory() {
			repairProcedures = new ArrayList<>();
		}

		public static RepairProcedureFactory getInstance() {
			if (instance == null) {
				instance = new RepairProcedureFactory();
			}
			return instance;
		}

		public RepairProcedureAPI createRepairProcedure(String code, String desc, double cost) {
			RepairProcedure repairProcedure = new RepairProcedure(code, desc, cost);
			repairProcedures.add(repairProcedure);
			return repairProcedure;
		}

		public List<RepairProcedureAPI> getAllRepairProcedures() {
			return repairProcedures;
		}
	}

	static class RepairProcedure implements RepairProcedureAPI {
		private String code;
		private String desc;
		private double cost;

		public RepairProcedure(String code, String desc, double cost) {
			this.code = code;
			this.desc = desc;
			this.cost = cost;
		}

		@Override
		public String getCode() {
			return code;
		}

		@Override
		public String getDesc() {
			return desc;
		}

		@Override
		public double getCost() {
			return cost;
		}
	}

	static class RepairBill {
		private List<RepairProcedureAPI> repairProcedures;
		private List<ItemAPI> miscellaneousExpenses;

		public RepairBill() {
			repairProcedures = new ArrayList<>();
			miscellaneousExpenses = new ArrayList<>();
		}

		public void addRepairProcedure(RepairProcedureAPI repairProcedure) {
			repairProcedures.add(repairProcedure);
		}

		public void addMiscellaneousExpense(ItemAPI item) {
			miscellaneousExpenses.add(item);
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("My Auto Repair Billing Statement:\n");
			sb.append("Repair Procedures:\n");

			for (RepairProcedureAPI repairProcedure : repairProcedures) {
				sb.append(repairProcedure.getCode()).append(" - ").append(repairProcedure.getDesc());
				sb.append(" ($").append(repairProcedure.getCost()).append(")\n");
			}

			sb.append("Miscellaneous Expenses:\n");
			for (ItemAPI item : miscellaneousExpenses) {
				sb.append(item.getName()).append(" - ").append(item.getDescription());
				sb.append(" ($").append(item.getPrice()).append(")\n");
			}

			sb.append("Total: $").append(getTotalCost());
			return sb.toString();
		}

		private double getTotalCost() {
			double totalCost = 0.0;
			for (RepairProcedureAPI repairProcedure : repairProcedures) {
				totalCost += repairProcedure.getCost();
			}
			for (ItemAPI item : miscellaneousExpenses) {
				totalCost += item.getPrice();
			}
			return totalCost;
		}
	}

	public static class Alignment implements RepairProcedureAPI {
		private final String code = "ALN";
		private final String desc = "Alignment";
		private final double cost = 75.0;
		RepairProcedureAPI repairAPI;

		private Alignment(RepairProcedureAPI a) {
			this.repairAPI = a;
		}

		public String getCode() {
			return this.code;
		}

		public String getDesc() {
			return repairAPI.getDesc() + " + " + this.desc;
		}

		public double getCost() {
			return repairAPI.getCost() + this.cost;
		}
	}

	public static class Diagnostic implements RepairProcedureAPI {
		private final String code = "DGN";
		private final String desc = "Diagnostic";
		private final double cost = 50.0;
		RepairProcedureAPI repairAPI;

		private Diagnostic(RepairProcedureAPI a) {
			this.repairAPI = a;
		}

		public String getCode() {
			return repairAPI.getCode() + " + " + this.code;
		}

		public String getDesc() {
			return repairAPI.getDesc() + " + " + this.desc;
		}

		public double getCost() {
			return repairAPI.getCost() + this.cost;
		}
	}

	private interface ItemAPI {
		int getId();
		void setId(int id);
		double getPrice();
		void setPrice(double price);
		String getName();
		void setName(String name);
		String getDescription();
		void setDescription(String description);
	}

	static class ItemFactory {
		private static final ItemFactory instance = new ItemFactory();

		private ItemFactory() {
		}

		public static ItemFactory getInstance() {
			return instance;
		}

		public ItemAPI createItem(int id, String name, String description, double price) {
			Item item = new Item(id, name, description, price);
			return item;
		}
	}

	public static class Item implements ItemAPI {
		private int id;
		private String name;
		private String description;
		private double price;

		public Item(int id, String name, String description, double price) {
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Item ID: " + id + ", Name: " + name + ", Description: " + description + ", Price: $" + price;
		}
	}

	public static class WashFactory {
		private static Wash instance = new Wash();

		public static Wash getWash() {
			return instance;
		}
	}

	public static class WaxFactory {
		private static Wax instance = new Wax();

		public static Wax getWax() {
			return instance;
		}
	}

	public static class Wash implements ItemAPI {
		private int id;
		private double price;
		private String name;
		private String description;

		private Wash() {
			this.id = 1;
			this.price = 20; // Cost of Wash item
			this.name = "Car Wash";
			this.description = "Exterior car wash service";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Item ID: " + id + ", Name: " + name + ", Description: " + description + ", Price: $" + price;
		}
	}

	public static class Wax implements ItemAPI {
		private int id;
		private double price;
		private String name;
		private String description;

		private Wax() {
			this.id = 2;
			this.price = 30; // Cost of Wax item
			this.name = "Car Waxing";
			this.description = "Car waxing service for shine and protection";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Item ID: " + id + ", Name: " + name + ", Description: " + description + ", Price: $" + price;
		}
	}

	private interface PersonAPI {
		int getId();
		void setId(int id);
		int getAge();
		void setAge(int age);
		String getFirstName();
		void setFirstName(String firstName);
		String getLastName();
		void setLastName(String lastName);
	}

	static class PersonFactory {
		private static PersonFactory instance;
		private List<PersonAPI> persons;

		private PersonFactory() {
			persons = new ArrayList<>();
		}

		public static PersonFactory getInstance() {
			if (instance == null) {
				synchronized (Person.class) {
					if (instance == null) {
						instance = new PersonFactory();
					}
				}
			}
			return instance;
		}

		public PersonAPI createPerson(int id, String firstName, String lastName, int age, RepairBill repairBill) {
			Person person = new Person(id, firstName, lastName, age, repairBill);
			persons.add(person);
			return person;
		}

		public List<PersonAPI> getAllPersons() {
			return persons;
		}
	}

	public static class Person implements PersonAPI {
		private int id;
		private String firstName;
		private String lastName;
		private int age;
		private RepairBill repairBill;

		public Person(int id, String firstName, String lastName, int age, RepairBill repairBill) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.repairBill = repairBill;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public RepairBill getRepairBill() {
			return repairBill;
		}

		public void setRepairBill(RepairBill repairBill) {
			this.repairBill = repairBill;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Customer ID: ").append(id);
			sb.append(", Name: ").append(firstName).append(" ").append(lastName);
			sb.append(", Age: ").append(age);
			sb.append(", Repair Bill: ").append(repairBill);
			return sb.toString();
		}

		public static void demo() {
			System.out.println("\n\t" + Person.class.getName() + ".demo()...");
			System.out.println("Customer's Auto Repair Billing Statement:\n");
			RepairProcedureFactory repairProcedureFactory = RepairProcedureFactory.getInstance();
			RepairProcedureAPI a = new RepairProcedure("1", "", 0.0);
			RepairBill repairBill = new RepairBill();
			repairBill.addRepairProcedure(new Alignment(new Diagnostic(a)));
			System.out.println(repairBill);
			System.out.println("\nCustomer Information with Billing Statement:\n");
			PersonFactory personFactory = PersonFactory.getInstance();
			PersonAPI dan = personFactory.createPerson(1, "Dan", "Peters", 30, repairBill);
			System.out.println(dan);
			System.out.println("Customer's Auto Repair Billing Statement with Miscellaneous Expenses (including Wash and Wax):\n");
			ItemFactory itemFactory = ItemFactory.getInstance();
			Wash wash = WashFactory.getWash();
			Wax wax = WaxFactory.getWax();
			repairBill.addMiscellaneousExpense(wash);
			repairBill.addMiscellaneousExpense(wax);
			System.out.println(dan);
			System.out.println("\n\t" + Person.class.getName() + ".demo()... done!");
		}
	}

	public static void demo() {
		System.out.println("\n\t" + MidtermRepairCSYE7374Fall23.class.getName() + ".demo() [ version " + VERSION + " ] ...");
		Person.demo();
		System.out.println("\n\t" + MidtermRepairCSYE7374Fall23.class.getName() + ".demo() ... done!");
	}
}
