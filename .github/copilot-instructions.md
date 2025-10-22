# GitHub Copilot Instructions

## Premortem Analysis

Other than the general analysis, add a section that performs a premortem analysis by considering:

### Breaking Changes Checklist
1. **API Contracts**: Will this change break existing function signatures, return types, or expected behaviors?
2. **Dependencies**: Could this affect downstream code that depends on this module/function?
3. **Database/State**: Will this change require migrations or affect existing data structures?
4. **Configuration**: Does this modify environment variables, config files, or deployment settings?
5. **Third-party Integrations**: Will external services or APIs be affected?
6. **Backwards Compatibility**: Can existing code continue to work with this change?

### Risk Assessment
When suggesting changes, proactively identify:
- **High Risk**: Changes to core business logic, authentication, data persistence
- **Medium Risk**: Refactoring shared utilities, modifying interfaces, updating dependencies
- **Low Risk**: Internal implementation details, adding new features without touching existing code

### Required Actions
- **Flag potential breakages** before implementing
- **Suggest migration paths** for breaking changes
- **Recommend tests** to verify nothing breaks
- **Identify affected files/modules** that may need updates
- **Propose rollback strategies** for risky changes

### Example Response Format
```
⚠️ PREMORTEM ANALYSIS:
- This change modifies the User.authenticate() return type
- BREAKING: Existing code expects boolean, now returns object
- AFFECTED: login.js, auth-middleware.js, user-service.js
- MITIGATION: Add wrapper function for backwards compatibility
- TESTS NEEDED: Integration tests for all auth flows
```

## General Guidelines
- Assume I want to know about risks before implementing
- Be explicit about what might break
- Suggest safer alternatives when high-risk changes are proposed
- Always consider the blast radius of changes