class TestStuff{
  int sumoftwo(int x,int y){
    return x+y;
}

  public static void main(String[] args){
    TestStuff t=new TestStuff();
    int[] num1={5,10,15,20,25};
    int[] num2={5,10,15,20,25};
    for (int i=0;i<num1.length;i=i+1){   
       int result=t.sumoftwo(num1[i],num2[i]);
       System.out.println("sum of "+num1[i]+" and "+num2[i]+" is "+result);
}
}
}