class Dog({
   String name;
   Food f;

   public void setName(String d) {
		(this.)name=d;
   }

   public void setFood(Food fd) {
		(this.)f=fd;
   }
   public void setAge(int age){
		this.age=age;
   }
}
class UseDog {
	public static void main(String[] args){
		Dog d=new Dog();
		int x=7;

		d.setName("¼õ");
		d.setFood(new Food());
		d.setAge(x);
	}
}