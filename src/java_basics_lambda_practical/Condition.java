package java_basics_lambda_practical;

@FunctionalInterface
public interface Condition<T> {
    public boolean test(T t);
}
