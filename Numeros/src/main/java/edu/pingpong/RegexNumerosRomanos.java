package edu.pingpong;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RegexNumerosRomanos {


    private Map<String, String> regexDiccionario = new HashMap<String, String>();

    public void addRegex(String key, String value){
        this.regexDiccionario.put(key, value);
    }

    public Map<String, String> getRegexDiccionario() {
        return regexDiccionario;
    }

    public String getValorRegex(String key){
        return this.regexDiccionario.get(key);
    }

    public Collection<String> getValores(){
        return this.regexDiccionario.values();
    }

    public long longitud(){
        return this.regexDiccionario.size();
    }




}
