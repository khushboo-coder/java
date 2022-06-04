package questions;

public class Circle {
private int radius;
private int area;
private int perimeter;
public void setradius(int r) throws Exception{
	if(r<0) {
		throw new Exception("Radius can't be negative");
	}
	radius = r;
}
public  int getradius() {
	return radius;
}
public void setarea(int a) throws Exception {
	if(a<0) {
		throw new Exception("Area can't be negative");
	}

	area = a;
}
public  int getarea() {
	return area;
}
public void setperimeter(int p) throws Exception{
	if(p<0) {
		throw new Exception("Perimeter can't be negative");
	}

	perimeter = p;
}
public  int getperimeter() {
	return perimeter;
}

}
