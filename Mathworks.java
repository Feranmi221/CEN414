public class Mathworks{
  
  public static void main(String[] args) {
    int x,y;
    x=2;
    y=9;
    // MATH CLASS
    System.out.println(Math.sqrt(29));
     System.out.println(Math.abs(29));
      System.out.println(Math.cbrt(29));
       System.out.println(Math.exp(29));
        System.out.println(Math.pow(2,n9));
        // IF STATEMENT

        if(9>2){
          System.out.println("9 is greater than 2");
}
else
          {
        System.out.println("2 is greater than 9");  
  }

// TERNARY OPERATION
String statement_1,statement_2;
  statement_1="Hello";
  statement_2="Hi";
   String name;
  name = x>y ? statement_1:statement_2;
   System.out.println(statement_1);  

   //SWITCH STATEMENT
 int day = 9;
  switch (day){
   case 1 : 
  System.out.println("RED");   
  break;
  
   case 2 : 
  System.out.println("ORANGE");   
  break;
  
   case 3 : 
  System.out.println("YELLOW");   
  break;
 
    default :
      System.out.println("no color");   
  break;
   }

  //LOGICAL OPERATIONS

System.out.println(x<y && x>y);
System.out.println(x<y || x>y);
int and = x&y;
int or = x|y;
int xor = x^y;
boolean not = !(x>y);
System.out.println(not);
System.out.println(and);
System.out.println(or);
System.out.println(xor);
  
  //FOR LOOP 

for(int i=0;i<=99;i++){
  if(i==29)
  { System.out.println(i);
  }
}
}
}

