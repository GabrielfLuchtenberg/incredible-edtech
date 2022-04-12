(ns incredible-edtech.core
  (:require [integrant.core :as ig]
            [ring.adapter.jetty :as ring]
            [ring.util.response :as r])
  (:import [org.eclipse.jetty.server Server]))

(defmethod ig/init-key :ed/app [_ opts]
  (fn [_]
    (r/response (str "Hello " (:name opts)))))

(defmethod ig/init-key :server/jetty [_ {:keys [handler port]}]
  (ring/run-jetty handler {:port port
                           :join? false}))

(defmethod ig/halt-key! :server/jetty [_ ^Server server]
  (.stop server))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
