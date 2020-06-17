class area
{
int l,b;

area()
{
l=2;
b=3;
}

area(int x)
{
l=x;
b=x;
}

area(int p,int q)
{
l=p;
b=q;
}

void displayarea()
{
System.out.println("Area of Rectangle:"+(l*b));
}

}

class constructor1
{

public static void main(String args[])
{
area a=new area();
area a1=new area(5);
area a2=new area(8,9);

a.displayarea();
a1.displayarea();
a2.displayarea();
}
}