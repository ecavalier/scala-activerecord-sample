$(function() {
  $(".datetimepicker").each(function() {
    var self = $(this);
    var picker = self.datetimepicker({
      format: "yyyy-mm-dd HH:ii P",
      autoclose: true,
      todayBtn: true,
      linkField: self.data("name"),
      linkFormat: "yyyy-mm-ddThh:ii:00.000Z",
      language: self.data("lang")
    });
    var value = self.data("value");
    if (value != null && value != "") {
      picker.datetimepicker("_setDate", new Date(value));
    }
  });
});
