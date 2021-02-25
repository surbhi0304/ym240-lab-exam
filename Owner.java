package labExam1;


public class Owner {

	private String name;
	private Date date;
	private String nic;

	public Owner() {
	}

	public Owner(String name, Date date, String nic) {
		this.name = name;
		this.date = date;
		this.nic = nic;
	}

	public Owner(Owner owner) {
		this.name = owner.name;
		this.date = owner.date;
		this.nic = owner.nic;
	}

	public void input(Owner owner) {
		this.name = owner.name;
		this.date = owner.date;
		this.nic = owner.nic;
	}

	public void print() {

		System.out.println("Name : " + name);
		System.out.println("Date: " + date);
		System.out.println("NIC: " + nic);
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", date=" + date + ", nic=" + nic + "]";
	}

	
}
