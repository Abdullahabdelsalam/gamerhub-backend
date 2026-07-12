## GAMERHUB: PROJECT PLANNING

### Status
Project planning document — Approved ✅

### Purpose
Establish a solid foundation before development begins to avoid chaos and ensure scalability, maintainability, and security.

---

## 1. Business Analysis & Actors

### System Goals
- Register a new user and log in
- Log in using Google
- Create and manage teams
- Create and join tournaments
- Edit user profiles
- Enable social interaction (follow players)

### Actors
- **User**
  - Register / Login / Google login
  - Create or join a team
  - Create or join a tournament
  - Edit profile
- **Moderator**
  - Suspend users
  - Delete teams and tournaments
- **Admin**
  - Manage users and roles
  - View analytics and delete content

### Note
- **Actor**: any external entity interacting with the system (human or external service such as Google OAuth).
- **User**: a specific actor representing a human system user.

---

## 2. Requirements

### Functional Requirements
- Authentication
  - Register
  - Login
  - Logout
  - Reset password
  - Google OAuth2
  - Refresh token
- Team module
  - Create team
  - Update team
  - Delete team
  - Join team
  - Leave team
- Tournament module
  - Create tournament
  - Join tournament
  - Delete tournament
  - View tournaments
- Profile
  - View profile
  - Update profile
  - Upload avatar

### Non-Functional Requirements
- Security: password hashing with BCrypt
- Scalability: support 10,000+ concurrent users
- Availability: 99.9% uptime
- Performance: login response time under 300ms
- Maintainability: layered architecture, DTOs, MapStruct, global exception handling

---

## 3. Architecture & Project Structure

### Architecture Choice
- Modular monolithic architecture
- Why: faster development, easier testing, and easier future scalability

### System Layers
- Presentation layer: Controllers
- Business layer: Services
- Persistence layer: Repositories
- Database

### Why use a Service Layer?
- Encapsulates business logic
- Manages transactions
- Performs input validation
- Enforces authorization
- Handles external service integration and caching

### Proposed Project Structure
- `config`
- `security`
  - `jwt`
  - `oauth2`
- `controller`
- `service`
  - `impl`
- `repository`
- `entity`
- `dto`
- `mapper`
- `exception`
- `validation`
- `util` / `constant`

### Why use DTOs?
- Prevent sensitive data leakage
- Separate presentation from persistence
- Reduce payload size

---

## 4. Security Design

### Authentication
- JWT-based stateless authentication

### Token Management
- Access token for operations
- Refresh token for session renewal

### Social Login
- Google OAuth2 integration

### Authorization
- RBAC: role-based access control

### Roles
- `ROLE_USER`
  - `READ_PROFILE`
  - `CREATE_TEAM`
  - `JOIN_TEAM`
- `ROLE_MODERATOR`
  - `DELETE_TEAM`
  - `BAN_USER`
- `ROLE_ADMIN`
  - `MANAGE_USERS`
  - `MANAGE_ROLES`

---

## 5. Database Design

### Core Tables
- `USERS`
  - `id`, `username`, `email`, `password`, `provider`, `enabled`, `created_at`
- `ROLES`
  - `id`, `name`
- `USER_ROLES`
  - `user_id`, `role_id`
- `REFRESH_TOKEN`
  - `id`, `token`, `expiry_date`, `user_id`
- `TEAMS`
  - `id`, `name`, `description`, `owner_id`
- `TEAM_MEMBERS`
  - `team_id`, `user_id`
- `TOURNAMENTS`
  - `id`, `title`, `game_name`, `start_date`, `created_by`
- `TOURNAMENT_PLAYERS`
  - `tournament_id`, `user_id`

---

## 6. API Design

### Authentication
- `POST /api/v1/auth/register`
- `POST /api/v1/auth/login`
- `POST /api/v1/auth/refresh-token`
- `POST /api/v1/auth/logout`
- `POST /api/v1/auth/google`

### Users & Profile
- `GET /api/v1/users/me`
- `PUT /api/v1/users/me`
- `GET /api/v1/users/{id}`

### Teams
- `POST /api/v1/teams`
- `GET /api/v1/teams`
- `GET /api/v1/teams/{id}`
- `PUT /api/v1/teams/{id}`
- `DELETE /api/v1/teams/{id}`

### Tournaments
- `POST /api/v1/tournaments`
- `GET /api/v1/tournaments`
- `POST /api/v1/tournaments/{id}/join`

---

## 7. Development Roadmap

- **Phase 0**: Planning & design (DONE)
- **Phase 1**: Authentication & security foundation
- **Phase 2**: Authorization & middleware
- **Phase 3**: JWT integration & session management
- **Phase 4**: OAuth2 + business features
- **Phase 5**: Documentation, Docker, tests, deployment

---

---
                                  Role
                                   ▲
                                   │ ManyToMany
                                   │
                                   ▼
                                 User
      ┌─────────────┬──────────────┬───────────────┬──────────────┬──────────────┐
      │             │              │               │              │              │
      ▼             ▼              ▼               ▼              ▼              ▼
RefreshToken     Team(owner)   TournamentPlayer   Post        Notification    Follow
                      │               │             │
                      │               │             ├──────────────┐
                      ▼               │             ▼              ▼
                 TeamMember           │         Comment        PostLike
                      ▲               │             │
                      │               │             ▼
                     Team             │        CommentLike
                      │               │
                      ▼               ▼
                     Game ───────► Tournament
                                      │
                       ┌──────────────┴──────────────┐
                       ▼                             ▼
                TournamentTeam                    Match
                                                      │
                                                      ▼
                                              MatchParticipant
---
