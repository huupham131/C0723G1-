use quan_ly_sinh_vien;
select address, count(student_id) as 'số lượng học viên'
FROm student
GROUP BY address;
sELECT s.student_id,s.student_name, AVG(mark)
frOm student s join mark m on s.student_id = m.student_id
GROUP BY s.student_id, s.student_name;
sELECT s.student_id,s.student_name, AVG(mark)
frOm student s join mark m on s.student_id = m.student_id
GROUP BY s.student_id, s.student_name
HAVING Avg(mark) > 15;
sElEct s.student_id, s.student_name, AVG(mark)
frOm student s join mark m on s.student_id = m.student_id
GROUP BY s.student_id, s.student_name
HAVING Avg(mark) >= ALL (seLect avg(mark) frOm mark grOUP BY mark.student_id);