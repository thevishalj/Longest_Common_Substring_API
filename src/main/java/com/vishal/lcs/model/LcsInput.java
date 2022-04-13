package com.vishal.lcs.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString

public class LcsInput
{
//    @NotNull(message = "List cannot be Null")
//    @Size(min = 1, message = "Minimum size should be 1")

    private List<String> list;
}