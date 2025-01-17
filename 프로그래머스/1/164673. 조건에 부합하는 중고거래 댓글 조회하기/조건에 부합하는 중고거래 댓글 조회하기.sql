-- 코드를 입력하세요
SELECT UGB.TITLE, UGB.BOARD_ID, UGR.REPLY_ID, UGR.WRITER_ID, UGR.CONTENTS, 
date_format(UGR.CREATED_DATE , '%Y-%m-%d') 
FROM USED_GOODS_BOARD UGB
JOIN USED_GOODS_REPLY UGR
ON UGB.BOARD_ID = UGR.BOARD_ID
WHERE UGB.CREATED_DATE >= '2022-10-01'
AND UGB.CREATED_DATE < '2022-11-01'
ORDER BY UGR.CREATED_DATE ASC, UGB.TITLE ASC;