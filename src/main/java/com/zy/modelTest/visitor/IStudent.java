package com.zy.modelTest.visitor;

public interface IStudent {
	
	void visitor(TeacherLi teacherLi);
	
	void visitor(TeacherWang teacherWang);
	
	void visitor(TeacherZhao teacherZhao);
}
