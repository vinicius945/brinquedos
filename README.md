# 🧸 Brinquedos API

Uma API desenvolvida em Java com Spring Boot para gerenciamento de brinquedos voltados a crianças de até 14 anos. Permite cadastrar, listar, buscar por nome, tipo, classificação etária e preço, tudo integrado com um banco de dados Oracle.

---

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Oracle Database
- Postman
- Git / GitHub

---

## 📸 Imagem da aplicação

<img width="959" alt="image" src="https://github.com/user-attachments/assets/178ad71c-9a18-470e-97bf-e04607734f8d" />


---

## 🛠️ Endpoints principais

- `GET /brinquedos` → Lista todos os brinquedos  
- `GET /brinquedos/{id}` → Busca por ID  
- `GET /brinquedos/nome/{nome}` → Busca por nome  
- `GET /brinquedos/tipo/{tipo}` → Busca por tipo  
- `GET /brinquedos/classificacao/{classificacao}` → Busca por classificação etária  
- `GET /brinquedos/preco/{preco}` → Lista brinquedos com preço inferior  
- `POST /brinquedos` → Cadastra um novo brinquedo

### Exemplo de JSON para cadastro via Postman:

```json
{
  "nome": "Boneca Elsa",
  "tipo": "Boneca",
  "classificacao": "6",
  "tamanho": "Médio",
  "preco": 89.90
}
