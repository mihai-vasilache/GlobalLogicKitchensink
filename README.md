# Modernization Factory - "kitchensink"

* the project can be run with a simple maven command ```mvn spring-boot:run```

Only the creation of the Member is migrated. 

I wanted to hilight the idea that a "green field" migration is a risky one. And a _"Strangler Fig"_ (https://martinfowler.com/bliki/StranglerFigApplication.html) pattern is more appropriate in the context of a large appplication. 

In this case I intended that the new application calls the old application for the unmigrated functionality related to the migrated one. Usually it is the other way around. First the legacy application is called, there is created a layer of mygration and some parts of the functionality are delegated to the new application.