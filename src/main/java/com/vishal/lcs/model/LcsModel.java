package com.vishal.lcs.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString

@Document(collection = "LcsCollection")
public class LcsModel
{
    private List<String> list;
    private String answer;
}