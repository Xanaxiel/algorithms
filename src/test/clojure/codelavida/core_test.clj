(ns codelavida.core-test
  (:require [clojure.test :refer :all])
  (:require [codelavida.core :refer [my-last]]))

(deftest my-last-test
  (is (= (my-last [1 2 3]) 3)))

(deftest my-last-empty-test
  (is (= (my-last []) nil)))

