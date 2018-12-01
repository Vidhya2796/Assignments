package com.vidhyac.sql;

import java.sql.Date;

public class Employee {
	/*CREATE TABLE EMP
	(
		 EMPNO NUMERIC(4) CONSTRAINT EMPNO_EMP_PK PRIMARY KEY,
		 ENAME VARCHAR(10),
		 JOB   VARCHAR(9),
		 MGR   NUMERIC(4), 
		 HIREDATE DATE,
		 SAL NUMERIC(7,2),        
		 COMM NUMERIC(7,2),        
		 DEPTNO NUMERIC(2) CONSTRAINT DEPTNO_DEPT_FK REFERENCES DEPT(DEPTNO)      
	);*/
	int EMPNO;String ENAME;String JOB;int MGR;double SAL;double COMM;int DEPTNO;


	public Employee(int eMPNO, String eNAME, String jOB, int mGR, double sAL,
			double cOMM,int dEPTNO) {
		super();
		EMPNO = eMPNO;
		ENAME = eNAME;
		JOB = jOB;
		MGR = mGR;
		SAL = sAL;
		COMM = cOMM;
		DEPTNO=dEPTNO;
	}

	public int getEMPNO() {
		return EMPNO;
	}

	public void setEMPNO(int eMPNO) {
		EMPNO = eMPNO;
	}

	public String getENAME() {
		return ENAME;
	}

	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}

	public String getJOB() {
		return JOB;
	}

	public void setJOB(String jOB) {
		JOB = jOB;
	}

	public int getMGR() {
		return MGR;
	}

	public void setMGR(int mGR) {
		MGR = mGR;
	}

	

	public double getSAL() {
		return SAL;
	}

	public void setSAL(double sAL) {
		SAL = sAL;
	}

	public double getCOMM() {
		return COMM;
	}

	public void setCOMM(double cOMM) {
		COMM = cOMM;
	}

	@Override
	public String toString() {
		return "Employee [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB
				+ ", MGR=" + MGR + ", SAL=" + SAL + ", COMM=" + COMM + "]";
	}


	
}
