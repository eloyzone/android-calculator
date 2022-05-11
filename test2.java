class Test2{
   int number ;
   String name ;
   int id;
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
   public Test2 (int a,String b,int id){
       number=a;
       name=b;
       this.id = id;
   }

}