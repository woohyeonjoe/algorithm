-- 코드를 입력하세요
SELECT DATE_FORMAT(DATETIME, '%H') AS HOUR, COUNT(ANIMAL_ID) AS COUNT
FROM ANIMAL_OUTS
WHERE DATE_FORMAT(DATETIME, '%T') BETWEEN '09:00:00' AND '20:00:00'
GROUP BY DATE_FORMAT(DATETIME, '%H')
ORDER BY DATE_FORMAT(DATETIME, '%H') ASC;
