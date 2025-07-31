# 🍽️ Sistema_PWR

 O **Sistema_PWR** é uma aplicação Java simples, voltada para o gerenciamento de **restaurantes e clientes** via terminal. Permite registrar visitas aos restaurantes, voto no prato preferido do cliente e exibir estatísticas com o prato mais votado como favorito entre os restaurantes cadastrados.

## 🚀 Funcionalidades

- Adicionar restaurantes com prato principal
- Adicionar clientes com nome e e-mail
- Registrar visitas de clientes a restaurantes
- Votar em pratos preferidos (após visitar o restaurante)
- Listar todos os clientes que visitaram determinado restaurante
- Exibir o melhor prato baseado nos votos recebidos

## 🛠️ Tecnologias utilizadas

- Java 8+
- Coleções (`HashMap`, `HashSet`)
- Entrada via terminal (`Scanner`)
- Organização modular em pacotes

## ▶️ Como executar

1. Clone o repositório:
   ````bash
   git clone https://github.com/Gledson-Perdival-Junior/Sistema_PWR.git
   cd Sistema_PWR
   ````

2. Compile os arquivos Java:
  ````bash
  javac -d bin src/provaLp20242/*.java
  ````

3. Execute o sistema:
  ````bash
  java -cp bin provaLp20242.Main
  ````
**OBS:** Certifique-se de ter o Java JDK instalado e configurado no seu PATH.

## 📁 Estrutura

````bash
Sistema_PWR/
├── src/provaLp20242/
│   ├── Sistema_PWR.java       # Lógica central do sistema
│   ├── Restaurantes.java      # Classe de restaurante
│   ├── Clientes.java          # Classe de cliente
│   └── Main.java              # Interface de linha de comando
├── bin/                       # Arquivos compilados
````

## ✅ Exemplo de uso no terminal

````bash
====== MENU FILMES ======
1 - Adicionar restaurante
2 - Adicionar cliente
3 - Registrar visita
4 - Votar em prato preferido
5 - Listar visitantes
6 - Melhor prato
0 - Sair
````

## 📄 Licença
Este projeto está sob a Licença MIT. Sinta-se livre para usar, modificar e contribuir.









