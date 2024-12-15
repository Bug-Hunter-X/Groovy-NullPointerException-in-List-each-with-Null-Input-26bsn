```groovy
def myMethod(List<String> list) {
    list?.each { item ->
        println item?.toUpperCase() // Added safe navigation here as well
    }
}

myMethod(null)
myMethod(['apple', 'banana', 'cherry'])