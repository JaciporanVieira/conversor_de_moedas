# 💱 Conversor de Moedas

Este é um conversor de moedas em **Java**, que utiliza uma API externa para obter cotações atualizadas em tempo real. O projeto é modular, interativo e conta com registro de histórico das conversões realizadas pelo usuário.

## 📌 Funcionalidades

- ✅ Conversão de valores entre diferentes moedas (USD, BRL, ARS, COP, etc.)
- ✅ Consumo de API REST com retorno em JSON
- ✅ Entrada de dados interativa via console
- ✅ Persistência do histórico de conversões em arquivo JSON
- ✅ Configuração externa para chave da API via arquivo `config.properties`
- ✅ Registro de logs com data e hora das operações

## 🛠️ Tecnologias Utilizadas

- Java 11+
- Requisições HTTP com `java.net.http.HttpClient`
- Manipulação de JSON com a biblioteca Gson (`com.google.gson`)
- Leitura e gravação de arquivos com `FileReader` e `FileWriter`
- Configuração externa via arquivo `config.properties` para a chave da API

## ⚙️ Configuração da Chave da API

Para que o conversor funcione corretamente, é necessário fornecer uma chave de API válida, usada para acessar dados de câmbio por meio da ExchangeRate API.

1. Crie um arquivo chamado `config.properties` na raiz do projeto.
2. Adicione a seguinte linha ao arquivo, substituindo `SUA_CHAVE_AQUI` pela chave da API obtida:


3. Salve o arquivo. A aplicação irá lê-lo automaticamente na execução.

## 🌍 Onde obter uma chave de API?

Você pode se registrar gratuitamente no [ExchangeRate API](https://www.exchangerate-api.com) para obter taxas de câmbio atualizadas em tempo real.

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/conversor-de-moedas.git
cd conversor-de-moedas


