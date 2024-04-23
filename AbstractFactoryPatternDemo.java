public class AbstractFactoryPatternDemo {
	public static void main(String args[]){
	      //FiguruFactory
	      AbstractFactory shapeFactory = FactorySukurimas.getFactory("Figura");
 
	      //Apskritimo klases objektas
	      Figura figura1 = shapeFactory.getFigura("Apskritimas");
 
	      //iskvieciamas piestiFigura metodas
	      figura1.piestiFigura();
 
	      Figura figura2 = shapeFactory.getFigura("Staciakampis");
 
	      figura2.piestiFigura();
 
	      Figura figura3 = shapeFactory.getFigura("Kvadratas");
 
	      figura3.piestiFigura();
 
	      AbstractFactory koordinaciuFactory = FactorySukurimas.getFactory("Koordinates");
 
	     Koordinates koordinates1 = koordinaciuFactory.getKoordinates("Pirma");
 
	      koordinates1.rastiVieta();
 
	      Koordinates koordinates2 = koordinaciuFactory.getKoordinates("Antra");
 
	      koordinates2.rastiVieta();
 
	      Koordinates koordinates3 = koordinaciuFactory.getKoordinates("Trecia");
 
	      koordinates3.rastiVieta();

		  AbstractFactory spalvuFactory = FactorySukurimas.getFactory("Spalva");
 
	     Spalva spalva1 = spalvuFactory.getSpalva("Raudona");
 
	      spalva1.spalvinti();
 
	      Spalva spalva2 = spalvuFactory.getSpalva("Zalia");
 
	      spalva2.spalvinti();
 
	      Spalva spalva3 = spalvuFactory.getSpalva("Melyna");
 
	      spalva3.spalvinti();
	}
	}
