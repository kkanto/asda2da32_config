 
listView('asda2da32 Jobs') {
    description('asda2da32 Jobs')
    jobs {
        regex('asda2da32_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
