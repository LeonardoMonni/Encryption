 class Main {
  public static void main(String[] args) {
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");

    
   Matrice m = new Matrice("TPSIT"); //istanziato matrice con codice TPSIT
   Vigenere v1 = new Vigenere(0,12,0,12,m);
   Thread t1 = new Thread(v1);
   Thread t2 = new Thread(v1);
   Thread t3 = new Thread(v1);
   Thread t4 = new Thread(v1);
   t1.start();
   t2.start();
   t3.start();
   t4.start();

   System.out.println("Matrice popolata: ");
    m.printMatrix();
  }
}