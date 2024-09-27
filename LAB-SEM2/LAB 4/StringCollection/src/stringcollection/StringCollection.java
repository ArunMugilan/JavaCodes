/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcollection;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */

import java.util.ArrayList;
public class StringCollection {
private String str1;
private String str2;

ArrayList<String> objStringCollection = new ArrayList<String>();

public StringCollection (String str1, String str2){
    setStr1(str1);
    setStr2 (str2);
    objStringCollection.add(getStr1());
    objStringCollection.add(getStr2());
} 
public String getStr1(){
    return (this.str1);
}
public void setStr1(String str1){
    this.str1= str1;
}
public String getStr2(){
    return (this.str2);
}
public void setStr2(String str2){
    this.str2= str2;
}
public String toString(){
    String result = "";
    for (String s : objStringCollection){
        result += s + "";
    }
    return String.format("%s = %s\n", "Collection of ArrayList", result);
}
}
