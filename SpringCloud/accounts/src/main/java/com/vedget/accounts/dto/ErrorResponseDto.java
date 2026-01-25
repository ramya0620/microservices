package com.vedget.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@Schema(name="ErrorResponse",description = "Schema to hold Error response information")
public class ErrorResponseDto {
    @Schema(description = "API path invoked by client")
    private String apiPath;

    @Schema(description = "ErrorCode represents the error happened ")
    private HttpStatus errorCode;

    @Schema(description = "errorMsg represents the error happened")
    private String errorMsg;

    @Schema(description = "Time respresents when the error happened")
    private LocalDateTime errorTime;

}
