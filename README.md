# faker

Just a quick little app which lets you fake a web response really
fast.
Right now it only supports the customization of the response code and the
response itself.

## Usage

Either run using:
```
lein run config_filename
```

or compile as an uberjar and run like so:
```
java -jar the_uberjar config_filename
```

faker will then create a server at: ```localhost:8080```

The following is a sample config file which defines two routes
``` clojure
[{:verb :get
  :path "/"
  :res "HELLO WORLD"
  :code 401}
 {:verb :get
  :path "/another"
  :res "ANOTHER ONE"
  :code 200}]
```

## License

Copyright © 2012 Josh Comer

Distributed under the Eclipse Public License, the same as Clojure.
