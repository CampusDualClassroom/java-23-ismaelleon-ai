package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> hashMap = new HashMap<>();
        hashMap.put("person",new Person("John", "Smith"));
        hashMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        hashMap.put("police", new PoliceOfficer("Jake", "Peralta","B-99"));
        hashMap.put("doctor",new Doctor("Gregory", "House","Nefrología e infectología"));
        return hashMap;

    }

    public static Person addMapValue(Map<String, Person> map,String key, Person value) {
        map.put(key,value);
        return value;//aqui se devuelve el ultimo valor añadido
    }

    public static void printMapValues(Map<String, Person> map) {
            //recorres el mapa
        for (Map.Entry<String, Person> entry: map.entrySet()) {
            System.out.println("Clave: " + entry.getKey());
            entry.getValue().getDetails();//llamo al getDetails para cada objeto
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Map<String, Person> hashMap = createHashMap();
        System.out.println("Mapa inicial");
        printMapValues(hashMap);

        addMapValue(hashMap,"police", new  PoliceOfficer("Charles", "Boyle", "B-99"));

        System.out.println("Mapa actualizado");
        printMapValues(hashMap);

    }
    
}
