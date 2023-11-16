package java_basics_lambda_practice;

@FunctionalInterface
interface MyGenericInterface <T>{
    public T work(T t);
}
