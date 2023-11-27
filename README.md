# 🗳️ Projeto: Sistema de Votação RMI 

## Descrição do Projeto:

Este é um projeto básico de um sistema de votação utilizando Java e RMI (Remote Method Invocation). O sistema emula uma eleição real, onde um servidor RMI conta os votos enviados por diversas urnas (clientes RMI). O servidor exibe a apuração de votos a cada 5 segundos.

![server em execução](https://github.com/Neidielli/serverrmi/blob/main/img/server.jpeg)

## Estrutura do Projeto:

```
serverrmi/
|   |-- src/
|   |   |-- main/
|   |   |   |-- java/
|   |   |   |   |-- com/
|   |   |   |   |   |-- serverrmi/
|   |   |   |   |   |   |-- serverrmi/
|   |   |   |   |   |   |   |-- VotingServer.java
|   |   |   |   |   |   |   |-- VotingServiceImpl.java
|   |   |   |   |   |   |   |-- VotingService.java
|   |   |   |   |   |   |   |-- VotingClient.java
```

## Como Executar o Projeto:

1. **Clonar o Repositório:**
   - Abra o terminal e execute o seguinte comando para clonar o repositório:
     ```
     git clone https://github.com/Neidielli/serverrmi
     ```

2. **Configuração Inicial:**
   - Abra o NetBeans.
   - Vá para `File` -> `Open Project`.
   - Navegue até a pasta do projeto (`serverrmi`) e abra.

3. **Executar o Servidor:**
   - Abra `VotingServer.java` em `com.serverrmi.serverrmi`.
   - Execute o servidor clicando com o botão direito no código-fonte e escolhendo "Run File" ou pressionando `Shift + F6`.

4. **Executar o Cliente:**
   - Abra `VotingClient.java` no mesmo pacote do servidor.
   - Execute o cliente da mesma maneira que o servidor.

5. **Inserir Votos:**
   - No console do cliente, insira o nome do candidato (ou número) e o número de votos. Digite "0" para sair.

6. **Observar Apuração:**
   - No console do servidor, a apuração será exibida a cada 5 segundos.

## Contribuições:
Se você quiser contribuir para este projeto, sinta-se à vontade para:

- Abrir Issues para relatar problemas ou propor melhorias.
- Enviar Pull Requests para corrigir problemas ou adicionar novos recursos.

Este projeto é uma base simples para entender a implementação básica de RMI em Java. Personalize conforme necessário para atender a requisitos adicionais ou torná-lo mais robusto. 🚀
