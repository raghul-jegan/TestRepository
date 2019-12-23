class Dog{
  int size;
  String breed;
  String name;

  void bark(int numofbarks) {
  for (int x=0;x<numofbarks;x=x+1){    
if (size>60){
      System.out.println("Ruff,Ruff");
}
    else if (size>14){
      System.out.println("wuff,wuff");
}
    else{
      System.out.println("yip,yip");
}
}
}

  int getsize(){
     return size;
}

  public static void main (String[] args){
   
  /* Dog[] d=new Dog[3];
   d[0]=new Dog();
   d[1]=new Dog();
   d[2]=new Dog();
   d[0].size=70;
   d[1].size=8;
   d[2].size=35;
   for (int i=0;i<d.length;i=i+1){
     System.out.println("Dog"+i+"got size="+d[i].getsize());
     d[i].bark(3);*/

     Dog d=new Dog();
     System.out.println(d.getClass());
     

}
}

