package comTests;


import java.util.Scanner;


public class Tests {
	
	
	
	public static boolean isSimple(int n){
        if (n == 1) return false;
        for( int k = 2; k * k <= n; k++) {
            if (n % k == 0) return false;
        }
        return true;
    }
	
	static void Task_1() {
		System.out.println(">> Введите N");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("Простые числа от 1 до " + num + " : ");
        for (int i = 1; i <= num; i++) if (isSimple(i)) System.out.print(i + " ");		
	}
	
	
	
	
	
	static int fib(int i){
		if (i == 1) return 1;
	    if (i == 2) return 1;
	    return fib(i - 1) + fib(i - 2);
	}
	
	static void Task_2() {
		System.out.println(">> Введите N");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k = 2, res = 1;
        System.out.print("Числа Фибоначчи в пределах от 1 до " + num + " : ");
        do {
        	System.out.print(res + " ");
        	res = fib(k);
        	k++;	
        } while (res<=num);	
	}
	
	
	
	
	
	
	
	static void Task_3() {
		System.out.println(">> Введите координаты ПЕРВОГО отрезка ( Четыре числа через пробелы - x1 y1 x2 y2 )");
		Scanner in = new Scanner(System.in);
		int l1_x1 = in.nextInt();
		int l1_y1 = in.nextInt();
		int l1_x2 = in.nextInt();
		int l1_y2 = in.nextInt();
		
		System.out.println(">> Введите координаты ВТОРОГО отрезка ( Четыре числа через пробелы - x1 y1 x2 y2 )");
		int l2_x1 = in.nextInt();
		int l2_y1 = in.nextInt();
		int l2_x2 = in.nextInt();
		int l2_y2 = in.nextInt();
		
		
		int v1 = ((l2_x2 - l2_x1)*(l1_y1 - l2_y1) - (l1_x1 - l2_x1)*(l2_y2 - l2_y1));
        int v2 = ((l2_x2 - l2_x1)*(l1_y2 - l2_y1) - (l1_x2 - l2_x1)*(l2_y2 - l2_y1));
        int v3 = ((l1_x2 - l1_x1)*(l2_y1 - l1_y1) - (l2_x1 - l1_x1)*(l1_y2 - l1_y1));
        int v4 = ((l1_x2 - l1_x1)*(l2_y2 - l1_y1) - (l2_x2 - l1_x1)*(l1_y2 - l1_y1));
        if ((v1*v2 <= 0) && (v3*v4 <= 0)) System.out.println("Отрезки пересекаются");
            else System.out.println("Отрезки не пересекаются");
		
	}
	

	
	
	
    public static int NOD(int a, int b){
    	return b == 0 ? a : NOD(b,a % b);
    }

    public static int NOK(int a, int b) {
        return a / NOD(a, b) * b;
    }	
	
	static void Task_4() {
		System.out.println(">> Введите два числа через пробелы для определения НОК и НОД");
		Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("НОД:" + NOD(x, y) + " " +"НОК:" + NOK(x, y));
	}
	
	
	
	static void Task_5() {
		System.out.println(">> Введите слово для определения \"Палиндромности\" ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String str1 = str;
		String str2 = "";
		
		for (int i = str.length()-1; i >= 0; --i){
			str2+=str.charAt(i);		
		}
		System.out.println(str1 + " " + str2);
		if (str1.equals(str2)) System.out.println("Является палиндромом");  else System.out.print("Не является палиндромом");		
	}
	
	
	
	static void Task_6() {
		System.out.println(">> Введите текст, а я удалю все числа, потому что могу");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String resStr = "";
		
		char c;
		for (int i = 0; i<=str.length()-1; ++i){
			c = str.charAt(i);
			if (!(c >= '0' && c <= '9')) resStr+= c ;		
		}
		System.out.println("Я сделяль. Вот: \n" + resStr);
	}
		
	
	
	
	
	 public static void main(String[] args) {
		 int q;
		 
		 do {
		 System.out.println(">> Введите номер задания");
	        Scanner in = new Scanner(System.in);
	        q = in.nextInt();
	        switch (q) {
	            case 1:
	                System.out.println("______|Задание 1|______");
	                Task_1();
	                System.out.println();
	                break;
	            
	            case 2:
	                System.out.println("______|Задание 2|______");
	                Task_2();
	                System.out.println();
	                break;
	            
	            case 3:
	                System.out.println("______|Задание 3|______");
	                Task_3();
	                System.out.println();
	                break;
	            
	            case 4:
	                System.out.println("______|Задание 4|______");
	                Task_4();
	                System.out.println();
	                break;
	            
	            case 5:
	                System.out.println("______|Задание 5|______");
	                Task_5();
	                System.out.println();
	                break;
	            
	            case 6:
	                System.out.println("______|Задание 6|______");
	                Task_6();
	                System.out.println();
	                break;
	        }
		 } while (!(q==0));
		 
		 
		 System.out.println("Мы вышли");
	        
	        
	 }
	

}
