# HelpMap

## Descrição

HelpMap é um sistema simples para cadastro e gerenciamento de instituições, abrigos e pontos de doação, desenvolvido em Java. O projeto permite o cadastro via console de instituições, abrigos e pontos de doação, além de consultas para listar os dados cadastrados.

O objetivo é facilitar a organização de informações sobre instituições que ajudam pessoas em situação de vulnerabilidade, seus abrigos e pontos onde podem ser feitas doações.

---

## Tecnologias

- Java 11+
- Maven (gerenciador de dependências e build)
- Java Collections Framework (listas, conjuntos)
- Programação orientada a objetos

---

## Funcionalidades

- Cadastro de Instituições via console
- Cadastro de Abrigos vinculados a uma Instituição
- Cadastro de Pontos de Doação vinculados a uma Instituição
- Consulta de Instituições, Abrigos e Pontos de Doação cadastrados
- Menu interativo via console com opções de cadastro e consulta
- Estrutura de serviços para manipulação dos dados

---

## Estrutura do Projeto
```bash
/helpmap
└── /src
└── /br/com/helpmap
├── /model # Entidades do sistema (CadastroInstituicao, Abrigo, enums, etc)
├── /service # Lógica de negócio e operações principais (cadastro, atualização)
├── /repository # Futuro local para acesso a dados (banco de dados, arquivos)
├── /controller # Futuro local para controle de entrada/saída e integração (APIs, UI)
└── Main.java # Simulação simples via terminal para cadastrar e testar funcionalidades
```
---

## Tecnologias Utilizadas

- Java 11+
- Estrutura modular com pacotes organizados
- Uso de coleções como `Set` para armazenar recursos e necessidades
- Enumerações para status e tipos de cadastro

---

## Como Usar

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/helpmap.git
   cd helpmap

2. **Compile o projeto**
   ```bash
   javac -d bin src/br/com/helpmap/*.java src/br/com/helpmap/model/*.java src/br/com/helpmap/service/*.java

3. **Execute a aplicação**
   ```bash
   java -cp bin br.com.helpmap.Main
