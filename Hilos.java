public class Hilos{

  public static void main(String args[]){

	double arr[] = new double[10];

	for(int i = 0; i < arr.length; i++) {

		arr[i] =  (int) (Math.random()*10 + 1) ;
	}
	
	
    new NuevoHilos("Uno", 1, arr); 
    new NuevoHilos("Dos", 2, arr);
    new NuevoHilos("Tres", 3, arr);

    try {

      Thread.sleep(10000);
    } catch (InterruptedException e) {

      System.out.println("Interrupcion del hilo principal");
    	}

    System.out.println("Saliendo del hilo principal....");
  }
}