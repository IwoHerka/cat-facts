(ns cat-facts.delivery.file
  (:require [cat-facts.core.entity :as e]))

(defn- save-fact-to-file [path fact]
  (spit path fact))

(defrecord FileWriter []
  e/Writer
  (-save [_ path fact] (save-fact-to-file path fact)))

(defn make-writer []
  (->FileWriter))