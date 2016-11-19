package zadanie_2_3;

public class Punkt
{
int x;
int y;


void inkrX()
{
	this.x++;
}
void inkrY()
{
	y++;
}
void zmienX(int z)
{
	x=x+z;
	
}
void zmienY(int z)
{
	y=y+z;
	
}

int getX()
{
	return x;
}
int getY()
{
	return y;
}

void wyswietl()
{
	System.out.println(x+" "+y);
}

}
