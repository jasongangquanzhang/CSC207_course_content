This code is an implementation of the code presented on
https://riptutorial.com/swing/example/14137/simple-mvp-example#example


Question: Is this currently consistent with Clean Architecture? Why or why not?

Answer: Currently the `Presenter` depends on the `View` directly!
We should instead have the `View` implement an interface, which the `Presenter` interacts with.