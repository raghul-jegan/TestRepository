class TestArray1{

  static void min(int[] a){
    int min=a[0];
   for (int i=1;i<a.length;i++){
      if (min>a[i]){
         min=a[i];
}
}
System.out.println(min);
}
  public static void main(String[] args){
 /*   int[] a;
    a=new int[5];
    for(int i=0;i<a.length;i++){
      a[i]=i;
}*/
   //int[] a={3,2,0,4,5};
    //for(int i:a){
      // System.out.println(i);
//}
    min(new int[]{3,4,1,5,2});

}
}