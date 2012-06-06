(defproject faker "0.1.1"
  :description "Because sometimes you just gotta fake it"
  :url "http://github.com/jjcomer/faker"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "1.1.0"]
                 [ring/ring-core "1.1.0"]
                 [ring/ring-jetty-adapter "1.1.0"]]
  :main faker.core)
