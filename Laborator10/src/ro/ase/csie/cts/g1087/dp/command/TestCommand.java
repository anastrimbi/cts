package ro.ase.csie.cts.g1087.dp.command;

public class TestCommand {
	
	public static void main(String[] args) {
		
		ManagerTaskuri manager = new ManagerTaskuri();
		
		TaskAsincron autoSave = new TaskToDo(new ModulAutoSave(), "Autosave", 5);
		TaskAsincron autoUpdate = new TaskToDo(new ModulUpdateClient(), "Update v2", 20);
		
		manager.adaugaTask(autoSave);
		manager.adaugaTask(autoUpdate);
		
		System.out.println("Jocul este activ");
		
		
		autoSave.executaTask();
		autoUpdate.executaTask();
		
		System.out.println("Jocul ete activ");
		
		//autoSave.executaTask();
		//autoUpdate.executaTask();
		
	}
}