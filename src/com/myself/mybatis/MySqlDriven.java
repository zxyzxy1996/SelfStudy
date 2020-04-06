package com.myself.mybatis;

import com.myself.mybatis.entity.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author RockerBaozi
 */
public class MySqlDriven {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(10);

        User user2 = new User();
        user2.setName("小郑");

        User user3 = new User();
        user3.setName("123132132@qq.com , 23131@qq.com , eqeqe@ll.com");

        String sql1 = query(user1);
        String sql2 = query(user2);
        String sql3 = query(user3);

        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);

    }

    public static String query(Object o) {
        StringBuilder stringBuilder = new StringBuilder();
        //1.获取到Class
        Class c = o.getClass();
        //2.获取到table的名字
        boolean exists = c.isAnnotationPresent(Table.class);
        if (!exists) {
            return null;
        }

        Table table = (Table) c.getAnnotation(Table.class);
        String tableName = table.value();
        stringBuilder.append("SELECT * FROM ").append(tableName).append(" WHERE 1 = 1");
        //3.遍历所有字段
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            //4.处理每个字段对应的SQL
            //4.1.拿到字段名
            boolean fExists = field.isAnnotationPresent(Column.class);
            if (fExists) {
                Column column = field.getAnnotation(Column.class);
                String columnValue = column.value();
                //4.2.拿到字段值
                String fieldName = field.getName();
                Object fieldValue = null;
                String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                try {
                    Method getMethod = c.getDeclaredMethod(getMethodName);
                    fieldValue = getMethod.invoke(o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //4.3.拼装SQL
                boolean isInteger = ((fieldValue == null) || fieldValue instanceof Integer && (Integer) fieldValue == 0);
                if (isInteger) {
                    continue;
                }
                stringBuilder.append(" and ").append(columnValue);
                if (fieldValue instanceof String) {
                    if (((String) fieldValue).contains(",")) {
                        String[] sArray = ((String) fieldValue).split(",");
                        stringBuilder.append(" in (");
                        for (String str : sArray) {
                            str = str.replaceAll(" ", "");
                            stringBuilder.append("'").append(str).append("',");
                        }
                        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                        stringBuilder.append(")");
                    } else {
                        stringBuilder.append(" = '").append(fieldValue).append("'");
                    }
                } else if (fieldValue instanceof Integer) {
                    stringBuilder.append(" = ").append(fieldValue);
                }
            }
        }
        return stringBuilder.toString();
    }
}
