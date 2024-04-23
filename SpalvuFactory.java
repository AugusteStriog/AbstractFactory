 
public class SpalvuFactory extends AbstractFactory{	 
   
   Spalva getSpalva(String spalva) {   
      if(spalva == null){
         return null;
      }		
 
      if(spalva.equalsIgnoreCase("Raudona")){
        return new Raudona();
      }
      else if(spalva.equalsIgnoreCase("Zalia")){
         return new Zalia();
 
      }else if(spalva.equalsIgnoreCase("Melyna")){
         return new Melyna();
      }
 
      return null;
   }
 
   
   public Figura getFigura(String figurosTipas){
      return null;
   }
   Koordinates getKoordinates(String koordinates) {
      return null;
   }
}