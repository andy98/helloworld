(defproject helloworld "0.0.1"
  :description "my first heroku clojure app"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-jetty-adapter "1.2.0-RC1"]]
  :uberjar-name "helloworld-standalone.jar"
  :min-lein-version "2.0.0")
