# User-Registration-App 📱

Este é um aplicativo Android para cadastro e gerenciamento de usuários, desenvolvido em Java. O projeto utiliza a biblioteca **Room** para persistência de dados local, permitindo armazenar informações como nome, CPF, e-mail e telefone.

## 🚀 Funcionalidades

- **Cadastro de Usuários:** Registro de dados básicos (Nome, CPF, E-mail, Telefone).
- **Persistência Local:** Uso de banco de dados SQLite através da biblioteca Room.
- **Relatórios:** Visualização de usuários cadastrados (em implementação).

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Banco de Dados:** Room Persistence Library
- **Layout:** XML (ConstraintLayout, LinearLayout)
- **Ferramenta de Build:** Gradle (Kotlin DSL)

## 📁 Estrutura Principal

- `User.java`: Define a entidade (tabela) do banco de dados.
- `UserDao.java`: Interface com os métodos de acesso aos dados (Insert, Select).
- `UserDataBase.java`: Configuração central do banco de dados Room.
- `MainActivity.java`: Tela principal de interação.
- `ReportActivity.java`: Tela destinada à exibição dos relatórios.

## ⚙️ Como executar o projeto

1. Faça o clone do repositório.
2. Abra o projeto no **Android Studio**.
3. Certifique-se de que o Gradle sincronizou corretamente.
4. Execute o app em um emulador ou dispositivo físico com Android (API 24 ou superior recomendada).

---
Desenvolvido por [Mateus Yano](https://github.com/).