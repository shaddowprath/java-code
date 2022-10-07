class Rectangle extends Shape
{
   double x=3,y=4;

   double area()
   {
       return x*y;
   }

   double circumference()
   {
       return 2*(x+y);
   }

   Rectangle(double length, double width)
   {
       x = length;
       y = width;
   }
}