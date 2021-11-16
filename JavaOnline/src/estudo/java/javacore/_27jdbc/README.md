Curso Java Completo - Aula 141: JDBC pt 02 Criando o banco e as tabelas

acessar a pasta e criar o banco de dados

```docker-compose up```

Criar as seguintes tabelas:

- Carro (id, placa, nome, comprador_id)
- Comprador (id, nome, cpf)
-----------
Add o arquivo "mysql-connector-java-8.0.25.jar" na pasta lib do projeto

------
Para criar a procedures no SQL executar o comando abaixo:

```
use agencia;
DELIMITER //
create procedure SP_GetCompradoresPorNome(termo varchar(100))
begin
select * from comprador where nome like termo;
end //
DELIMITER ;
```