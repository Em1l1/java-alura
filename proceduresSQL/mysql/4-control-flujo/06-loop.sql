CREATE TABLE tb_looping (ID INT);
SELECT * FROM tb_looping;

CREATE DEFINER=`root`@`localhost` PROCEDURE `looping`(vinicial INT, vfinal INT)
BEGIN
DECLARE vcontador INT;
DELETE FROM tb_looping;
SET vcontador = vinicial;
WHILE vcontador <= vfinal
DO
INSERT INTO tb_looping VALUES(vcontador);
SET vcontador = vcontador+1;
END WHILE;
SELECT * FROM tb_looping;
END;



CALL looping(1,10);

SELECT * FROM tb_looping;