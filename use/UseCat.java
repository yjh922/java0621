package com.sp.project0621.use;
import com.sp.project0621.animal.Cat;

class UseCat{
	public static void main(String[] args){
		Cat c=new Cat();
		c.setAge(5);//setter�� ���� ������ ����
		int age=c.getAge();//getter�� ���� ������ ����
		System.out.println("���̴�"+age);
		//������� �̸��� �·� �ٲٰ�(setter), �ٲ� �̸��� ��ȸ�Ͽ�(getter) ����Ͻÿ�
		c.setName("��");
		String name=c.getName();
		System.out.println("�̸���"+name);
		//System.out.println(c.getName());
	}
}
