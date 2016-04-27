(ns plutocrat-clojure.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [plutocrat-clojure.handler :refer :all]
            [clojure.data.json :as json]))

(deftest test-app
  (testing "user creation"
    (let [params   {"email"                 "test@example.com"
                    "password"              "new_password"
                    "password_confirmation" "new_password"
                    "display_name"          "Name"}
          response (app (mock/request :post "/api/v1/users" params))]
      (is (= (get response :status) 201))
      (is (= (get-in response [:headers "Content-Type"]) "application/json; charset=utf-8"))
      (is (= (json/read-str (get response :body)) params)))))
