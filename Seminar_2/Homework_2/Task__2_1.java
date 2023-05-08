// 1) Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import org.json.simple.JSONObject;

public class Task__2_1 {
    public static void main(String[] args) {

        // Создаем JSON-объект с параметрами фильтрации
        JSONObject filterParams = new JSONObject();
        filterParams.put("name", "Ivanov");
        filterParams.put("country", "Russia");
        filterParams.put("city", "Moscow");
        filterParams.put("age", null);

        // Создаем StringBuilder для построения WHERE-части SQL-запроса
        StringBuilder whereClause = new StringBuilder("select * from students where ");
        
        // Проходимся по всем параметрам фильтрации и добавляем их в WHERE-часть
        for (Object key : filterParams.keySet()) {
            Object value = filterParams.get(key);
            // Если значение не null, добавляем его в WHERE-часть
            if (value != null && !value.equals("null")) {
                if (whereClause.length() > 29) {
                    // Если уже есть один или несколько параметров в WHERE-части, добавляем AND перед новым параметром
                    whereClause.append(" and ");
                }
                // Добавляем параметр в WHERE-часть
                whereClause.append(key).append(" = '").append(value).append("'");
            }
        }
        // Выводим WHERE-часть SQL-запроса в консоль
        System.out.println(whereClause.toString());
    }
}

// CONSOLE:
// select * from students where country = 'Russia' and city = 'Moscow' and name = 'Ivanov'

