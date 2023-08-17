create table employees (
                           id serial primary key,
                           surname varchar(80),
                           experience int

)
    insert into employees values
	(1, 'Иванов', 10),
	(2, 'Петров', 12),
	(3, 'Сидоров', 14)

select surname from employees
order by experience desc
    limit 1 offset 1