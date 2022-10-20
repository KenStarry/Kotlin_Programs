## Apply Function

The three attributes of `T.apply` are as follows:

1. It is an extension function.
2. It sends `this` as it's argument.
3. It returns `this` (i.e itself)


### Normal Approach

```Kotlin
    val intent = new Intent(this, SecondActivity::class.java)
    
    intent.putExtra("NAME", "John")
    intent.putExtra("AGE", 19)
    intent.putExtra("COUNTRY", "Kenya")
```

### Improved Approach
```Kotlin
    new Intent(this, SecondActivity::class.java).apply {
        putExtra("NAME", "John")
        putExtra("AGE", 19)
        putExtra("COUNTRY", "Kenya")
    }   
```