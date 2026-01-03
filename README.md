# ProgII Educational Initiative

This repository supports students in **Design and Implementation of Information Systems** with practice material (mock exams, tracing exercises) and a workflow that mirrors real software development.

The educational initiative is built around **three principles**:

1. **Understand Java** (concepts → behavior → reasoning)
2. **Use Agentic AI (GitHub Copilot)** responsibly and effectively
3. **Handle Git/GitHub procedures** like a professional

---

## 1) Understand Java

The aim is not only to know syntax, but to predict execution precisely—especially in exam-style questions.

Core topics emphasized:
- Object-Oriented Programming (classes, objects, encapsulation)
- Inheritance + polymorphism (overriding, dynamic dispatch)
- Static vs instance state (shared vs per-object)
- Exception handling (try/catch and control flow)
- String manipulation and immutability (`substring`, `replace`, concatenation)
- Flow control and variable tracing (for/while loops, `continue`, counters)

Recommended study method:
- Trace variables step-by-step without running the code first.
- For each change, explain *which method executed* and *which field was accessed*.
- Re-check common pitfalls: off-by-one, integer parsing, shadowed fields, and static state.

---

## 2) Use Agentic AI (GitHub Copilot)

Copilot works best when you treat it as an assistant that can propose, refine, and verify—while you remain responsible for correctness.

Suggested “agentic” workflow:
- Provide **full context** (task, constraints, grading expectations).
- Ask for a **plan** before code changes.
- Request **deterministic outcomes** (final variable values, runtime behavior).
- Require **verification** (compile/run checks, Java version compatibility).
- Review results like an examiner: look for hidden assumptions (polymorphism, static state, exception paths).

Example prompts:
- “Create a Java tracing exercise with inheritance and overriding; ensure final values are deterministic.”
- “Explain which method is invoked at runtime and why (dynamic dispatch).”
- “Generate plausible distractors based on common student mistakes.”

Academic integrity note:
- Use AI to learn faster, not to replace understanding. In an exam, you must be able to justify each step.

---

## 3) Handle Git/GitHub procedures

This initiative also trains habits used in real teams: branching, committing, and reviewing changes.

Minimal workflow:
1. Clone the repository
2. Create a feature branch per task/exercise
3. Make small, focused commits
4. Push the branch
5. Open a Pull Request (PR) and review
6. Merge when correct

Command reference:
- `git clone <url>`
- `git status`
- `git checkout -b feature/mock-exam-1`
- `git add .`
- `git commit -m "Add mock exam #1"`
- `git push -u origin feature/mock-exam-1`

Good habits:
- Commit early/often, but keep commits meaningful.
- Use `git diff` and `git log` to understand changes.
- Don’t commit generated build artifacts unless required.

---

## Repository contents

- `Exam.java`: Exam-style Java program for tracing (polymorphism, static/instance state, exceptions, strings, loops)
- `Exam_Paper.md`: Formatted mock exam sheet based on `Exam.java`

---

## How to compile and run

From the repository root:

```bash
javac Exam.java
java Exam
```

If your installed `java` runtime is older than your `javac`, compile with a target release compatible with your runtime (example: Java 8):

```bash
javac --release 8 Exam.java
java Exam
```
