public class Cursor {
 // 규칙 1. 사용자가 객체에 대한 생성을 임의로 할 수 없도록 
 // 인자가 없는 생성자를 private로 선언  
 // 규칙 2. 유일한 객체를 반환하는 매소드 제공   
 
 private Cursor() {}  
 private static Cursor sInstance = null;  
 public static Cursor getInstance()
 {  
   if( sInstance == null )   
    sInstance = new Cursor();    
   return sInstance; 
 }  
 
 /* private static Cursor sInstance = new Cursor(); 
 public static Cursor getInstance() 
 { 
  return sInstance(); 
 } 
 */ 
 
 }

/* Cursor c1 = Cursor.getInstance(); Cursor c2 = Cursor.getInstance();   System.out.println(c1); System.out.println(c2);*/
