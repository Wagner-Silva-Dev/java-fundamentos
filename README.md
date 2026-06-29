# Java Fundamentos

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Repositório de estudos em Java, feito durante a graduação em ADS. Acompanha o curso **Maratona Java** (DevDojo), com exercícios próprios e adaptados conforme eu vou entendendo os conceitos — não é só seguir o vídeo, é tentar entender *por que* o código é escrito de determinado jeito antes de escrever.

Venho de Delphi XE, então algumas decisões de design aqui são também um exercício de "como isso se compara ao que eu já sabia fazer".

---

## Estrutura

```
src/
├── exercicios/              → exercícios com lógica de negócio mais completa
│   └── colaborador/         → hierarquia de classes do CadastroColaborador
├── fundamentos/
│   ├── arrays/               → arrays e ArrayList
│   ├── classes/
│   │   ├── associacao/       → associação entre classes (tem-um)
│   │   ├── concessionaria/
│   │   ├── enumeracao/       → enums
│   │   ├── herancas/         → herança e super (é-um)
│   │   ├── pessoas/
│   │   ├── polimorfismo/     → classes abstratas e override
│   │   └── sobrecarga/       → sobrecarga de métodos
│   ├── condicionais/         → if/else e switch
│   ├── lacosrepeticao/       → for, while, do-while
│   ├── modulos/               → separação em métodos
│   ├── operadores/            → operadores aritméticos e entrada
│   └── strings/               → manipulação de Strings
└── utilitarios/                → classes de apoio reutilizáveis
```

Pacotes de classes geralmente têm uma subpasta `teste/` com a classe que efetivamente executa e testa aquilo.

---

## Destaques

Os exercícios abaixo são os que exigiram mais decisão de design — não só "fazer funcionar", mas pensar em onde colocar a validação, o que devia ser imutável, e quando vale a pena criar uma exceção própria em vez de deixar o programa quebrar.

### CadastroColaborador

Sistema de cadastro com hierarquia de colaboradores (`Colaborador` abstrata → `ColaboradorComum`, `ColaboradorComissionado`, `ColaboradorProducao`), cada um calculando salário de forma diferente via polimorfismo.

O que torna esse exercício diferente dos outros:
- Exceção própria (`DadosInvalidosException`, unchecked) para validar regras de domínio — nome vazio, id negativo, vendas/peças negativas — direto no construtor.
- Separação clara entre **validação de domínio** (no construtor, sempre vale, não importa de onde o objeto venha) e **validação de UX/input** (no `main`, com loop de correção pro usuário digitar de novo caso esteja inválido).
- Campos `id` e `nome` como `final` — depois de criado, o colaborador não muda de identidade.

### PriorizaAtendimento

Sistema de pontuação de prioridade de atendimento com múltiplos critérios (renda per capita, dependentes, deficiência, tempo de desemprego, risco do bairro), cada um isolado em seu próprio método. Pensado pra separar "calcular pontuação" de "validar entrada" de "imprimir resultado" — três responsabilidades, três blocos de método diferentes.

### Laboratório (Amostra / AmostraQuimica / AmostraBiologica / AmostraUrgente)

Primeira vez usando classe abstrata de fato (não só herança simples): `Amostra` define o contrato (`calcularTempo()` abstrato), cada subtipo decide como cumprir esse contrato. Bom exemplo de quando herança é "é-um" de verdade — uma amostra urgente *é* uma amostra, só calcula o tempo diferente.

---

## Conceitos praticados

- Tipos primitivos, constantes (`static final`) e variáveis
- Encapsulamento, herança, associação, sobrecarga e polimorfismo
- Classes abstratas e enums
- Exceções customizadas (unchecked) para validação de domínio
- Estruturas condicionais e de repetição
- Entrada e validação de dados com `Scanner` (incluindo as armadilhas de buffer entre `nextInt`/`nextDouble` e `nextLine`)
- Coleções (`ArrayList`) e arrays multidimensionais
- Organização de código em pacotes, separando regra de domínio de regra de interface

---

## Projeto de faculdade

Em paralelo aos estudos individuais, desenvolvi com um colega da faculdade um sistema parecido em conceito ao CadastroColaborador (cadastro e cálculo de salário por tipo de vínculo), como projeto de uma UC de ADS.

**Em dupla com:** [Kaio](https://github.com/kaio-vex) — repositório do projeto em [ProjetosFaculdade](https://github.com/kaio-vex/ProjetosFaculdade)

---

## Sobre

Estudante de Análise e Desenvolvimento de Sistemas. Este repositório existe mais como registro de progresso do que como vitrine — alguns exercícios são bem simples de propósito, porque o ponto era praticar um conceito específico, não impressionar.
