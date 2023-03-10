import java.util.Scanner;
class Arrayapplication {
  Scanner s = new Scanner(System.in);
  int arr[] = new int[100];
  int no_elements = 0;
  public void insertfirst() {
    System.out.println("Enter the value to insert in first index ");
    int num=s.nextInt();
    if(no_elements==0){
      arr[0]=num;
      no_elements++;
    }
    else{
      for(int i=no_elements;i>0;i--){
        arr[i]=arr[i-1];
      }
      arr[0]=num;
      no_elements++;
    }
  }
  public void display(){
    for(int i=0;i<no_elements;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public void insertlast(){
    System.out.println("Enter the value to insert in last index ");
    int num=s.nextInt();
    if(no_elements==0){
      arr[0]=num;
      no_elements++;
    }
    else{
      arr[no_elements]=num;
      no_elements++;
    }
  }
  public void insertspecific(){
    System.out.println("Enter the value");
    int value=s.nextInt();
    System.out.println("Enter index value ");
    int index=s.nextInt();
    if(index<=no_elements){
      if(no_elements==0){
        arr[index]=value;
        no_elements++;
      }
      else{
        for(int i=no_elements;i>index;i--){
          arr[i]=arr[i-1];
        }
        arr[index]=value;
        no_elements++;
      }
    }
    else{
      System.out.println("Invalid index,index value should be less than "+no_elements);
    }
  }
  public void deletefirst(){
    if(no_elements==0){
      System.out.println("Array is empty");
    }
    else{
      for(int i=0;i<no_elements;i++){
        arr[i]=arr[i+1];
      }
      no_elements--;
    }
  }
  public void deletelast(){
    if(no_elements==0){
      System.out.println("Array is empty");
    }
    else{
      no_elements--;
    }
  }
  public void deletespecific(){
    if(no_elements==0){
      System.out.println("Array is empty");
    }
    else{
      System.out.println("Enter index value");
      int index=s.nextInt();
      if(index<no_elements){
        for(int i=index;i<no_elements;i++){
          arr[i]=arr[i+1];
        }
        no_elements--;
      }
    }
  }
  public void deletesearch(){
    System.out.println("Enter search element");
    int key=s.nextInt();
    int index=-1;
    for(int i=0;i<no_elements;i++){
      if(key==arr[i]){
        index=i;
        break;
      }
    }
    if(index>=0){
      for(int i=index;i<no_elements;i++){
        arr[i]=arr[i+1];
      }
      no_elements--;
    }
    else{
      System.out.println("not found");
    }
  }
  public void viewoptions() {
    int option=0;
    do{
      System.out.println("\n1. Insert an element in first index position");
      System.out.println("2. Insert an element in last index position");
      System.out.println("3. Insert an element in specific index position");
      System.out.println("4. Delete an element in first index ");
      System.out.println("5. Delete an element in last index ");
      System.out.println("6. Delete an element in specific index ");
      System.out.println("7. Delete an element in search value ");
    
      System.out.println("choose your option");
      option=s.nextInt();
      switch(option){
        case 1:
          {
            insertfirst();
            display();
            break;
          }
        case 2:
          {
            insertlast();
            display();
            break;
          }
        case 3:
          {
            insertspecific();
            display();
            break;
          }
        case 4:{
          deletefirst();
          display();
          break;
        }
        case 5:{
          deletelast();
          display();
          break;
        }
        case 6:{
          deletespecific();
          display();
          break;
        }
        case 7:{
          deletesearch();
          display();
          break;
        }
      }
    }
      while(option!=0);
  }
  public static void main(String args[]) {
    Arrayapplication obj = new Arrayapplication();
    obj.viewoptions();
  }
}