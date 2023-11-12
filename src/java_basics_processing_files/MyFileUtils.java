package java_basics_processing_files;

import java_basics_exceptions.FooRuntimeException;

public class MyFileUtils {

	public int subtract10FromLagerNumber(int number) throws FooRuntimeException {
		if(number < 10) {
			throw new FooRuntimeException("Number is less then 10");
		}
		return number - 10;
	}

}
