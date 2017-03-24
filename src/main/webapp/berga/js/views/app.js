// questo coso con define si chiama AMD
// è utile perchè:

// define(
// module_id /*optional*/,
//    [dependencies] /*optional*/,
//    definition function /*function for instantiating the module or object*/
//);

define([
  'jquery',
  'underscore', 
  'backbone',
  'views/banana'
 //,'text!templates/stats.html'
  ], function($, _, Backbone, TodoView, statsTemplate){
  var AppView = Backbone.View.extend({

      // Instead of generating a new element, bind to the existing skeleton of
      // the App already present in the HTML.
      el: $('#bananapp'),

      events: {
        "click #create-banana": "newBanana"
      },

      initialize: function () {
          alert("init");

      },


      newBanana: function(e) {
        alert("newBAnana");
      }
  });
  return AppView;
});
