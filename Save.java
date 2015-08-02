package robo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Save {
	public static void savePeople(ArrayList<Person>people){
		try (
			FileOutputStream fos = new FileOutputStream("people.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		 ) {
			oos.writeObject(people);
		}catch (Exception e) 
		{
		e.printStackTrace();
		}	// TODO: handle exception}
	}
	public static ArrayList<Person> loadPeople(){
		ArrayList<Person> thesePeople = new ArrayList<Person>();
		try(
		FileInputStream fis = new FileInputStream("people.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		){
			thesePeople = ((ArrayList<Person>) ois.readObject());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return thesePeople;
	 }
	}
