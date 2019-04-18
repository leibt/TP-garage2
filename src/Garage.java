
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import modeles.Vehicule;

public class Garage {
	
	private static List<Vehicule> lveh;
   	
   	public Garage() {
		lveh=new ArrayList<>();
   		readVoit();
	}
	
	public void addVoiture (Vehicule voit) {
		lveh.add(voit);
		writeVoit(lveh);
	}
	
	private void readVoit() {
		try(FileInputStream fis = new FileInputStream("garage.txt"); BufferedInputStream bis = new BufferedInputStream(fis); ObjectInputStream ois = new ObjectInputStream(bis)){
			System.out.println("******************************************");
	   		System.out.println("*        Garage OpenClassrooms           *");
	   		System.out.println("******************************************");
	   		
	   		lveh=(List<Vehicule>)ois.readObject();
	   		
	   		ois.close();
	   		
		}catch(FileNotFoundException e) {
			System.out.println("Aucune voiture enregistrée");
			File f = new File("garage.txt");
			try {
				f.createNewFile();
			} catch (IOException e1) {
				
			}
		}catch(IOException e) {
		}catch(ClassNotFoundException e) {
			System.err.println("Error class not found !");
		}
	}
	
	
	private void writeVoit(List<Vehicule> listV) {
		
		try(FileOutputStream fos = new FileOutputStream("garage.txt"); BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos)){
			
			oos.writeObject(listV);
			oos.close();
		}catch(FileNotFoundException e) {
	   		System.err.println("Error File not found "+ e.getMessage());
	   	}catch(NullPointerException e) {
	   		System.err.println("Error NPE : "+e.getMessage());
	   	}catch(IOException e) {
	   		e.printStackTrace();
	   	}
	}
	
	@Override
	public String toString() {
		String msg="";
		
		
		for(Vehicule v : lveh)
			msg += "\n -" + v.toString();
		
		
		return msg;
	}
	
}
