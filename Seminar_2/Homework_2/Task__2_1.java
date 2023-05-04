// 1) Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import org.json.simple.JSONObject;

public class Task__2_1 {
    public static void main(String[] args) {

        JSONObject filterParams = new JSONObject();
        filterParams.put("name", "Ivanov");
        filterParams.put("country", "Russia");
        filterParams.put("city", "Moscow");
        filterParams.put("age", null);

        StringBuilder whereClause = new StringBuilder("select * from students where ");

        for (Object key : filterParams.keySet()) {
            Object value = filterParams.get(key);
            if (value != null && !value.equals("null")) {
                if (whereClause.length() > 29) {
                    whereClause.append(" and ");
                }
                whereClause.append(key).append(" = '").append(value).append("'");
            }
        }
        System.out.println(whereClause.toString());
    }
}

// CONSOLE:
// select * from students where country = 'Russia' and city = 'Moscow' and name = 'Ivanov'

