# weatherapi
Api Java para consumir Api de Temperatura para Desafio do Citi

Essa api funciona da seguinte mandeira:

Ela consome os dados da API original (https://www.metaweather.com/api/)

Quando eu passo o nome de alguma cidade (em inglês), 
ela bate nesse endereço: https://www.metaweather.com/api/location/search/?query=${city}
pega o Woeid da cidade e em seguida vai nesse endereço: https://www.metaweather.com/api/location/${woeid}/
Me retornando o nome da cidade e a sua temperatura atual em Celsius e Fahrenheits.

Para acessar o Swagger da aplicação, rode ela em ambiente local e acesse o link:
http://localhost:8080/swagger-ui.html#/
