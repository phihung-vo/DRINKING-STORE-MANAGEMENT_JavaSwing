USE QLCF
GO
ALTER PROC SP_SEL_ENCRYPT_ADMIN AS
BEGIN
	SELECT [USER],PASSWORD , NAME
	FROM Admin
END

--EXEC SP_SEL_ENCRYPT_ADMIN