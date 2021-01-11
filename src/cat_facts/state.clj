(ns cat-facts.state
  (:require [mount.core :refer [defstate]]
            [cat-facts.delivery.api :refer [make-provider]]
            [cat-facts.delivery.cmd :refer [make-presenter]]
            [cat-facts.delivery.file :refer [make-writer]]
            [cat-facts.core.use-cases :as uc]))

(defstate fact-provider :start (make-provider))
(defstate fact-presenter :start (make-presenter))
(defstate fact-writer :start (make-writer))
(defstate print-cat-fact :start (partial uc/print-cat-fact
                                         fact-provider
                                         fact-presenter))
(defstate save-cat-fact :start (partial uc/save-cat-fact
                                        fact-provider
                                        fact-writer))

