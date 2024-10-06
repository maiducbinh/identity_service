Layered Architecture: API <=> Controller <=> Service <=> Repository <=> Entity

Using annotation based on classes' function for easily configuring.

@ControllerAdvice: relevant to exception management

Validation Normalization:
{
    code: " ",
    message: " ",
    ...
}

code = 1000 (default for creating a user successfully)
code for exception/required sizes of username & password 
