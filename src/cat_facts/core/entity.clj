(ns cat-facts.core.entity)

(defprotocol CatFactProvider
  (-get-fact [this] "Get a random cat fact"))

(defprotocol Presenter
  (-present-fact [this fact] "Present a piece of information"))

(defprotocol Writer
  (-save [this path fact] "Save fact to persistent storage"))

(defn get-fact [provider] (-get-fact provider))
(defn present-fact [presenter fact] (-present-fact presenter fact))
(defn save-fact [writer path fact] (-save writer path fact))
