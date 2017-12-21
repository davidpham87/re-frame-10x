(ns day8.re-frame.trace.common-styles
  (:require [garden.units :refer [px em]]))

(def background-blue "#e7f1ff")
(def background-gray "#a8a8a8")
(def background-gray-hint "#fafafa")
(def dark-green "#008766")
(def dark-gold "#A66900")
(def dark-purple "#762cff")
(def dark-blue "#284694")
(def dark-gray "gray")
(def dark-skyblue "#007CC2")
(def medium-gray "#999")
(def light-purple "#616cdb")
(def light-blue "lightblue")
(def light-gray "#efeef1")
(def yellow "yellow")
(def text-color "#222")
(def text-color-muted "#8f8f8f")

(def event-color dark-gold)
(def subs-color dark-purple)
(def render-color dark-skyblue)

;; Golden section, base 50
(def gs-5 (px 5))
(def gs-7 (px 7))
(def gs-12 (px 12))
(def gs-19 (px 19))
(def gs-31 (px 31))
(def gs-50 (px 50))
(def gs-81 (px 81))
(def gs-131 (px 131))

;; TODO: figure out how to cast gs-* into strings, rather than manually making them here.
(def gs-5s "5px")
(def gs-7s "7px")
(def gs-12s "12px")
(def gs-19s "19px")
(def gs-31s "31px")
(def gs-50s "50px")
(def gs-81s "81px")
(def gs-131s "131px")




;; The colors defined below are (of course) available to your app without further ado
;;
;; However...
;;
;; To get access to the styles, your code needs to add the following requires:
;;
;;     [day8.apps-lib.ux.blue-modern :as bm]
;;     [day8.apps-lib.ux.stylesheet  :as stylesheet]
;;
;; And the following line to the `mount-gui` function:
;;
;;     (stylesheet/inject-garden-stylesheet! bm/blue-modern "blue-modern")
;;
;; Then to use the styles, simply add the corresponding names to the `:class` arg of your components:
;;
;;     [rc/box
;;       :class "standard-background"
;;       :child [rc/button
;;                :class "strong-button"
;;                :label "Add"]]


;; =================================================================================================
;;   Blue modern component colours
;; =================================================================================================

(def blue-modern-color "#6EC0E6")  ;; Our standard rich blue colour

(def white-background-color "white")
(def white-background-border-color "#E3E9ED")      ;; Light grey

(def standard-background-color "#F3F6F7")      ;; Light grey
(def standard-background-border-color "transparent")

(def light-background-color "#FBFBFB")      ;; Medium grey
(def light-background-border-color "#BFCCD6")      ;; Slightly darker than medium grey

(def dark-background-color "#768895")      ;; Darker grey
(def dark-background-border-color white-background-border-color)

(def border-line-color "#DCE3E8")      ;; Slightly darker than light grey
(def table-row-line-color "#EAEEF1")      ;; Light grey

(def text-title-color "#3C454B")      ;; Darker grey than the standard text color
(def default-text-color "#767A7C")      ;; Medium grey

;(def disabled-text-color                    "TBA???")       ;; Placeholder (currently not specified)
(def disabled-background-color "#ECEDF0")      ;; Light grey
(def disabled-border-color border-line-color)

(def strong-button-text-color "white")
(def strong-button-background-color blue-modern-color)
(def strong-button-border-color "#589AB8")      ;; A darker version of the standard blue

(def muted-button-text-color strong-button-background-color)
(def muted-button-background-color "white")
(def muted-button-border-color white-background-border-color)

(def hyperlink-text-color strong-button-background-color)

(def tab-underline-color strong-button-background-color)

(def sidebar-background-color "#32323C")      ;; Dark black
(def sidebar-heading-divider-color "#191919")      ;; Darker black
(def sidebar-item-selected-color "#3C3C45")      ;; Slightly lighter dark black
(def sidebar-item-check-color strong-button-background-color)
(def sidebar-text-color "white")

(def wizard-panel-background-color "#636A6F")      ;; Very dark grey
(def wizard-panel-text-color "white")
(def wizard-nav-button-background-color "white")
(def wizard-nav-button-text-color "#303234")      ;; Almost black (also used for button arrows)
(def wizard-cancel-button-background-color "#D6D8D9")      ;; Light grey
(def wizard-step-past-color "#E8FFC1")      ;; Muted lime green
(def wizard-step-current-color "#C7FF66")      ;; Bright lime green
(def wizard-step-future-color dark-background-color)

