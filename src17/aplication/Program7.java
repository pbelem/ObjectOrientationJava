package aplicattion;

import Service.HourContract;
import entities.Worker;

public class Program7 {

	public static void main(String[] args) {

//        Service.HourContract.totalValue();
		Worker worker = new Worker();
		HourContract contract = new HourContract();
		worker.addContract(contract);

	}
}
