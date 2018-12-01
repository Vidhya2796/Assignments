package com.vidhyac.sql;

import java.util.Arrays;
import java.util.List;

public class SqlTest {

	public static void main(String[] args) {
		
		
				
			/*
				INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'23-JAN-82',1300,NULL,10);
				 EMPNO NUMERIC(4) CONSTRAINT EMPNO_EMP_PK PRIMARY KEY,
				
				*/
			List<Employee> emp=Arrays.asList(
				new Employee(7369, "SMITH", "CLERK", 7902, 800, 0,20),
				new Employee(7499, "ALLEN", "SALESMAN", 7698, 1600, 300,30),
				new Employee(7521, "WARD", "SALESMAN", 7698, 1250, 500,30),
				new Employee(7566, "JONES", "MANAGER", 7839, 2975, 0,20),
				new Employee(7654, "MARTIN", "SALESMAN", 7698, 1250, 1400,30),
				new Employee(7698, "BLAKE", "MANAGER", 7839, 2850, 0,30),
				new Employee(7782, "CLARK", "MANAGER", 7839, 2450, 0,10),
				new Employee(7788, "SCOTT", "ANALYST", 7566, 3000, 0,20),
				new Employee(7839, "KING", "PRESIDENT", 0, 5000, 0,10),
				new Employee(7844, "TURNER", "SALESMAN", 7698, 1500, 0,30),
				new Employee(7876, "ADAMS", "CLERK", 7788, 1100, 0,20),
				new Employee(7900, "JAMES", "CLERK", 7698, 950, 0,30),
				new Employee(7902, "FORD", "ANALYST", 7566, 3000, 0,20),
				new Employee(7934, "MILLER", "CLERK", 7782, 1300, 0,10)
				
				
				
				);

	}

}
