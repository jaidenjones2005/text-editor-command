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
# Phase 2 - Basic Undo

Having each Command object responsible for its own undo logic keeps the
EditorApp simple because EditorApp does not need to know how each action
should be reversed. It only needs to remember the last command and call
undo() on it.

This also makes the program easier to expand because different commands
can have different undo behavior without adding a lot of extra logic to
EditorApp.
# Phase 3 - Command History

A Stack is ideal for undo operations because it follows Last-In,
First-Out behavior. The most recent command is placed on top of the
stack, so it is also the first command removed when the user chooses
undo.

If a Queue was used instead, it would follow First-In, First-Out
behavior. This would undo the oldest command first instead of the most
recent command, which would not match how users expect an undo feature
to work.
