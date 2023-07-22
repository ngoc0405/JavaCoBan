package mytesting;

import java.util.Scanner;

public class TAMGIAC {
	public int a;
    public int b;
    public int c;
    public int p;
    //Tinh chi vi
    public int tinhChuvi() {
   	 p = a+b+c;
   	 return p;
    }
    
    //Tinh dien tich
    public float tinhDientich() {
   	 float dientich = (float) p*(p-a)*(p-b)*(p-c);
   	 float s = (float) Math.sqrt(dientich);
   	 return s;
    }
    
    public static void main(String[] args) {
	     TAMGIAC tg = new TAMGIAC();
	   	 Scanner scanner = new Scanner(System.in);
	   	 
	   	 System.out.print("Nhập vào canh a: ");
	   	 int canha = scanner.nextInt();
	   	 tg.a = canha;
	   	 
	   	 System.out.print("Nhập vào canh b: ");
	   	 int canhb = scanner.nextInt();
	   	 tg.b = canhb;
	   	 
	   	 System.out.print("Nhập vào canh c: ");
	   	 int canhc = scanner.nextInt();
	   	 tg.c = canhc;
	   	 
	   	 int p = tg.tinhChuvi();
	   	 float s = tg.tinhDientich();
	   	 System.out.println("Chu vi tam giac = " + p);
	   	 System.out.println("Diện tích tam giac = " + s);
    }
}
