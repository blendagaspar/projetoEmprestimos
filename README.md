S
## Simulador de Crédito API

Esta é uma aplicação Spring Boot que simula empréstimos com base no valor solicitado, data de nascimento do cliente e prazo de pagamento. A API calcula o valor total a ser pago, o valor das parcelas mensais e o total de juros com base na faixa etária do cliente.

```
Pré-requisitos:

Antes de executar a aplicação, certifique-se de ter os seguintes itens instalados:
Java 17 ou superior

Maven

Banco de dados: pgAdmin 4

====================================================================================

Siga os passos abaixo para configurar e executar a aplicação localmente:

-Clone o repositório
-Compile o projeto:
-mvn clean install
-Execute a aplicação:
-mvn spring-boot:run
-Acesse a aplicação: http://localhost:8080/swagger-ui/index.html



=====================================================================================

POST /simulador/simular

Request:
{
  "valorEmprestimo": 10000,
  "dataNascimento": "1990-01-01",
  "prazoMeses": 12
}

Response:


{
  "valorTotalPago": 10272.84,
  "valorParcelaMensal": 856.07,
  "totalJurosPagos": 272.84
}

```



