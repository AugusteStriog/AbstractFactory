 
public class KoordinaciuFactory extends AbstractFactory{	 
   
   Koordinates getKoordinates(String koordinates) {   
      if(koordinates == null){
         return null;
      }		
 
      if(koordinates.equalsIgnoreCase("Pirma")){
        return new Pirma();
      }
      else if(koordinates.equalsIgnoreCase("Antra")){
         return new Antra();
 
      }else if(koordinates.equalsIgnoreCase("Trecia")){
         return new Trecia();
      }
 
      return null;
   }
 
   
   public Figura getFigura(String figurosTipas){
      return null;
   }
   Spalva getSpalva(String spalva) {
      return null;
   }
}