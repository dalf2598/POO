#include<winbgim.h>
#include<windows.h>
#include<math.h>
#include<stdio.h>
#define PI 3.14159
    
float convierte(float);
void dibuja_angulos(int,int);
void dibuja_circulos(int,int,int,int);

main()
{
	
	int x;
	int y;
	int radio;
	int aux;
	int r_sum;

	
	//coordenadas polo
	x=1000;
	y=500;
	

	printf("***************************PAPEL POLAR**********************************");
	printf("\n\nNOTA: El valor minimo que se puede \227 ingresar es 5, y el maximo es 100");
	printf("\n\nIngrese el valor del radio: ");
	while(scanf("%d",&radio) != 1)
    {
        printf("\nPor favor ingresa un numero: ");
        while(getchar() != '\n');
    }
	

	while(radio<5||radio>100){
		printf("\nERROR ------- Dato Invalido");
		printf("\nIngrese el valor de nuevo: ");
		scanf("%d",&radio);
		break;
	}
	
	r_sum=radio;
	
	
	initwindow(1920,1080); 
	cleardevice();
	
	//eje polar	
	setcolor(BLUE);
	line (x-400,y,x+400,y);
	setcolor(WHITE);
	settextstyle(8, 0, 2); 
	outtextxy(x-430, y,"PI");
	outtextxy(x+420, y, "0=2PI");
	
	//eje normal 
	setcolor(BLUE);
	line (x,y-400,x,y+400);
	setcolor(WHITE);
	outtextxy(x,y-430, "PI/2");
	outtextxy(x,y+420, "3PI/2");
	
	dibuja_angulos(x,y);
	dibuja_circulos(x,y,radio,r_sum);
	
	closegraph();
	
}

void dibuja_angulos(int x,int y){
	
	int aux;
	aux=0;
	
	outtextxy(x-(400)*cos(11*PI/12)+20, y-(400)*sin(11*PI/12),"PI/12");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(11*PI/12), y-(400-aux)*sin(11*PI/12),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(11*PI/12)-85, y-(400-aux)*sin(11*PI/12)+20, "13PI/12");
	
	
	aux=0;
	
	outtextxy(x-(400)*cos(5*PI/6)+20, y-(400)*sin(5*PI/6), "PI/6");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(5*PI/6), y-(400-aux)*sin(5*PI/6),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(5*PI/6)-60, y-(400-aux)*sin(5*PI/6)+20, "7PI/6");
	
	
	aux=0;
	
	outtextxy(x-(400)*cos(3*PI/4)+20, y-(400)*sin(3*PI/4)-10, "PI/4");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(3*PI/4), y-(400-aux)*sin(3*PI/4),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(3*PI/4)-70, y-(400-aux)*sin(3*PI/4)+20, "5PI/4");
	
	aux=0;
	
	outtextxy(x-(400)*cos(2*PI/3)+20, y-(400)*sin(2*PI/3)-10, "PI/3");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(2*PI/3), y-(400-aux)*sin(2*PI/3),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(2*PI/3)-30, y-(400-aux)*sin(2*PI/3)+20, "4PI/3");
	
	aux=0;
	
	outtextxy(x-(400)*cos(7*PI/12)+10, y-(400)*sin(7*PI/12)-20, "5PI/12");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(7*PI/12), y-(400-aux)*sin(7*PI/12),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(7*PI/12)-20, y-(400-aux)*sin(7*PI/12)+20, "17PI/12");
	
	aux=0;
	
	outtextxy(x-(400)*cos(5*PI/12)-30, y-(400)*sin(5*PI/12)-30, "7PI/12");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(5*PI/12), y-(400-aux)*sin(5*PI/12),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(5*PI/12), y-(400-aux)*sin(5*PI/12)+20, "19PI/12");
	
	aux=0;
	
	outtextxy(x-(400)*cos(PI/3)-60, y-(400)*sin(PI/3)-30, "2PI/3");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(PI/3), y-(400-aux)*sin(PI/3),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(PI/3), y-(400-aux)*sin(PI/3)+20, "5PI/3");
	
	aux=0;
	
	outtextxy(x-(400)*cos(PI/4)-60, y-(400)*sin(PI/4)-30, "3PI/4");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(PI/4), y-(400-aux)*sin(PI/4),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(PI/4), y-(400-aux)*sin(PI/4)+20, "7PI/4");
	
	aux=0;
	
	outtextxy(x-(400)*cos(PI/6)-80, y-(400)*sin(PI/6)-30, "5PI/6");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(PI/6), y-(400-aux)*sin(PI/6),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(PI/6), y-(400-aux)*sin(PI/6)+20, "11PI/6");
	
	aux=0;
	
	outtextxy(x-(400)*cos(PI/12)-90, y-(400)*sin(PI/12)-30, "11PI/12");
	for(aux;aux<800;aux++){
	putpixel(x-(400-aux)*cos(PI/12), y-(400-aux)*sin(PI/12),RED);
	//Sleep(1);
	}
	outtextxy(x-(400-aux)*cos(PI/12), y-(400-aux)*sin(PI/12)+20, "23PI/12");

}

void dibuja_circulos(int x,int y,int radio,int r_sum){
		
		while(400>=radio){
		for(int grados=360; grados>=0;grados--)
		{	
			putpixel(x+(radio)*cos(convierte(grados)), y+(radio)*sin(convierte(grados)),WHITE);
			Sleep(1);
		}
		radio=radio+r_sum;
		}
	system("pause");
}



float  convierte (float grados)
{
	float resultado;
	resultado =grados*PI/180;
	return (resultado);
}