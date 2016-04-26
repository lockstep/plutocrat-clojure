(defproject plutocrat-clojure "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.4.0"]
                 [ring/ring-json "0.4.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler plutocrat-clojure.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
