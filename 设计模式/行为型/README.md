# 行为型

 我们知道，创建型设计模式主要解决“对象的创建”问题，结构型设计模式主要解决“类或对象的组合或组装”问题，那行为型设计模式主要解决的就是**“类或对象之间的交互”**问题。 

## 总结

### 责任链（Chain of Responsibility）

多个处理器依次处理同一个请求。一个请求先经过 A 处理器处理，然后再把请求传递给 B 处理器，B 处理器处理完后再传递给 C 处理器，以此类推，形成一个链条。链条上的每个处理器各自承担各自的处理职责。

### 模板方法模式（Template Method）

定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算的结构即使重定义该算法的某些特定步骤。

换句话说，公用的处理逻辑放在父类中处理，不同的处理逻辑放在子类中

### 迭代器（Iterator）

提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示。常用于遍历一个集合对象

### 备忘录模式（Memento）

在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。多用于数据备份和恢复的场景。

### 状态模式（State）

当一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为时就可以考虑状态模式

### 观察者模式（Observer）

在对象之间定义一个一对多的依赖，当一个对象状态改变的时候，所有依赖的对象都会自动收到通知。将观察者和被观察者代码解耦。

### 命令模式 （Command）

将一个请求封装为一个对象，从而使得可以用不同的请求进行参数化，对请求排队或者记录请求日志以及支持可撤销的操作。

### 中介模式（Mediator）

中介模式定义了一个单独的（中介）对象，来封装一组对象之间的交互。将这组对象之间的交互委派给与中介对象交互，来避免对象之间的直接交互。

### 策略模式（Strategy）

策略模式会定义一系列算法，从概念上来看，所有这些算法完全的都是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法，减少了各种算法类与使用类之间的耦合。

### 解释器模式（Interpreter）

当有一个语言需要解释执行，并且你可以将该语言中的句子表示为一个抽象语法树时，可以使用解释器模式

### 访问者模式（Visitor）

访问者模式适用于数据结构相对稳定的系统，它把数据结构和作用域结构上的操作之间的耦合解脱开，使用操作集合可以相对自由地演化。

 
