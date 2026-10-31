public class LibarayBookCounter {
    static String title;
    static String authore;
    static int price;
   static void libary(){
       title="Ramayan";
       authore="Valmuki";
       price=200;
   }
   static void  display(){
       System.out.println("Title Name="+title);
       System.out.println("Authore="+authore);
       System.out.println("Price Of Book="+price);
   }
   public static void main(String []args){
       LibarayBookCounter.libary();
       LibarayBookCounter.display();

   }

}
