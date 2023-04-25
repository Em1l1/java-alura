-- ver status de base de datos.
SHOW GLOBAL STATUS LIKE 'Created_tmp_disk_tables';
SHOW GLOBAL STATUS LIKE 'Created_tmp_tables';

SHOW GLOBAL VARIABLES LIKE "tmp_table_size";

-- incrementar memoria de trabajo
SET GLOBAL tmp_table_size = 136700160;
