package com.ordnas.redirectUrlShortener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OriginalUrlData {
    private String originalUrl;
    private long expirationTime;
}
