package customAnnotation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

@SupportedAnnotationTypes("customAnnotation.Overload")
public class OverloadProcessor extends AbstractProcessor{

	@Override
	public boolean process(Set<? extends TypeElement> annotations,RoundEnvironment roundEnv) {
		
		System.out.println("Processing overload ...");
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		for(Element element : roundEnv.getElementsAnnotatedWith(Overload.class)){
            String signature = element.getSimpleName().toString();
            int count = map.containsKey(signature) ? map.get(signature) : 0;
            map.put(signature, ++count);
        }

        for(Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                processingEnv.getMessager().printMessage(Kind.ERROR, "The method which signature is " + entry.getKey() +  " has not been overloaded");
            }
        }
        return true;
	}
	
}
