
# 💱 Conversor de Moedas

Este é um conversor de moedas em **Java**, que utiliza uma API externa para obter cotações atualizadas em tempo real. O projeto é modular, interativo e realiza a conversão de moedas diretamente via console.

## 📌 Funcionalidades

✅ Conversão de valores entre diferentes moedas (USD, BRL, EUR, etc.)  
✅ Consumo de API REST com retorno em JSON  
✅ Entrada de dados interativa via console  
✅ Configuração externa para chave da API  

## 🛠️ Tecnologias Utilizadas

- **Java 17+**  
- **Requisições HTTP** com `java.net.http`  
- **Manipulação de JSON** com a biblioteca `com.google.gson`  
- **Arquivo config.properties** para configuração externa da chave da API  

## ⚙️ Configuração da Chave da API

Para que o conversor funcione corretamente, é necessário fornecer uma chave de API válida. Essa chave é usada para acessar os dados de câmbio de moedas por meio de um serviço externo.

### 🔐 Passo a Passo para Configuração

1. Crie um arquivo chamado `config.properties` na raiz do projeto.
2. Adicione a seguinte linha ao arquivo, substituindo `SUA_CHAVE_AQUI` pela chave da API que você obteve:

   ```
   api.key=SUA_CHAVE_AQUI
   ```

3. Salve o arquivo. Ele será lido automaticamente pela aplicação quando for executada.

### 🛡️ Segurança

- O arquivo `config.properties` já está incluído no `.gitignore`, então ele não será enviado ao GitHub, mantendo sua chave segura.
- **Nunca compartilhe sua chave de API publicamente.**

### 🌍 Onde obter uma chave de API?

Você pode se registrar gratuitamente no ExchangeRate API, um serviço confiável e fácil de usar para obter taxas de câmbio de moedas em tempo real.  

Para se cadastrar, acesse: [ExchangeRate API](https://www.exchangerate-api.com/)

## 🚀 Como Executar

1. Clone o repositório:  
   ```bash
   git clone https://github.com/JaciporanVieira/conversor_de_moedas.git
   cd conversor_de_moedas
   ```

2. Crie e configure o `config.properties` conforme instruído acima.
3. Compile os arquivos Java:  
   ```bash
   javac src/Main.java
   ```
4. Execute a aplicação:  
   ```bash
   java src.Main
   ```

## 📂 Estrutura do Projeto

```plaintext
conversor_de_moedas/
├── src/
│   ├── Main.java                    # Classe principal para execução
│   ├── ConversorMoedas.java         # Realiza conversões de moedas
│   └── UtilJSON.java                # Manipula os dados recebidos da API
├── README.md                        # Documentação do projeto
├── config.properties                # Configurações (chave da API)
└── pom.xml                          # Dependências e build do projeto
```

## 🖥️ Interface do Terminal

Quando a aplicação é executada, o seguinte menu é exibido para o usuário:

```
---- SEJA BEM-VINDO AO CONVERSOR DE MOEDAS ----

Escolha uma das opções:
1. Dólar -> Real
2. Real -> Dólar
3. Dólar -> Peso Argentino
4. Peso Argentino -> Dólar
5. Dólar -> Peso Colombiano
6. Peso Colombiano -> Dólar
7. Exibir Histórico de Conversões
8. Sair
-> Opção:
```

O usuário pode escolher uma das opções para realizar a conversão ou acessar o histórico de conversões realizadas.

## 🤝 Contribuindo

Contribuições são bem-vindas!  

1. Faça um fork  
2. Crie uma branch (git checkout -b feature/nova-funcionalidade)  
3. Commit suas alterações (git commit -m 'Adiciona nova funcionalidade')  
4. Push na branch (git push origin feature/nova-funcionalidade)  
5. Abra um Pull Request  

---

Desenvolvido com 💻 por [Jaciporan Vieira](https://github.com/JaciporanVieira).
