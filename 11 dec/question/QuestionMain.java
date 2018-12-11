package com.vidhyac.question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionMain {

	public static void main(String[] args) {
		 ApplicationContext context1=new ClassPathXmlApplicationContext("question.xml");
		 Question question=context1.getBean(Question.class);
		 question.showQuesDetails();
	}

}
