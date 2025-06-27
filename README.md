💱 Conversor de Moedas
Este é um conversor de moedas desenvolvido em Java. O projeto consome uma API de taxas de câmbio para realizar conversões dinâmicas entre diferentes moedas diretamente via console.

📌 Funcionalidades
✅ Conversão de valores entre moedas internacionais (ex.: USD, BRL, EUR, etc.).
✅ Consumo de uma API REST para obter taxas de câmbio atualizadas.
✅ Manipulação de dados no formato JSON.
✅ Interatividade por meio de um menu no console.

🛠️ Tecnologias Utilizadas
Java 17+: Linguagem principal do projeto.

HTTP Client (java.net.http): Para realizar requisições à API.

Manipulação de JSON: Usando uma biblioteca como Gson.

Controle de versão: Código versionado no GitHub.

⚙️ Configuração da Chave da API
Para que o conversor funcione, é necessário obter uma chave de API válida. Essa chave é utilizada para acessar o serviço de taxas de câmbio.

🔐 Passo a Passo
Crie o arquivo de configuração
Crie um arquivo chamado config.properties na raiz do projeto.

Adicione a sua chave da API
Insira o seguinte conteúdo, substituindo SUA_CHAVE_AQUI por uma chave válida:

ini
Copiar
Editar
api.key=SUA_CHAVE_AQUI
Garanta a segurança do arquivo
O arquivo config.properties está listado no .gitignore, evitando que sua chave seja publicada no repositório.

🌍 Onde obter uma chave de API?
Você pode se registrar gratuitamente no ExchangeRate API para obter uma chave.

🚀 Como Executar
Clone o repositório

bash
Copiar
Editar
git clone https://github.com/JaciporanVieira/conversor_de_moedas.git
cd conversor_de_moedas
Configure a chave da API
Siga as instruções da seção anterior para configurar o arquivo config.properties.

Compile o projeto

css
Copiar
Editar
javac src/Main.java
Execute a aplicação

css
Copiar
Editar
java src.Main
📂 Estrutura do Projeto
bash
Copiar
Editar
conversor_de_moedas/
├── src/
│   ├── client/
│   │   ├── ApiKeyProvider.java           # Fornece a chave da API
│   │   └── ExchangeRateClient.java       # Cliente para consumir taxas de câmbio
│   ├── model/
│   │   ├── ConversionRateResponse.java   # Representa a resposta da API
│   │   └── Menu.java                     # Interface de menu do app
│   ├── service/
│   │    └── ConversionHistorySaver.java  # (Opcional) Salva o histórico de conversões
│   └── Main.java                         # Classe principal para execução
├── config.properties                     # Configurações (chave da API)
└── README.md                             # Documentação do projeto
🤝 Contribuindo
Contribuições são bem-vindas! Siga os passos abaixo para colaborar:

Faça um fork do repositório.

Crie uma branch para suas alterações:

bash
Copiar
Editar
git checkout -b feature/nova-funcionalidade
Faça o commit das suas alterações:

sql
Copiar
Editar
git commit -m 'Adiciona nova funcionalidade'
Faça o push para o repositório remoto:

bash
Copiar
Editar
git push origin feature/nova-funcionalidade
Abra um Pull Request.

Desenvolvido com 💻 por Jaciporan Vieira.
