class DogExample{
  public static void main(String[] args){
    Dog a=new Dog();
    Dog b=new Dog();
    Dog z=a;
    System.out.print("a is equal to b :");
    System.out.println(a==b);
    System.out.print("b is equal to z :");
    System.out.println(b==z);
    System.out.print("a is equal to z :");
     System.out.println(a==z); 
   //System.out.print(a==b);
    //System.out.print(b==z);
    //System.out.print(a==z);
}

}