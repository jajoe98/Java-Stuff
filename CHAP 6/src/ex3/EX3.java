package ex3;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is the length of the room?");
		double len = keyboard.nextDouble();
		System.out.println("What is the width of the room?");
		double w = keyboard.nextDouble();
		
		RoomDimension roomSize = new RoomDimension(len, w);
		
		System.out.println("What is the price per square foot of carpet?");
		double price = keyboard.nextDouble();
		
		RoomCarpet room = new RoomCarpet(roomSize, price);
		
		System.out.println(room.toString());
	}

}
