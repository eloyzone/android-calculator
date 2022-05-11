class Test2{
   int number ;
   String name ;
   public void set_Name(String s){
       name=s;
        
   }
   public void Set( int n){
       number=n;
   }
   public String get_Name(){
       return name;
   }
    public int  get_Number(){
       return number;
   }
   public Test2 (int a,String b){
       number=a;
       name=b;
   }

}