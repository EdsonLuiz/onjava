# Implementation hiding
[back](../../../../../../README.md)

## Interface and Implementation
Access control or **implementation hiding**. Wrapping data and methods within classes in combination with **implementation hiding** is called **encapsulation**. The final result is a data type with characteristics and behaviors.  

Access control boundaries has two reasons:
1. Establish what client programmers can and cannot use.
2. Separate interface from implementation. If cliemt programmers only use  the public interface, you are free to change anything that is not public without breaking client code.  

Prefer a style of creating classes that puts the public members at the begining, followed by the protected, package-access, and private members. The user of class can then read down from the top and see first what's important to them, and stop reading when they encounter the nom-public members, wich are part of the internal implementation.
