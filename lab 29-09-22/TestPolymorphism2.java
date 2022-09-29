
class Shape{  

void draw(){System.out.println("creating…");}  

}  

class Square extends Shape{  

void draw(){System.out.println("creating square…");}  

}  

class Triangle extends Shape{  

void draw(){System.out.println("creating triangle…");}  

}  

class Pentagon extends Shape{  

void draw(){System.out.println("creating pentagon…");}  

}  

class TestPolymorphism2{  

public static void main(String args[]){  

Shape s;  

s=new Square();  

s.draw();  

s=new Triangle();  

s.draw();  

s=new Pentagon();  

s.draw();  

}  

}  