(def font-stack ["\"Segoe UI\"" "Roboto", "Helvetica", "sans-serif"])

;; =================================================================================================
;;   Blue modern component styles (in garden format)
;; =================================================================================================

(def blue-modern

  [;; ========== Specific blue-modern styles (must be added to :class arg)
   :#--re-frame-trace--
   [:.bm-white-background {:background-color white-background-color
                           :border           (str "1px solid " white-background-border-color)}]
   [:.bm-standard-background {:background-color standard-background-color
                              :border           (str "1px solid " standard-background-border-color)}]
   [:.bm-light-background {:background-color light-background-color
                           :border           (str "1px solid " light-background-border-color)}]
   [:.bm-dark-background {:background-color dark-background-color
                          :border           (str "1px solid " dark-background-border-color)}]

   [:.bm-title-text {:font-size           "26px"
                     :color               text-title-color
                     :-webkit-user-select "none"
                     :cursor              "default"}]
   [:.bm-heading-text {:font-size           "19px"
                       :font-weight "600"
                       :color               default-text-color
                       :-webkit-user-select "none"
                       :cursor              "default"}]
   [:.bm-body-text {:color default-text-color}]
   [:.bm-textbox-label {:font-variant        "small-caps"
                        :color               default-text-color
                        :-webkit-user-select "none"
                        :cursor              "default"}]

   [:.bm-strong-button {:color            strong-button-text-color
                        :background-color strong-button-background-color
                        :border           (str "1px solid " strong-button-border-color)}]
   [:.bm-muted-button {:color            muted-button-text-color
                       :background-color muted-button-background-color
                       :border           (str "1px solid " strong-button-border-color)}]

   [:.bm-disabled-button {;:color            disabled-text-color (not yet defined)
                          :background-color disabled-background-color
                          :border           (str "1px solid " strong-button-border-color)}]

   [:.bm-popover-content-wrapper
    [:>
     [:.popover
      [:>
       [:.popover-arrow
        [:polyline {:fill (str standard-background-color " !important")}]]]]]]
   ;; TODO: When there is a title section, the top left and right radius can be seen
   [:.bm-popover-content-wrapper
    [:>
     [:.popover
      [:>
       [:.popover-content {:background-color standard-background-color
                           :border-radius    "6px"}]]]]]

   ;; ========== General overrides to convert re-com/bootstrap components to blue modern automatically

   ;; Default text color overrides
   [:body {:color default-text-color}]
   [:.form-control {:color default-text-color}]
   [:.btn-default {:color default-text-color}]
   [:.raptor-editable-block {:color default-text-color}]

   ;; button components - to 26px high
   [:button {:height "26px"}]
   [:.btn {:padding "0px 12px"}]

   ;; input-text - set to 26px high
   [:.rc-input-text
    [:input {:height "26px"}]]

   ;; input-time - set to 26px high
   [:.rc-input-time {:height "26px"}]

   ;; hyperlink components - set color
   [:a.rc-hyperlink
    :a.rc-hyperlink-href {:color hyperlink-text-color}]

   ;; title - set color
   [:.rc-title {:color               default-text-color
                :cursor              "default"
                :-webkit-user-select "none"}]

   ;; single-dropdown - 26px high (and color it)
   [:.chosen-container-single
    [:.chosen-single {:height      "26px"
                      :line-height "24px"}]]
   [:.chosen-container-single
    [:.chosen-single
     [:div {:top "-4px"}]]]
   [:.rc-dropdown {:align-self "initial !important"}]
   [:.chosen-container-single
    [:.chosen-default {:color default-text-color}]]
   [:.chosen-container
    [:.chosen-results {:color default-text-color}]]

   ;; selection-list - set background color of container
   [:.rc-selection-list {:background-color "white"}] ;

   ;; datepicker-dropdowns - set to 26px high
   [:.dropdown-button {:height "26px"}]
   [:.dropdown-button
    [:.zmdi-apps {:font-size "19px !important"}]]
   [:.form-control.dropdown-button {:padding "3px 12px"}]

   ;; rc-tabs - color
   [:.nav-tabs
    [:>
     [:li.active
      [:>
       [:a {:color default-text-color}
        [:&:hover {:color default-text-color}]]]]]]
   [:.btn-default
    [:&:hover :&:focus :&:active {:color default-text-color}]]
   [:.btn-default.active {:color default-text-color}]
   [:.open
    [:>
     [:.dropdown-toggle.btn-default {:color default-text-color}]]]
   ])
