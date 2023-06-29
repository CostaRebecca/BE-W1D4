package es1;

public class Dipendente {
    private static double stipendioBase = 1000;//con static il valore stipendioBase è condiviso tra tutte le istanze della classe Dipendente
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;
    
    //Costruttore Dipendente che accetta solo la matricola e Dipartimento e va ad impostar i valori dati
    public Dipendente(String matricola, Dipartimento dipartimento) {
	this.stipendio = stipendioBase;
	this.importoOrarioStraordinario = 30;
	this.livello = Livello.OPERAIO;
	this.matricola = matricola;
	this.dipartimento = dipartimento;
		
    }
    
    //Costruttore che accetta tutti i parametri 
    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
	 this.matricola = matricola;
	 this.stipendio = stipendio;
	 this.importoOrarioStraordinario = importoOrarioStraordinario;
	 this.livello = livello;
	 this.dipartimento = dipartimento;
    }
    
    public enum Livello {
	OPERAIO,
	IMPIEGATO,
	QUADRO,
	DIRIGENTE
    }
    
    public enum Dipartimento {
	PRODUZIONE,
	AMMINISTRAZIONE,
	VENDITE
    }
    
    public void setDipartimento(Dipartimento dipartimento) {
	    this.dipartimento = dipartimento;
	    }

    public void setImportoOrarioStraordinario(double importo) {
	    this.importoOrarioStraordinario = importo;
	}
    
    //Metodo stampaDatiDipendente
    public void stampaDatiDipendente() {
	System.out.println("Matricola" + matricola);
	System.out.println("Stipendio: " + stipendio);
	System.out.println("Importo Orario Straordinario: " + importoOrarioStraordinario);
	System.out.println("Livello: " + livello);
	System.out.println("Dipartimento: " + dipartimento);
    }
    
    public Livello promuovi() {
	switch (livello) {
	case OPERAIO:
	    livello = livello.IMPIEGATO;
	    stipendio = stipendioBase * 1.2;
	    break;
	   
	case IMPIEGATO:
	    livello = livello.QUADRO;
	    stipendio = stipendioBase * 1.5;
	    break;
	    
	case QUADRO:
	    livello = Livello.DIRIGENTE;
	    stipendio = stipendioBase * 2;
	    break;
	    
	case DIRIGENTE:
	    System.out.println("La matricola" + matricola + "è gia DIRIGENTE");
	    break;
	    
	default:
	    System.out.println("Livello non valido");	   
	    break;
	    
    }	
	return livello;
  }
    
   
    

}
