# Authentication and Authorization

## 🔒 Description

This project demonstrates the implementation of **Authentication and Authorization Security Tactics** using **Spring Boot** and **Spring Security**. It follows the **Role-Based Access Control (RBAC)** model to restrict access to REST API endpoints based on user roles.

This architectural tactics assignment is focused on prototyping security mechanisms that protect systems by controlling user identity and access privileges.

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven
- An IDE like IntelliJ IDEA or Eclipse

### Dependencies

This project uses the following key dependencies:

- `spring-boot-starter-web`
- `spring-boot-starter-security`
- `spring-boot-devtools` *(optional, for hot reload)*

---

## 🏗️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/authentication-and-authorization.git
   cd authentication-and-authorization
   ```

2. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

3. Test the implemented endpoints:

   **Public endpoint (no authentication required):**

   ```bash
   curl http://localhost:8080/api/public
   ```

   **User endpoint (requires authentication):**

   ```bash
   curl -u user:user123 http://localhost:8080/api/user
   ```

   **Admin endpoint (requires admin role):**

   ```bash
   curl -u admin:admin123 http://localhost:8080/api/admin
   ```

   **Try forbidden access (user trying to access admin endpoint):**

   ```bash
   curl -u user:user123 http://localhost:8080/api/admin
   # Returns 403 Forbidden
   ```

---

## 👥 User Roles

The system defines multiple users with different access rights:

| Username | Password   | Role         |
| -------- | ---------- | ------------ |
| `admin`  | `admin123` | `ROLE_ADMIN` |
| `user`   | `user123`  | `ROLE_USER`  |

---

## 🔐 Role-Based Access Control

Example access rules:

- `/api/public` – Accessible to everyone (no authentication required)
- `/api/user` – Requires `ROLE_USER` or higher
- `/api/admin` – Requires `ROLE_ADMIN`

These are configured using Spring Security's role-based annotations or HTTP security configuration.

---

## 🛡️ Security Tactics Demonstrated

- **Authentication**: Verifying user identity using HTTP Basic Authentication with username/password
- **Authorization**: Controlling access based on user roles using Spring Security's RBAC
- **Role-Based Access Control (RBAC)**: Different endpoints require different role levels
- **Password Encoding**: User passwords are securely encoded using BCrypt

## 🔍 API Endpoints

| Endpoint | Authentication Required | Authorized Roles | Description |
|----------|------------------------|------------------|-------------|
| `GET /api/public` | ❌ No | Everyone | Public information accessible to all |
| `GET /api/user` | ✅ Yes | USER, ADMIN | User-level protected resources |
| `GET /api/admin` | ✅ Yes | ADMIN only | Admin-only protected resources |
| `GET /api/status` | ✅ Yes | USER, ADMIN | Authentication status information |

## 🧪 Testing

Run the test suite to verify authentication and authorization:

```bash
mvn test
```

The tests verify:

- Public endpoints are accessible without authentication
- Protected endpoints require valid credentials
- Role-based access control works correctly
- Admin endpoints reject non-admin users

## 📚 References

- [Spring Security Docs](https://docs.spring.io/spring-security/site/docs/current/reference/html5/)
- [Spring Initializr](https://start.spring.io)
