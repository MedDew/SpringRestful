/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfulllibrary.restfull.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mehdi
 */
@Getter
@Setter 
public class Greeting 
{
    private final long id;
    private final String content;
    
    public Greeting(long id, String content)
    {
        this.id = id;
        this.content = content;
    }
}
