(ns user
  (:require [integrant.repl :as ig-repl]
            [integrant.repl.state :as state]
            [incredible-edtech.core :as core]
            [integrant.core :as ig]))

(ig-repl/set-prep!
  (fn [] (-> "dev/config.edn" slurp ig/read-string)))
(def start-dev ig-repl/go)
(def stop-dev ig-repl/halt)
(def restart-dev ig-repl/reset)
(def reset-all ig-repl/reset-all)

(def app (-> state/system :ed/app))

(defn uuid
  []
  (java.util.UUID/randomUUID))
nil
