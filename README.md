# 📑 To Do List | 📑 Lista de afazeres

O projeto de **To-Do list** consiste em uma lista de afazeres em uma **API REST**. Destina-se a pessoas desorganizadas ou esquecidas que necessitam de uma lista de afazeres.


## Funcionalidades

- Adicionar afazeres.
- Remover afazers.
- Alterar afazers.
- Listar todos os afazeres.
- Sistema de prioridades por ranking numerico.


## API Reference

#### Liste todas as tarefas

```http
  GET /todolist
```

#### Adicione uma tarefa

```http
  POST /todolist
```

| Parametro | Tipo     | Descrição                |
| :-------- | :------- | :------------------------- |
| `todo` | `JSON` | **Requer** uma tarefa descrita em JSON |

#### Altere uma tarefa

```http
  PUT /todolist
```

| Parametro | Tipo     | Descrição                |
| :-------- | :------- | :------------------------- |
| `todo` | `JSON` | **Requer** uma tarefa descrita com id  *(de uma tarefa existente)* em JSON |

#### Deletar uma tarefa

```http
  DELETE /todolist
```

| Parametro | Tipo     | Descrição                |
| :-------- | :------- | :------------------------- |
| `id` | `Long` | **Requer** um id de uma tarefa existente|

#### Exemplo de JSON:
```
{
	"nome": "Fazer a Pintura de artes",
	"descricao": "Pintura duocromatica meio abstrata",
	"realizada": true,
	"prioridade":5
}
```


## Tech Stack

**Linguagem:** Java

**Framework:** Spring

**Banco de dados:** MySQL


## Aprendizados

Com este projeto aprendi a desenvolver to do lists completas, com todas as requisiçoes, alem de boas praticas de desenvolvimento.


## Relacionados

Aqui um projeto mais recente com uma notavel evolução 🤩
[📝 Agendador](https://github.com/JoaovictorCorrealuzia/Projeto-de-Agenda---CRUD)


## Autor

- [JoaovictorCorrealuzia](https://github.com/JoaovictorCorrealuzia)

