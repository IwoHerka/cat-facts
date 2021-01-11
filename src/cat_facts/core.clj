(ns cat-facts.core
  (:gen-class)
  (:require [mount.core]
            [cat-facts.state :as s]))

(defn -main
  [& args]
  (mount.core/start)
  (if (= (first args) "-s")
    (s/save-cat-fact (second args))
    (s/print-cat-fact)))
