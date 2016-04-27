(ns plutocrat-clojure.handler
  (:require [compojure.core :refer :all]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]
            [ring.middleware.json :refer [wrap-json-response]]
            [ring.util.response :refer [created]]))

(defroutes app-routes
  (POST "/api/v1/users" {params :params}
        (created "/api/v1/users/FIXME" params)))

(def app
  (-> app-routes
      wrap-json-response
      (wrap-defaults api-defaults)))
