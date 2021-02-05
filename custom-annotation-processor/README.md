# README

This project is intended to include a few custom annotations and corresponding annotation processors.
This is initially for educational purposes (so I can learn and get familiar with annotation processing) but this may have value
for use in other projects.

Initially this includes an `@Immutable` annotation used to indicate that a Java class is immutable and can be safely assumed to not change state.
The rules for immutability come from Effective Java 3rd edition (item 17).

I may add additional annotation types (and processors) to this project in the future.


## Steps for building/running

1. First build the annotations and annotation processor code (all found under the "annotation" package):

   ```
   javac -cp . -proc:none com/github/cvanderw/annotation/**/*.java
   ```
   Note the use of `-proc:none` to indicate that annotation processing should be skipped (and only compilation should be performed).

1. Then build the application code that makes use of the annotation:

   ```
   javac -cp . com/github/cvanderw/app/*.java
   ```
   This will perform the annotation processing on the code under the "app" package that uses the annotations and should be compiled/processed for correctness.

1. Finally, run the simple example program:

   ```
   java com.github.cvanderw.app.Main
   ```

## Possible TODOs / Future work

* Make building simpler. For example, integrate with Gradle, instead of relying on primitive `javac` commands.
* Make the @Immutable annotation processor more robust: handle more checks for immutability.
* Add tests.
* Add additional annotation types and processors.
