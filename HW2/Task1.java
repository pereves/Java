package Homework_Java.HW2;

import java.util.LinkedHashMap;
import java.util.Map;

class Task1 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name","Ivanov");
        map.put("country","Russia");
        map.put("city","Moscow");
        map.put("age",null);
        
        System.out.println(getCondition(map));
    }
    public static StringBuilder getCondition(Map<String, String> params) {
      StringBuilder stringBuilder = new StringBuilder();
      for (Map.Entry<String, String> entry : params.entrySet()) {
        if (entry.getValue() != null) {
          if (stringBuilder.toString().equals("")) {
            stringBuilder.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
          } else {
            stringBuilder.append(" and ").append(entry.getKey()).append(" = '")
                .append(entry.getValue()).append("'");
          }
        }
  
      }
      return stringBuilder;
    }
  }