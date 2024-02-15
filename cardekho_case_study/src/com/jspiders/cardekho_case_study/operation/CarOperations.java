package com.jspiders.cardekho_case_study.operation;

import java.util.*;
import com.jspiders.cardekho_case_study.entity.*;
import com.jspiders.cardekho_case_study.main.CarDekhoMenu;


public class CarOperations {
	
	int id;
	String name;
	String fuelType;
	String brand;
	double price;
	boolean found=false;
	
	
	
	static ArrayList<Car> cars=createList();
	public static ArrayList<Car> createList() {
		ArrayList<Car> car=new ArrayList<Car>();
		return car;
	}	
    public void addCarDetails() {
    	Scanner inp=new Scanner(System.in);
    	System.out.println("HOW MANY CARS DO YOU WANT TO ADD");
        int carNo=inp.nextInt();
        for (int i = 1;i<=carNo; i++) {
			
		
	 	System.out.println("enter your Car Id :- ");
	int car_id=inp.nextInt();
	System.out.println("enter your Car Name :- ");
	          inp.nextLine();
	String name=inp.nextLine();
	System.out.println("enter your Car Brand :- ");
		String brand=inp.nextLine();
	System.out.println("enter your Car Model :- ");
		String model=inp.nextLine();
	System.out.println("enter your Car fuelType :- ");
		String fuelType=inp.nextLine();
	System.out.println("enter your Car Price :- ");
	double price=inp.nextDouble();
	cars.add(new Car(car_id,name,brand,model,fuelType,price));
	System.out.println("\n\n"+name+" Car details added successfully !!! ");
        }
//        inp.close();
}
    
    
    
    
public void searchCarDetails() {
	for(Car e:cars ) {
       System.out.println(e);		
	}
	Scanner inp=new Scanner(System.in);
	System.out.println("======= Search Car by ======\n");
	System.out.println("1.Car Name\n2.Car Brand\n3.Car FuelType\n4.Go Back\n");
	int choice=inp.nextInt();
	switch (choice) {
	case 1:
		System.out.println("enter your Car name");
		      inp.nextLine();
		name=inp.nextLine();
		for(Car e:cars ) {
			if(e.getName().equals(name)) {
				System.out.println(e);
				found=true;
			}
		}
		if (!found) {
			System.out.println("Car with this "+ name+" is not present");
		}
		break;
	case 2:
		System.out.println("enter your Car Brand");
	      inp.nextLine();
	brand=inp.nextLine();
	for(Car e:cars ) {
		if(e.getBrand().equals(brand)) {
			System.out.println(e);
			found=true;
		}
	}
	if (!found) {
		System.out.println("Car with this "+ brand +" is not present");
	}
	break;
	case 3:
		System.out.println("enter your Car fuelType");
	      inp.nextLine();
	fuelType=inp.nextLine();
	for(Car e:cars ) {
		if(e.getFuelType().equals(fuelType)) {
			System.out.println(e);
			found=true;
		}
	}
	if (!found) {
		System.out.println("Car with this"+ fuelType +"is not present");
	}
	break;
	case 4:
		CarDekhoMenu.carDekhoMenu();
		break;

	default:
		System.out.println("invalid choice \n please choose correct choice\n Try Again");
		
	}
// inp.close();
}
public void updateCarDetails() {
	Scanner inp=new Scanner(System.in);
	System.out.println("======all cars details=====");	
	for(Car e:cars ) {
       System.out.println(e);		
	}
	System.out.println("====update details");
	System.out.println("1.find car for update details\n2.GO Back");
    int choice=inp.nextInt();
	switch (choice) {
	case 1:
		System.out.println("enter car Id");
	     id=inp.nextInt();
	      for(Car e:cars) {
	    	if (e.getCarId()==id) {
	    		System.out.println("enter car Name");
	    		inp.nextLine();
			name=inp.nextLine();
			System.out.println("enter car Brand");
			brand=inp.nextLine();
			System.out.println("enter car price");
            price=inp.nextDouble();
	      e.setName(name);
	      e.setBrand(brand);
	      e.setPrice(price);
	      System.out.println("!!!! update successfully !!!!");
	      found=true;
		}
	}
	if (!found) {
		System.out.println("car with this "+ id +" is not present");
	}
	break;
	case 2:
		CarDekhoMenu.carDekhoMenu();
		break;		
	default:
		System.out.println("invalid choice \n please choose correct option\n Try Again\n");
		break;
	}
//inp.close();	
}


public void deleteCarDetails() throws ConcurrentModificationException {
	
	Scanner inp=new Scanner(System.in);
	System.out.println("enter car Id");
    id=inp.nextInt();
     for(Car e:cars) {
   	if (e.getCarId()==id) {
   		cars.remove(cars.indexOf(e));
     System.out.println("!!!! delete successfully !!!!");
     found=true;
	}
}
if (!found) {
	System.out.println("car with this "+ id +" is not present");
}
inp.close();
}

}

