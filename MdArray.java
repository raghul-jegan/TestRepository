class MdArray{
 public static void main(String[] args){
    int[][] a=new int[2][2];
System.out.println("length of a is : " + a.length);
      for(int i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++){
           a[i][j]=j;
}  
}
     /* int[][] a={{1,2,3},{4,5,6}};
System.out.println("length of a is: "+a.length);*/
	 for(int i=0;i<a.length;i++){
          for(int j=0;j<a[i].length;j++){
	    System.out.print(a[i][j]+" ");
}
      System.out.println();
}     

}
}