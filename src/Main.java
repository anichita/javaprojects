import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== Aplicatie Imparte Surprize ======");
		
		/* Pentru a prezenta comportamentul fiecarui container, folosim 
		MinionToy, intrucat sunt generati in ordine cu ajutorul unui contor 
		iar acest lucru ofera mai mutla claritate */
		
		System.out.println("\n\nSimulare comportament containere:");
		System.out.println("\n\nGive Surprise And Applause - FIFO:\n");	
		GiveSurpriseAndApplause surprise = new GiveSurpriseAndApplause("FIFO", 1);
		surprise.put(MinionToy.generate());
		surprise.put(MinionToy.generate());
		surprise.put(MinionToy.generate());
		surprise.put(MinionToy.generate());
		surprise.put(MinionToy.generate());
		surprise.put(MinionToy.generate());
		surprise.giveAll();
		
		
		System.out.println("\n\nGive Surprise And Hug - LIFO:\n");	
		GiveSurpriseAndHug surprise2 = new GiveSurpriseAndHug("LIFO", 1);
		surprise2.put(MinionToy.generate());
		surprise2.put(MinionToy.generate());
		surprise2.put(MinionToy.generate());
		surprise2.put(MinionToy.generate());
		surprise2.put(MinionToy.generate());
		surprise2.put(MinionToy.generate());
		surprise2.giveAll();
		 
		
		System.out.println("\n\nGive Surprise And Sing - Random:\n");	
		GiveSurpriseAndSing surprise3 = new GiveSurpriseAndSing("RANDOM", 1);
		surprise3.put(MinionToy.generate());
		surprise3.put(MinionToy.generate());
		surprise3.put(MinionToy.generate());
		surprise3.put(MinionToy.generate());
		surprise3.put(MinionToy.generate());
		surprise3.put(MinionToy.generate());
		surprise3.giveAll();
		
		
		
		System.out.println("\n\n======================================================");
		System.out.println("\n\nSimulare pentru strangerea si daruirea cadourilor:\n");
		
		/* Generam un container de tipul LIFO si il populam cu cadouri random, 
		 * pentru a simula comportamentul din viata reala*/
		
		GiveSurpriseAndHug surprise4 = new GiveSurpriseAndHug("LIFO", 1);
		
		// folosim metoda gather(int nr) pentru a genera 10 cadouri random
		
		ArrayList<ISurprise> newArray = GatherSurprises.gather(10);
		for (ISurprise s : newArray) {
			surprise4.put(s);
		}
		surprise4.giveAll();
		
		// verificam metoda isEmpty
		System.out.println("\nDupa ce am dat toate surprizele. isEmpty: " + surprise3.isEmpty());
		
		// mai adaugam cateva surprize si verificam din nou metoda isEmpty
		
		surprise4.put(GatherSurprises.gather());
		surprise4.put(GatherSurprises.gather());
		surprise4.put(GatherSurprises.gather());
		
		System.out.println("\nDupa ce am mai adaugat alte surprize."
				+ " isEmpty: " + surprise4.isEmpty() + "\n");
		
		surprise4.give().enjoy();
		surprise4.give().enjoy();
		surprise4.give().enjoy(); 
		
		surprise4.put(GatherSurprises.gather());
		surprise4.put(GatherSurprises.gather());
		surprise4.put(GatherSurprises.gather());
		surprise4.put(GatherSurprises.gather());
		surprise4.put(GatherSurprises.gather());
		surprise4.put(GatherSurprises.gather());
		
		
		System.out.println("\n\n======================================================");
		System.out.println("\n\nSimulare pentru put(IBag):\n");
		
		/*am creat o noua metoda de tipul GiveSurpriseAndApplause Random
		 * am mutat cadourile din bagul metodei GiveSurpriseAndHug in nou bag
		 * dupa am impartit cadourile cu metoda give surprise and applause*/
		
		GiveSurpriseAndApplause surprise5 = new GiveSurpriseAndApplause("RANDOM", 1);
		System.out.println("Noul bag. isEmpty: " + surprise5.isEmpty());
		surprise5.put(surprise4.getBag());
		System.out.println("\nNoul bag dupa ce am mutat din vechiul bag. isEmpty: " +surprise5.isEmpty());
		System.out.println("\nVechiul bag dupa mutarea cadourilor. isEmpty: " + surprise4.isEmpty());
		System.out.println();
		surprise5.giveAll();
		System.out.println("\nNoul bag dupa impartirea tuturor cadourilor. isEmpty: " + surprise5.isEmpty());

	}

}
