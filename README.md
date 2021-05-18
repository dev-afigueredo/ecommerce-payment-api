<h2>API para gestão de pagamento orientado a eventos</h2>

API de gestão de Checkout: https://github.com/dev-afigueredo/ecommerce-checkout-api

São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido:

* Java 14 ou versões superiores.
* Gradle 6.8.3 ou versões superiores.
* IntelliJ IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* PostgreSQL
* Docker
* Kafka (Gradle irá fazer o download)
* Zookeeper (Gradle irá fazer o download)
* Schema-register (Gradle irá fazer o download)

Lembrando que essa API ficará a ouvir o evento do Checkout que é o encarregado de processar os dados da compra
e salvar no banco os dados as informações de entrega e do comprador. Assim, essa API processar os dados de pagamento
e salvará no banco de dados as informações enviadas pelo evento da API do Checkout como o número do cartão, CVV, nome do titular, forma de pagamento, etc.