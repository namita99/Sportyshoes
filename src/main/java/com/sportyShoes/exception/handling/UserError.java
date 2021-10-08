package com.sportyShoes.exception.handling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;


@Data
@AllArgsConstructor(staticName = "of")
public class UserError<P,Q> {

    public P password;
    public Q username;
}