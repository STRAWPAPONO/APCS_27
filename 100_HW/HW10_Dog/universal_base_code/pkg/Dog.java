package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	private String name;
	private int age;
	private String breed;
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String b){
		name = a;
		age = 1;
		breed = b;
	}
	public Dog(String a, int b){
		name = a;
		age = b;
		breed = "dog dog";
	}
	public void setName(String a){
		name = a;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String a){
		breed = a;
	}
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}
	public boolean isSleeping(){
		int random = (int)((Math.random()*2)+1);
		if(random==1){
			return true;
		}
		if(random==2){
			return false;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name+" barks!");
	}
	
}
