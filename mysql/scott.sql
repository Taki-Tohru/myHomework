
CREATE TABLE dept
       (deptno TINYINT(2) NOT NULL ,
	dname VARCHAR(14) ,
	loc VARCHAR(13),
	PRIMARY KEY (deptno),
	KEY dname (dname)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE emp
       (empno INT(4) NOT NULL ,
	ename VARCHAR(10),
	job VARCHAR(9),
	mgr INT(4),
	hiredate DATE,
	sal INT(7),
	comm INT(7),
	deptno TINYINT(2),
	PRIMARY KEY (empno),
	KEY ename (ename),
	CONSTRAINT FK_deptno FOREIGN KEY (deptno) REFERENCES dept)ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO dept VALUES
	(10,'ACCOUNTING','NEW YORK');
INSERT INTO dept VALUES (20,'RESEARCH','DALLAS');
INSERT INTO dept VALUES
	(30,'salES','CHICAGO');
INSERT INTO dept VALUES
	(40,'OPERATIONS','BOSTON');

INSERT INTO emp VALUES
(7369,'SMITH','CLERK',7902,str_to_date('17-12-1980','%d-%m-%Y'),800,NULL,20);
INSERT INTO emp VALUES
(7499,'ALLEN','SALESMAN',7698,str_to_date('20-2-1981','%d-%m-%Y'),1600,300,30);
INSERT INTO emp VALUES
(7521,'WARD','SALESMAN',7698,str_to_date('22-2-1981','%d-%m-%Y'),1250,500,30);
INSERT INTO emp VALUES
(7566,'JONES','MANAGER',7839,str_to_date('2-4-1981','%d-%m-%Y'),2975,NULL,20);
INSERT INTO emp VALUES
(7654,'MARTIN','SALESMAN',7698,str_to_date('28-9-1981','%d-%m-%Y'),1250,1400,30);
INSERT INTO emp VALUES
(7698,'BLAKE','MANAGER',7839,str_to_date('1-5-1981','%d-%m-%Y'),2850,NULL,30);
INSERT INTO emp VALUES
(7782,'CLARK','MANAGER',7839,str_to_date('9-6-1981','%d-%m-%Y'),2450,NULL,10);
INSERT INTO emp VALUES
(7788,'SCOTT','ANALYST',7566,str_to_date('19-4-87','%d-%m-%Y'),3000,NULL,20);
INSERT INTO emp VALUES
(7839,'KING','PRESIDENT',NULL,str_to_date('17-11-1981','%d-%m-%Y'),5000,NULL,10);
INSERT INTO emp VALUES
(7844,'TURNER','SALESMAN',7698,str_to_date('8-9-1981','%d-%m-%Y'),1500,0,30);
INSERT INTO emp VALUES
(7876,'ADAMS','CLERK',7788,str_to_date('23-5-87','%d-%m-%Y'),1100,NULL,20);
INSERT INTO emp VALUES
(7900,'JAMES','CLERK',7698,str_to_date('3-12-1981','%d-%m-%Y'),950,NULL,30);
INSERT INTO emp VALUES
(7902,'FORD','ANALYST',7566,str_to_date('3-12-1981','%d-%m-%Y'),3000,NULL,20);
INSERT INTO emp VALUES
(7934,'MILLER','CLERK',7782,str_to_date('23-1-1982','%d-%m-%Y'),1300,NULL,10);


CREATE TABLE bonus
	(
	ename VARCHAR(10)	,
	job VARCHAR(9)  ,
	sal INT,
	comm INT
	) ENGINE=MyISAM DEFAULT CHARSET=latin1;


CREATE TABLE salgrade
      ( grade TINYINT,
	losal INT,
	hisal INT )ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO salgrade VALUES (1,700,1200);
INSERT INTO salgrade VALUES (2,1201,1400);
INSERT INTO salgrade VALUES (3,1401,2000);
INSERT INTO salgrade VALUES (4,2001,3000);
INSERT INTO salgrade VALUES (5,3001,9999);