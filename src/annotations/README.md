# Custom annotation

In this demo sub-project we are trying to understand how 
custom annotations work. 

@Target(ElementType.TYPE) -> Applicable on classes
@Target(ElementType.METHOD) -> Applicable on methods
@Target(ElementType.FIELD) -> Applicable on fields

We use reflection apis for analysing the annotations, reading the properties
and design our code
