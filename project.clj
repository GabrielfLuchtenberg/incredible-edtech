(defproject incredible-edtech "0.1.0-SNAPSHOT"
  :description "An edtech"
  :dependencies [[org.clojure/clojure "1.11.0"]
                 [ring/ring  "1.9.4"]
                 [integrant/integrant "0.8.0"]
                 [metosin/reitit "0.5.15"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "1.2.0"]
                                  [integrant/repl "0.3.2"]]
                   :source-paths ["dev"]}})
