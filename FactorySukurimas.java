public class FactorySukurimas {
    public static AbstractFactory getFactory(String pasirinkti){		   
       if(pasirinkti.equalsIgnoreCase("Figura")){
          return new FiguruFactory();
      }

       else if(pasirinkti.equalsIgnoreCase("Koordinates")){
          return new KoordinaciuFactory();
      }

       else if(pasirinkti.equalsIgnoreCase("Spalva")){
         return new SpalvuFactory();
      }
  
       return null;
    }
 }