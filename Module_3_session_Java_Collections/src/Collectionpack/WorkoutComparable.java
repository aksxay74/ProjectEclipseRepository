package Collectionpack;

	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	class Laptop implements Comparable<Laptop>{
	    int id;
	    String brand;
	    int ram;
	 int price;

	    public Laptop(int id, String brand, int ram, int  price) {
	        this.id = id;
	        this.brand = brand;
	        this.ram = ram;
	        this.price = price;
	    }

	    @Override
	    public int compareTo(Laptop la) {

	        if(this.ram!=la.ram){
	            return la.ram-this.ram;

	        }
	        return this.price-la.price;

	    }        
       
	

	    public String toString(){

	        return id + "\t" + brand+ "\t" + ram + "\t" + price;
	    }

	}

	public class WorkoutComparable {
	    public static void main(String[] args){
	        ArrayList<Laptop> list = new ArrayList<>();
	        System.out.println("ID\tBRAND\tRAM\tPRICE");
	            list.add(new Laptop(101,"ASUS",8,90000));
	            list.add(new Laptop(102,"ASUS",8,90000));
	            list.add(new Laptop(103,"ASUS",4,60000));
	            list.add(new Laptop(104,"ASUS",16,80000));

	  Collections.sort(list);
	            for(Laptop i : list){
	                System.out.println(i);
	            }



	    }
	}



