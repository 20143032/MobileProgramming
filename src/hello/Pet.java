package hello;

public class Pet {
	 private String name;
	   private int age; // in year
	   private double weight; //in pounds
	   
	        // �������̵�
	   public String toString() {
	      return ("Name: " + name + " Age: " + age + " years"
	            + "\nWeight: " + weight + " pounds");
	   }
	   
	   public Pet(String initialName, int initialAge, double initialWeight) {
	       // �����Ͻÿ�.
	      this.name = initialName;
	      this.age = initialAge;
	      this.weight = initialWeight;
	   }
	        // �����ε�
	   public Pet(String initialName) {
	      name = initialName;
	      age = 0;
	      weight = 0;
	   }
	   
	   public Pet( int initialAge) {
	      name = "No name yet.";
	      weight = 0;
	      if (initialAge < 0) {
	         System.out.println("Error: Negative age.");
	         System.exit(0);
	      } else
	         age = initialAge;
	   }
	   public Pet() {
	      name = "No name yet.";
	      age = 0;
	      weight = 0;
	   }
	   public void set(String newName, int newAge, double newWeight) {
	       // ���� �Ͻÿ�.
	      this.name = newName;
	      this.age = newAge;
	      this.weight = newWeight;
	   }
	   
	   public void setAge( int newAge) {
	               // �����Ͻÿ�.
	      this.age = newAge;
	   }
	   
	   public void setWeight( double newWeight) {
	         // �����Ͻÿ�.
	      this.weight = newWeight;
	       }
	   
	   public String getName() {
	      // �����Ͻÿ�.
	      return name;
	      }
	   
	   public int getAge() {
	      // �����Ͻÿ�.
	      return age;
	   }
	   
	   public double getWeight() {
	      // �����Ͻÿ�.
	      return weight;
	   }
}