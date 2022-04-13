package com.vishal.lcs.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@ToString

@Document(collection = "LcsCollection")
public class LcsModel
{
//    @NotNull(message = "List cannot be Null")
//    @Size(min = 1, message = "Minimum size should be 1")

    private List<String> list;
    private String answer;
}