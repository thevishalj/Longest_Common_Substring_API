package com.vishal.lcs.model;

import lombok.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@Valid
public class LcsInput
{
    @NotNull(message = "Set of Strings Can't be Null and Empty")         //Message is not printing
    private List<LcsOutput> list;
}