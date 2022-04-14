package com.vishal.lcs.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
@Valid

@Document(collection = "LcsCollection")
public class LcsOutput
{
    @NotEmpty(message = "String cannot be Empty or Null")
    private String Value;
}