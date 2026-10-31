class Rectangle {
    int l=2;
    int b=3;
    double area;
    void CalculateArea(){
        area =l*b;
    }
    void display(){
        System.out.println("Area of Rectangle= " + area);
    }
    public static void main (String[] args ){
        Rectangle s = new Rectangle();
        s.CalculateArea();
        s.display();
    }
}