 class Main {
  public static void main(String[] args) {
    String parolaChiave;
    System.out.println("Inserisci la parola chiave!");
   try{
    BufferedReader br = new BufferedReader(new InputStreamerReader(System.in));
    parolaChiave = br.readline();
   }
   catch (IOException io){
    System.err.println("errore lettura dati tastiera");
   }
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
   //commento nuovo 
  }
}
