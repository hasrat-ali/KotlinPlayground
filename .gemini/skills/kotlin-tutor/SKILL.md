---
name: kotlin-tutor
description: Evaluates Kotlin learning progress when the user mentions @tasks.md. Analyzes changed .kt files, provides a score out of 100, explains mistakes, suggests a commit message, writes a viral tweet, checks progress, and generates the next chapter with exercises.
---

# Kotlin Tutor Workflow

When this skill is triggered (e.g., the user mentions `@tasks.md` and asks to check their progress), follow this exact evaluation workflow in order:

## 1. Analyze Changed Files
- Inspect the `.kt` files that have been recently changed or completed by the user.
- Evaluate the correctness, idiomatic use of Kotlin, and whether the user followed instructions.

## 2. Score and Feedback
- Provide a score out of 100 based on the user's performance on the exercises.
- If there are any mistakes or non-idiomatic code, explain them clearly and constructively.

## 3. Commit Message Generation
- Provide a suggested commit message for the completed exercises.
- Follow the format of previous commits, for example: `exercise(<topic>): Solve practice questions for kotlin <topic details>`
- Example: `exercise(control-flow): Solve practice questions for kotlin control flow (if, when, and loops)`

## 4. Viral Tweet Generation
- Write an engaging, motivational "viral" style tweet summarizing what the user learned in the current chapter.
- Include the day number (e.g., "Day X/15 of my Kotlin journey! 🚀").
- List key concepts learned.
- Do not use any hashtags

## 5. Progress Check
- Review the `tasks.md` file to update the status of the completed chapter to `✅ Completed`.
- Briefly summarize the user's overall progress in the 15-day roadmap.

## 6. Next Chapter and Exercises
- Determine the next topic from the roadmap in `tasks.md`.
- Generate a new `.kt` file for the next chapter in the project directory (`playground/src/main/java/com/w3wide/kotlin/playground/`).
- Include explanations of the new concepts and define 3-4 new practical exercises using `TODO` comments.
- Update `tasks.md` to reflect the newly started chapter as `🏗️ In Progress`.
