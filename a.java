public class Student{

	private String name ;//版本1.0
	private Character age ;//版本2.0
	private Integer sId ;//版本3.0
	private String className ;//版本3.1，新增字段，合并到4.0

	public Student(){
		super();
	//版本4.0
	}

	public void learn(){
		System.out.println("学生正在学习！");
		//分支mike增加了此代码！
	}

	public void learn(String name){
		System.out.println(name+"mike正在学习！")
			//真正的分支增加了此段代码 ，分支为mike！
	}
	
}
