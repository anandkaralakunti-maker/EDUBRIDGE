class Book {
    String title;
    int price;
    Book(){
        title="Ramayan";
        price=2000;
    }
    void display(){
        System.out.println("Name="+title);
        System.out.println("Price="+price);
    }
    public static void main(String[] args){
        Book obj=new Book();
        obj.display();
    }
}
