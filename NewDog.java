class NewDog{
  private int size;

  void setsize(int x){
    size=x;
}

  int getsize(){
    return size;
}
}
   
class NewDogTest{
public static void main(String[] args){
     SetSize d=new SetSize();
     d.start();
}
}

class SetSize{
  
  void start(){
  NewDog New=new NewDog();
  New.setsize(100);
  System.out.println(New.getsize());
}
}