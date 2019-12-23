class NewDog{
  private int size;

  void setsize(int x){
    size=x;
}

  int getsize(){
    return size;
}

   public static void main(String[] args){
     NewDog d=new NewDog();
     
     System.out.println(d.size);
}
}