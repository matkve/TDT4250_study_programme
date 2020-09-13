# TDT4250_study_programme
Repo structure:
Project folder is "tdt4250.study_program.model". "Src" folder within project folder contains generated code and handwritten code. "Model" folder contains ecore model, xmi model instance, and genmodel.

Ecore feature requirments:
- "study_program.ecore" model contains 6 classes.
- Ecore model defines 2 enums.
- Ecore model defines "CourseCode" data type. "Study_programFactoryImpl.java" contains "createCourseCodeFromString()" handwritten method.
- "Year" class contains the derived feature "yearNumber". The "getYearNumber()" method in "YearImpl.java" returns the sequence number of the year in the study program (e.g. "year #1").
- Ecore model has 2 handwritten constraints found in "Study_programValidator.java", and 5 OCL constraints.

Note:
There is a bug in the UML diagram of my model which makes the (opposite and containment) reference line from Year to Year not be displayed. These references are called "previousYear" and "nextYear" in the "Year" class.
