package test;

public class Human {	
private double weight;
private boolean age;
public boolean getAge() {
	return age;
}
public void setage(boolean age,double weight) {
	this.age = age;
	this.weight=weight;
}
public double getWeight() {
	return weight;
}
public static void main(String[] args) {
	Human ob =new Human();
    ob.setage(true, 100.44);
//      int d= ob.getWeight();
//      int b= ob.getAge();
	System.out.println(ob.getAge()+" "+ob.getWeight());
}
}
