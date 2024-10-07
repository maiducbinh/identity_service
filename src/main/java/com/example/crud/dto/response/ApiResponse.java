package com.example.crud.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
// Include non-null fields in json response
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse <T>{
    int code = 1000; // if success
    String message;
    T result;
}
