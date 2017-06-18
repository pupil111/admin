package com.zy.modelTest.visitor;

public class VisitorTest {
	//访问者模式
	//针对不同对象进行不同的访问，对象为访问者开启访问权限，访问者获取对象并进行处理
	public static void main(String[] args) {
		
		ITeacher teacherLi = new TeacherLi("李老师");
		ITeacher teacherWang = new TeacherWang("王老师");
		ITeacher teacherZhao = new TeacherZhao("赵老师");
		
		IStudent studentWu = new StudentWu("吴");
		IStudent studentZheng = new StudentZheng("郑");
		IStudent studentZhou = new StudentZhou("周");
		
		
		teacherLi.accept(studentWu);
		teacherLi.accept(studentZheng);
		teacherLi.accept(studentZhou);
		System.out.println("====================");
		teacherWang.accept(studentWu);
		teacherWang.accept(studentZheng);
		teacherWang.accept(studentZhou);
		System.out.println("====================");
		teacherZhao.accept(studentWu);
		teacherZhao.accept(studentZheng);
		teacherZhao.accept(studentZhou);
		
	}
}
