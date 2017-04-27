delimiter $$
drop PROCEDURE if exists ap_hello_name $$
create PROCEDURE sp_hello_name (
  in name varchar(100),
  out rs varchar(100)
  )
  begin 
  select CONCAT("HELLO ", name) into rs;
  end $$
delimiter;

show procedure status; 

set @name ='James' , @rs='';
call sp_hello_name(@name, @rs);
select @rs;