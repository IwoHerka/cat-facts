(ns cat-facts.core.use-cases
  (:require [cat-facts.core.entity :as e]))

(defn print-cat-fact [fact-provider fact-presenter]
  (let [fact (e/get-fact fact-provider)]
    (e/present-fact fact-presenter fact)))

(defn save-cat-fact [fact-provider fact-writer path]
  (let [fact (e/get-fact fact-provider)]
    (e/save-fact fact-writer path fact)))
