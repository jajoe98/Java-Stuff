package ex5;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int floors;
		int totalRooms = 0;
		int occupiedRooms = 0;
		int emptyRooms;
		double occupancyRate;
		int roomInput;
		int roomsOnFloor;
		
		do {
			System.out.println("How many floors are there? (must be at least 1)");
			floors = keyboard.nextInt();
		}while(floors < 1);
		
		for(int i = 0; i < floors; i++) {
			
			do {
				System.out.printf("How many rooms does floor %d have? (must be at least 10)\n", i + 1);
				roomInput = keyboard.nextInt();
				roomsOnFloor = roomInput;
			}while(roomInput < 10);
			
			totalRooms += roomInput;

			do {
				System.out.printf("How many rooms on floor %d are occupied? (cant be more than rooms on floor)\n", i + 1);
				roomInput = keyboard.nextInt();
			}while(roomInput > roomsOnFloor);
			
			occupiedRooms += roomInput;
		}
		
		emptyRooms = totalRooms - occupiedRooms;
		occupancyRate = ((occupiedRooms + 0.00) / (totalRooms + 0.00));
		
		System.out.printf("the hotel has a total of %d rooms\n", totalRooms);
		System.out.printf("%d of those rooms are occupied\n", occupiedRooms);
		System.out.printf("%d of those rooms are empty\n", emptyRooms);
		System.out.printf("the hotels occupancy rate is %.2f", occupancyRate);
	}

}
