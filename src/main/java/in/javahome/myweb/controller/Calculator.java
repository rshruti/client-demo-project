package in.javahome.myweb.controller;

/*
 * 
 */
public class Calculator {
	   public int add(int number1, int number2) 
   {
     if (number1> number2)
	   return number1 + number2;
	   else 
		   return 10101010;
   }
   
   public int sub(int number1, int number2) {
      return number1 - number2;
   }
   
   public int mul(int number1, int number2) {
      return number1 * number2;
   }
   
   public int div(int number1, int number2) {
      return number1 / number2;
   }
   int minval(int *A, int n) {
  int currmin;

  for (int i=0; i<n; i++)
    if (A[i] < currmin)
      currmin = A[i];
  return currmin;
}
  
main() {
  Record city;
  lnode *list = NULL;

  while (data_to_read()) {
    Readin_data(&city);
    insert(&city, &list);
  }
}

void insert(Record*& city, lnode*& list) {
  lnode* ptr = new lnode;
  ptr->next = list;
  list = ptr;
  prt->data = city;
}

   
}
