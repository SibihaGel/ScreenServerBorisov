package org.employeeservice.screenserver;

/*
public class PeriodicalScoupeCofigurer  implements Scope {

   Map<String, Pair<LocalTime, Object>> map = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {

        if (map.containsKey(name)) {
            Pair<LocalTime, Object> pair = map.get(name);
           int secondsSinceLastRequest = now().getSecond() - pair.first.getSecond();
           if(secondsSinceLastRequest > 5) {
                map.put(name, new Pair(now(), objectFactory.getObject()));
            }
        }
        return null;
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
        */