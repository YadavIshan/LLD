# Example 4: Single Responsibility Principle (SRP) in React

This example demonstrates how to refactor a monolithic React component into a modular architecture following SRP.

## Architecture Diagram

![Architecture Diagram](architecture_diagram.png)

## Mermaid Code (for reference)

```mermaid
graph TD
    subgraph Presentation_Layer [Presentation Layer]
        UI[UserProfile.js]
    end

    subgraph Logic_Layer [Logic Layer]
        Hook[useUser.js]
    end

    subgraph Data_Layer [Data Layer]
        Service[UserService.js]
        BackEnd[BackEnd API]
    end

    UI -- 1. Request Data --> Hook
    Hook -- 2. trigger fetch --> Service
    Service -- 3. GET /api/user --> BackEnd
    BackEnd -. 4. JSON Data .- > Service
    Service -. 5. Returns Data .-> Hook
    Hook -. 6. Updates State .-> UI
```

## Component Roles

1.  **`UserProfile.js` (Presentation)**:
    *   **Responsibility**: Renders the UI.
    *   **SRP**: Changes only if visual design changes.

2.  **`useUser.js` (Logic)**:
    *   **Responsibility**: Manages State (`loading`, `error`, `user`) and Side Effects.
    *   **SRP**: Changes only if state management logic changes.

3.  **`UserService.js` (Data)**:
    *   **Responsibility**: Performs the actual network requests.
    *   **SRP**: Changes only if API endpoints or networking libraries change.
