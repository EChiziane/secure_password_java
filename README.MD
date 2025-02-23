Aqui está a documentação aprimorada do projeto:

---

# Secure Password API

## 📌 Descrição
O **Secure Password API** é um serviço REST desenvolvido em **Spring Boot** que verifica a segurança de senhas com base em critérios definidos. Ele retorna feedback detalhado caso a senha não atenda aos requisitos de segurança, permitindo integração com sistemas que necessitam de validação de credenciais seguras.

## 🚀 Funcionalidades
- 🔹 **Validação de senha** baseada em regras de segurança.
- 🔹 **Retorno de erros detalhados** caso a senha seja fraca.
- 🔹 **API REST simples e escalável** para integração com outras aplicações.

## 📜 Regras de Validação
Uma senha segura deve conter:  
✅ **Pelo menos 8 caracteres**  
✅ **Pelo menos 1 letra maiúscula**  
✅ **Pelo menos 1 letra minúscula**  
✅ **Pelo menos 1 número**  
✅ **Pelo menos 1 caractere especial**

## 📡 Tecnologias Utilizadas
O projeto utiliza as seguintes tecnologias e bibliotecas:
- **Java 17** – Linguagem de programação principal.
- **Spring Boot 3** – Framework para criação de aplicações Java.
- **Spring Web** – Para a construção da API REST.
- **Maven** – Gerenciamento de dependências e build da aplicação.

## 📤 Exemplo de Requisição
### **Endpoint:**
```
POST /api/password/validate
```
### **Corpo da Requisição (JSON)**
```json
{
  "password": "Ex@mple123"
}
```
### **Respostas Possíveis**

🔹 **Senha válida** (204 No Content)
```http
HTTP/1.1 204 No Content
```

🔹 **Senha inválida** (400 Bad Request)
```http
HTTP/1.1 400 Bad Request
Content-Type: application/json
```
```json
[
  "Password must have at least 8 characters",
  "Password must have at least one uppercase letter",
  "Password must have at least one special character"
]
```

## 📄 Licença
```
Copyright © 2024

Este software é de código aberto e pode ser modificado e distribuído conforme as regras da licença associada.  
O uso é permitido para fins educacionais, comerciais e não comerciais, desde que a atribuição seja mantida.
```

Se precisar de mais alguma informação ou ajustes, me avise! 🚀