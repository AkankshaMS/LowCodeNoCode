package com.annotation.processor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import javax.tools.Diagnostic.Kind;

import com.annotation.Setter;

@SupportedAnnotationTypes("com.annotation.Setter")
@SupportedSourceVersion(SourceVersion.RELEASE_11)

public class SetterProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		System.out.println("Processing overload ...");
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		for(Element element : roundEnv.getElementsAnnotatedWith(Setter.class)){
			

            String signature = element.getSimpleName().toString();
            int count = map.containsKey(signature) ? map.get(signature) : 0;
            map.put(signature, ++count);
        }
		/*
        for(Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                processingEnv.getMessager().printMessage(Kind.ERROR, "The method which signature is " 
                		+ entry.getKey() +  " has not been overloaded");
            }
        }
        */
        return true;
    }

 
}
