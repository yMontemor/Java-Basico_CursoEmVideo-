# Exercícios de Java Básico — Curso em Vídeo

Este repositório reúne meus exercícios práticos desenvolvidos durante o curso de **Java Básico** do [Curso em Vídeo](https://www.cursoemvideo.com/), ministrado pelo professor Gustavo Guanabara.

O repositório está organizado como uma coleção de projetos independentes, divididos pelas pastas `aula4` a `aula15`. Como a maioria dos exercícios utiliza uma classe principal chamada `Main`, consulte a tabela e as instruções abaixo para identificar qual pasta abrir ou qual arquivo executar em cada aula.

---

## Conteúdo por Aula

| Aula | Pasta da Aula | Projetos / Exercícios | Conceitos Praticados |
| :--- | :--- | :--- | :--- |
| **Aula 4** | [`aula4/`](./aula4) | [`untitled`](./aula4/untitled) (`primeiroprograma.PrimeiroPrograma`) | Estrutura básica de um programa Java (`package`, `class`, método `main`) e saída no console com `System.out.println`. |
| **Aula 5** | [`aula5/`](./aula5) | [`aula5_swing`](./aula5/aula5_swing), [`OlaMundoJavaFX`](./aula5/OlaMundoJavaFX) | Introdução a interfaces gráficas com Java Swing (formulário `.form` com `JButton` e `JLabel`) e aplicação inicial em JavaFX com Maven e FXML (`HelloApplication`, `HelloController`, `Launcher`). |
| **Aula 6** | [`aula6/`](./aula6) | [`TiposPrimitivos`](./aula6/TiposPrimitivos), [`TesteTipos`](./aula6/TesteTipos), [`SomaSwing`](./aula6/SomaSwing) | Tipos primitivos (`int`, `float`), `String`, saída formatada (`printf`, `format`), leitura de dados com `Scanner`, conversão entre tipos (`Integer.toString`, `Integer.parseInt`) e rascunho inicial de classe (`TelaSoma`). |
| **Aula 7** | [`aula7/`](./aula7) | [`OperadoresArimeticos`](./aula7/OperadoresArimeticos), [`OperadoresSwing`](./aula7/OperadoresSwing) | Operadores aritméticos, incremento/decremento (`++`, `--`), atribuição composta (`+=`, `-=`, `*=`, `/=`), arredondamentos e números aleatórios com `Math` (`floor`, `ceil`, `round`, `random`). *(Nota: `OperadoresSwing` contém apenas a estrutura de projeto da IDE, sem código-fonte).* |
| **Aula 8** | [`aula8/`](./aula8) | [`OperadorTernario`](./aula8/OperadorTernario), [`ComparacaoString`](./aula8/ComparacaoString), [`OperadoresLogicos`](./aula8/OperadoresLogicos) | Operador ternário (`? :`), comparação de objetos `String` com `.equals()` e operadores relacionais e lógicos (`&&`, `||`, `^`). |
| **Aula 9** | [`aula9/`](./aula9) | [`EstruturasCondicionais`](./aula9/EstruturasCondicionais), [`EstrCondComposta`](./aula9/EstrCondComposta) | Estruturas condicionais simples (`if`) para cálculo de média e compostas (`if`/`else`) para cálculo de idade e verificação de maioridade. |
| **Aula 10** | [`aula10/`](./aula10) | [`EstrCondEncadeada`](./aula10/EstrCondEncadeada), [`CondMultEscolha`](./aula10/CondMultEscolha) | Condicionais encadeadas (`if`/`else if`/`else`) para verificação de obrigatoriedade de voto e múltipla escolha (`switch`/`case`, incluindo múltiplos valores por `case`). |
| **Aula 11** | [`aula11/`](./aula11) | [`EstruturasDeRepeticao`](./aula11/EstruturasDeRepeticao), [`While`](./aula11/While), [`While_2`](./aula11/While_2), [`For`](./aula11/For) | Estruturas de repetição (`while`, `for` e `do-while`), contadores, acumuladores de soma com entrada via `Scanner` e geração de tabuada. |
| **Aula 12** | [`aula12/`](./aula12) | [`untitled`](./aula12/untitled), [`Numeros`](./aula12/Numeros) | Laço com teste lógico no final (`do-while`) e repetição controlada por resposta do usuário (`[S/N]` com `equalsIgnoreCase`). |
| **Aula 13** | [`aula13/`](./aula13) | [`For_Cambalhota`](./aula13/For_Cambalhota) | Estrutura de repetição com variável de controle (`for`) e variação de passo. |
| **Aula 14** | [`aula14/`](./aula14) | [`vetores`](./aula14/vetores), [`vetor02`](./aula14/vetor02), [`vetor03`](./aula14/vetor03) | Declaração e percurso de vetores (`length`), vetores paralelos com verificação de ano bissexto e validação no `Scanner` (`hasNextInt`), ordenação com `Arrays.sort()` e laço `for-each`. |
| **Aula 15** | [`aula15/`](./aula15) | [`Procedimento`](./aula15/Procedimento), [`Funcoes`](./aula15/Funcoes), [`TesteFuncao02`](./aula15/TesteFuncao02), [`Ex`](./aula15/Ex) | Criação de métodos estáticos sem retorno (`void`) e com retorno (`int`, `String`), organização do código em múltiplas classes (`Main` e `Operacoes`) e manipulação de vetores. |

---

## Evolução do Aprendizado e Exemplos Representativos

A sequência de exercícios acompanha a progressão dos fundamentos da linguagem:

1. **Saída básica e estrutura de classes (Console):**
   - Em [`aula4/untitled/src/primeiroprograma/PrimeiroPrograma.java`](./aula4/untitled/src/primeiroprograma/PrimeiroPrograma.java), o foco é entender a declaração de pacote, classe e o ponto de entrada `main` exibindo `"Olá, mundo!"`.
2. **Primeiros passos com Interfaces Gráficas (Swing e JavaFX):**
   - **Swing:** Em [`aula5/aula5_swing`](./aula5/aula5_swing), há o mapeamento de componentes visuais (`JButton` e `JLabel`) utilizando o construtor de formulários do IntelliJ IDEA ([`TelaPrincipal.form`](./aula5/aula5_swing/src/OlaMundoSwing/TelaPrincipal.form) e [`TelaPrincipal.java`](./aula5/aula5_swing/src/OlaMundoSwing/TelaPrincipal.java)). Já [`aula6/SomaSwing`](./aula6/SomaSwing/src/TelaSoma.java) e [`aula7/OperadoresSwing`](./aula7/OperadoresSwing) foram apenas iniciados, sem implementação completa.
   - **JavaFX:** Em [`aula5/OlaMundoJavaFX`](./aula5/OlaMundoJavaFX), há uma aplicação estruturada com Maven, módulos Java (`module-info.java`), layout declarativo em FXML ([`hello-view.fxml`](./aula5/OlaMundoJavaFX/src/main/resources/com/example/olamundojavafx/hello-view.fxml)) e controlador de eventos ([`HelloController.java`](./aula5/OlaMundoJavaFX/src/main/java/com/example/olamundojavafx/HelloController.java)).
3. **Entrada de dados, operadores e controle de fluxo (Console):**
   - Nas aulas 6 a 13, os exercícios no console evoluem da leitura de dados com `Scanner` e uso da classe `Math` ([`OperadoresAritmeticos.java`](./aula7/OperadoresArimeticos/src/OperadoresAritmeticos.java)) para tomadas de decisão com `if/else` e `switch` ([`CondMultEscolha/src/Main.java`](./aula10/CondMultEscolha/src/Main.java)) e laços de repetição ([`Numeros/src/Main.java`](./aula12/Numeros/src/Main.java)).
4. **Estruturas de dados e modularização (Console):**
   - Em [`aula14/vetor02/src/Main.java`](./aula14/vetor02/src/Main.java), o código combina vetores paralelos, validação de entrada (`sc.hasNextInt()`) e regras de negócio para calcular anos bissextos e listar os dias de cada mês.
   - Em [`aula15/TesteFuncao02`](./aula15/TesteFuncao02/src), o programa passa a dividir responsabilidades entre a classe principal ([`Main.java`](./aula15/TesteFuncao02/src/Main.java)) e uma classe auxiliar com método estático ([`Operacoes.java`](./aula15/TesteFuncao02/src/Operacoes.java)).

---

## Como Executar

Cada subpasta dentro de `aula4` a `aula15` é um projeto independente criado no **IntelliJ IDEA** (com arquivos `.iml` e pasta `.idea`). Como há várias classes chamadas `Main`, abra ou compile sempre a partir da subpasta específica do exercício desejado.

### 1. Exercícios de Console

Para compilar e executar os exercícios de console pelo terminal, basta ter um **JDK** instalado. Note que [`aula10/CondMultEscolha`](./aula10/CondMultEscolha/src/Main.java) utiliza múltiplos rótulos em um mesmo `case` (`case 6, 8:`), sintaxe suportada a partir do Java 14.

**Exemplo 1 — Exercício de classe única (Verificador de ano bissexto e meses na Aula 14):**

```bash
cd aula14/vetor02/src
javac Main.java
java Main
```

**Exemplo 2 — Exercício com pacote declarado (Primeiro Programa na Aula 4):**

```bash
cd aula4/untitled/src
javac primeiroprograma/PrimeiroPrograma.java
java primeiroprograma.PrimeiroPrograma
```

**Exemplo 3 — Exercício com múltiplas classes (Aula 15):**

```bash
cd aula15/TesteFuncao02/src
javac Main.java Operacoes.java
java Main
```

### 2. Projeto com JavaFX (`aula5/OlaMundoJavaFX`)

O projeto [`aula5/OlaMundoJavaFX`](./aula5/OlaMundoJavaFX) utiliza **Maven** (com Maven Wrapper incluído) e está configurado no [`pom.xml`](./aula5/OlaMundoJavaFX/pom.xml) com:
- **Java `21`** (`<maven.compiler.release>21</maven.compiler.release>`)
- **OpenJFX `21.0.6`** (`javafx-controls` e `javafx-fxml`) e `javafx-maven-plugin` (`0.0.8`)

Para executá-lo a partir da pasta do projeto (requer JDK 21+ configurado no ambiente):

```bash
cd aula5/OlaMundoJavaFX
# No Linux/macOS:
./mvnw javafx:run

# No Windows (PowerShell ou CMD):
.\mvnw.cmd javafx:run
```

### 3. Projetos com Java Swing (`aula5`, `aula6` e `aula7`)

Os exercícios voltados para Swing neste repositório são rascunhos ou formulários de estudo criados no IntelliJ IDEA e **não possuem método `main` executável** no estado atual dos arquivos:
- [`aula5/aula5_swing`](./aula5/aula5_swing): contém [`TelaPrincipal.java`](./aula5/aula5_swing/src/OlaMundoSwing/TelaPrincipal.java) e o arquivo [`TelaPrincipal.form`](./aula5/aula5_swing/src/OlaMundoSwing/TelaPrincipal.form) (formato específico do GUI Designer do IntelliJ IDEA). Para visualizar ou editar o layout, abra a pasta `aula5/aula5_swing` no IntelliJ IDEA; para executá-lo, seria necessário adicionar um método `main` instanciando um `JFrame` com o painel do formulário.
- [`aula6/SomaSwing`](./aula6/SomaSwing): contém apenas a declaração vazia da classe [`TelaSoma`](./aula6/SomaSwing/src/TelaSoma.java).
- [`aula7/OperadoresSwing`](./aula7/OperadoresSwing): contém apenas os arquivos de configuração do projeto (`.iml` e `.idea`), sem arquivos `.java`.

---

## Referência

- **Curso:** Curso de Java Básico — [Curso em Vídeo](https://www.cursoemvideo.com/)
- **Professor:** Gustavo Guanabara
