package lessonseven;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class TestClass {

    private SortedSet<Method> sortedSet = new TreeSet<>();

    public TestClass() {
        this.sortedSet = new TreeSet<>(new Comparator<Method>() {
            @Override
            public int compare (Method o1, Method o2) {
                int o1Priority;
                int o2Priority;

                if (o1.getAnnotation(org.testng.annotations.BeforeSuite.class) != null) {
                    o1Priority = 0;
                } else if (o1.getAnnotation(org.testng.annotations.AfterSuite.class) != null) {
                    o1Priority = 11;
                } else {
                    o1Priority = o1.getAnnotation(org.testng.annotations.Test.class).priority();
                }

                if (o2.getAnnotation(org.testng.annotations.BeforeSuite.class) != null) {
                    o2Priority = 0;
                } else if (o2.getAnnotation(org.testng.annotations.AfterSuite.class) != null) {
                    o2Priority = 11;
                } else {
                    o2Priority = o2.getAnnotation(org.testng.annotations.Test.class).priority();
                }
                return o1Priority == o2Priority ? 1 : o1Priority - o2Priority;
            }
        });
    }

    public void start (Class testClass) {
        int countBefore = 0;
        int countAfter = 0;
        for(Method method : testClass.getDeclaredMethods()) {
            if(method.getDeclaredAnnotation(org.testng.annotations.BeforeSuite.class) != null) {
                if(countBefore < 1) {
                    sortedSet.add(method);
                    countBefore++;
                } else {
                    throw new RuntimeException("Аннотацией BeforeSuite помечено несколько методов!");
                }
            }

            if(method.getDeclaredAnnotation(org.testng.annotations.AfterSuite.class) != null) {
                if(countAfter < 1) {
                    sortedSet.add(method);
                    countAfter++;
                } else {
                    throw new RuntimeException("Аннотацией AfterSuite помечено несколько методов!");
                }
            }

            if(method.getDeclaredAnnotation(org.testng.annotations.Test.class) != null) {
                int priority = method.getDeclaredAnnotation(org.testng.annotations.Test.class).priority();
                if(priority >= 1 && priority <= 10) {
                    sortedSet.add(method);
                } else {
                    throw new RuntimeException("Некорректный приоритет метода:" + method.getName());
                }
            }
        }

        for(Method method : sortedSet) {
            try {
                Object obj = testClass.newInstance();
                method.invoke(obj);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new TestClass().start(lessonseven.ExampleClass.class);
    }
}
