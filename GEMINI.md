# KotlinPlayground

A Kotlin JVM playground designed for learning Kotlin through a structured 15-day roadmap. This project serves as a sandbox for experimenting with Kotlin features and completing guided exercises.

## Project Overview

- **Language:** Kotlin
- **Build System:** Gradle (Kotlin DSL)
- **Target Platform:** JVM
- **Core Purpose:** Educational / Learning Playground
- **Primary Tooling:** Integrated with a custom `kotlin-tutor` skill for progress tracking and evaluation.

## Learning Roadmap (`tasks.md`)

The project follows a structured curriculum defined in `tasks.md`. Progress is tracked through status markers (✅, 🏗️, ⏳) and managed by the `kotlin-tutor` agent.

- **Current Progress:** Day 3 (Functions & Parameters)
- **Workflow:**
  1. Follow the topic in `tasks.md`.
  2. Implement examples and exercises in the corresponding file in `playground/src/main/java/com/w3wide/kotlin/playground/`.
  3. Run the code to verify.
  4. Use the `kotlin-tutor` skill (triggered by mentions of `@tasks.md` or progress updates) to evaluate and advance to the next chapter.

## Building and Running

### Run the Application
To execute the code (typically the `main` function in the current active exercise file or `Main.kt`):
```bash
./gradlew :playground:run
```

### Build the Project
To compile all modules and run checks:
```bash
./gradlew build
```

### Clean Build Artifacts
```bash
./gradlew clean
```

## Project Structure

- `playground/`: The main module containing all learning materials.
  - `src/main/java/com/w3wide/kotlin/playground/`: Contains Kotlin source files for each topic (e.g., `Variables.kt`, `ControlFlow.kt`, `Functions.kt`).
  - `build.gradle.kts`: Module-specific configuration.
- `tasks.md`: The central roadmap and task tracker for the learning journey.
- `gradle/`: Gradle wrapper and dependency management (`libs.versions.toml`).
- `.gemini/skills/kotlin-tutor/`: Contains the logic and instructions for the Kotlin Tutor agent.

## Development Conventions

- **Source Location:** New exercises or playground code should be added to `playground/src/main/java/com/w3wide/kotlin/playground/`.
- **Exercise Implementation:** Exercises within files are marked with `TODO` comments. Complete these and call them within the `main` function of that file.
- **Progress Updates:** Always update `tasks.md` after completing a section to keep the tutor agent informed of your progress.
