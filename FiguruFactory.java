public class FiguruFactory extends AbstractFactory{
 
   //figurosTipas metodas grazina objekta ivestos figuros
   
   public Figura getFigura(String figurosTipas){
      if(figurosTipas == null){
         return null;
      }		
      if(figurosTipas.equalsIgnoreCase("Apskritimas")){
         return new Apskritimas();
 
      } else if(figurosTipas.equalsIgnoreCase("Staciakampis")){
         return new Staciakampis();
 
      } else if(figurosTipas.equalsIgnoreCase("Kvadratas")){
         return new Kvadratas();
      }
 
      return null;
   }
 
   
   Spalva getSpalva(String spalva) {
      return null;
   }
   Koordinates getKoordinates(String koordinates) {
      return null;
   }
}