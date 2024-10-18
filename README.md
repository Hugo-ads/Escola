## PROJETO ESCOLA

Java RESTful API

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class Aluno {
        +String nome
        +String matricula
        +String serie
        +String sala
        +String professor
    }

    class Disciplina {
        +String icon
        +String description
    }

    class Matematica {
        +Disciplina[]
    }

    class Portugues {
        +Disciplina[]
    }

    class Ciencias {
        +Disciplina[]
    }

    Aluno --> Matematica : "1"
    Aluno --> Portugues : "1"
    Aluno --> Ciencias : "1"
    Matematica --> Disciplina : "1..*"
    Portugues --> Disciplina : "1..*"
    Ciencias --> Disciplina : "1..*"
```
    Esse projeto básico representa a estrutura sugerida no JSON e cria uma API para visualizar os dados do aluno e suas disciplinas.