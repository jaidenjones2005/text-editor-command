# Phase 1 - The Foundation

The EditorApp is decoupled from TextEditor because it does not directly
perform or control the text changes. Instead, it receives a Command object
and calls execute(). The InsertCommand is responsible for communicating
with the TextEditor and performing the actual insertion.

If EditorApp called editor.insertText() directly, it would become more
dependent on the TextEditor implementation. As more actions are added,
such as deleting or replacing text, EditorApp would need more logic and
would become harder to maintain. Using commands keeps those operations
separate and makes it easier to add new ones.
