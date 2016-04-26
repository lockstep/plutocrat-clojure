(ns plutocrat-clojure.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.json :refer [wrap-json-response]]
            [ring.util.response :refer [response]]))

(defroutes app-routes)

(def app (wrap-json-response app-routes))
