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

Using lombok for automatically creating getter and setter, constructor, ...: @Getter, @Setter, @Data (=> NoArgs/AllArgs)

Mapper: map a entity class to a corresponding class (fields with the same names) in request/response. without using constructor + setter

Returning userresponse instead of user

Using @RequiredArgsConstructor, @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true) instead of @Autowired