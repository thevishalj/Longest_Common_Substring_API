package com.vishal.lcs.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString

public class LcsInput
{
    @NotNull(message = "Set of Strings Can't be Empty")
    @Valid
    private List<String> list;
}