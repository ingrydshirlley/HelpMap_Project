# HelpMap

## Descrição do Projeto

HelpMap é uma aplicação focada em gerenciar e conectar instituições que oferecem serviços de auxílio em situações de emergência, como abrigos, pontos de doação e eventos relacionados. O sistema permite o cadastro de instituições, registro de abrigos vinculados a essas instituições, e a gestão de recursos, necessidades e status dessas entidades.

O projeto foi desenvolvido para fins acadêmicos e visa simular um sistema que facilite o gerenciamento dessas informações, oferecendo uma base para possíveis extensões futuras, como integração com banco de dados, interface gráfica e APIs REST.

---

## Funcionalidades

- Cadastro de Instituições (com informações detalhadas)
- Cadastro de Abrigos vinculados a Instituições
- Gestão de status de ocupação, recursos e necessidades urgentes nos abrigos
- Estrutura modular dividida em camadas (model, service, repository, controller)
- Simulação de fluxo de cadastro e relacionamento via linha de comando (Main.java)

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

4. **Simulação no terminal**
   - A aplicação atualmente possui um fluxo simples no Main.java que cria um cadastro de instituição e um abrigo associado.

   - Você pode expandir a lógica adicionando menus e entradas pelo teclado.
