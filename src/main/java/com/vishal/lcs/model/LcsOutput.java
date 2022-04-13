package com.vishal.lcs.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString

@Document(collection = "LcsCollection")
public class LcsOutput
{
    @NotEmpty(message = "String can not be Empty")
    private String Answer;
}