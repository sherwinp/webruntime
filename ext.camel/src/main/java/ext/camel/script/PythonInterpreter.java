package ext.camel.script;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import ext.camel.rest.User;
import jep.Jep;
import jep.JepConfig;
import jep.JepException;

public final class PythonInterpreter {

	public PythonInterpreter(){

	}

	public void runScript(String id){

		File script = new File("/home/sherwinp/workspace/ext.camel/src/main/python/main.py");
		try {
			runScript(script);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void runScript(File script) throws JepException, InterruptedException {
		try(Interpreter interpreter = new Interpreter()){
			interpreter.runScript(script.getPath());
		}
	}
	class Interpreter extends Jep{
		Interpreter() throws JepException{
			super(new JepConfig().setClassLoader(Thread.currentThread().getContextClassLoader()), false);
		}
	}

}