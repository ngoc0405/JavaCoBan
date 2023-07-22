package mytesting;

import java.util.Scanner;

public class HINHTRON {
	public int R;
    float PI = 3.14f;
    
    //Tinh chu vi
    public float tinhchuvi() {
   	 float C = 2*PI*R;
   	 return C;
    }
    
    //Tinh dien tich
    public float tinhdientich() {
   	 float S = PI*R*R;
   	 return S;
    }
    
    public static void main(String[] args) {
    HINHTRON ht = new HINHTRON();
   	 Scanner scanner = new Scanner(System.in);
   	 System.out.print("Nhập vào ban kinh hinh tron: ");
   	 int bankinh = scanner.nextInt();
   	 ht.R = bankinh;
   	 
   	 float C = ht.tinhchuvi();
   	 float S = ht.tinhdientich();
   	 System.out.println("Chu vi hinh tron = " + C);
   	 System.out.println("Diện tích hinh tron = " + S);
    }
}
