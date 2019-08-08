-- INSERT PreparedStatement 
INSERT INTO EMP e(e.empno, e.ename) 
VALUES (?, ?);

-- UPDATE PreparedStatement 
UPDATE EMP e
   SET e.job = ?
     , e.hiredate = sysdate
     , e.sal = ?
     , e.deptno = ?
 WHERE e.empno = ?     
;

-- DELETE PreparedStatement 
DELETE EMP e
 WHERE e.empno = ?
; 

-- MEMBER DML PreparedStatement
INSERT INTO MEMBER m (MEMBER_ID, MEMBER_NAME)
VALUES (?, ?)
;

UPDATE MEMBER m
   SET m.phone = ?
     , m.major = ?
     , m.birth_month = ?
     , m.gender = ?
 WHERE m.member_id = ?     
;

DELETE MEMBER m
 WHERE m.member_id = ?
; 

-- MEMBER 테이블 전체 목록 조회
SELECT m.member_id
     , m.member_name
     , m.phone
     , TO_CHAR(m.reg_date, 'YYYY-MM-DD') reg_date
     , m.address
     , m.major
     , m.birth_month
     , m.gender
  FROM MEMBER m
;  






