# ProB intergration of Overture
This feature is *experimental* and **not** complete. It uses the ProB model checker to do model finding while the interpreter exexutes. This enables otherwise non executable VDM bodies of Functions and Operations to be interpreted.


# Development

To fun the test in the core prob must be present in `~/.prob`


# Compilation

To compile both the core and IDE plugins use the following:

```bash
mvn clean install -PWith-IDE
```


## Repository

Once compiled the plugin can be added to overture using this repository:

```
ide/repository/target/repository/
```

