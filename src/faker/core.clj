(ns faker.core
  (:use [compojure.core]
        [compojure.response]
        [ring.adapter.jetty])
  (:require [compojure.handler :as handler]
            [ring.util.response :as resp])
  (:gen-class))

(defroutes base)

(defn convert-conf
  [l]
  (reduce (fn [b r]
            (let [{:keys [verb path res code]} r
                  f-res (-> res
                            (render nil)
                            (resp/status code))]
              (routes b (case verb
                          :get (GET path [] f-res)
                          :put (PUT path [] f-res)
                          :post (POST path [] f-res)
                          :delete (DELETE path [] f-res)
                          :any (ANY path [] f-res))))) base l))

(defn -main
  "I don't do a whole lot."
  [filename & args]
  (let [settings (read-string (slurp filename))
        main-routes (convert-conf settings)
        app (handler/site main-routes)]
    (run-jetty app {:port 8080})))
