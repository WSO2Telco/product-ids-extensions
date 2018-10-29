<!-- Bootstrap Modal -->
<div class="modal fade" id="taskInfoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <input type="hidden" id="confirmDialogTaskId"/>
  <input type="hidden" id="confirmDialogCommand"/>
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="taskInfoModalCenterTitle">Confirm</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p id="confirmDialogContent"></p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-info" id="approve-btn">Yes</button>
        <button type="button" class="btn btn-danger" data-dismiss="modal">No</button>
      </div>
    </div>
  </div>
</div>

<script type="text/javascript">
  $("#approve-btn").on("click", e => {
    let taskId = $("#confirmDialogTaskId").val();
    let command = $("#confirmDialogCommand").val();  

    $.ajax({
      url: "<%=tasksEndpoint%>/" +  taskId + "/" + command,
      method: "post",
      success: function(response) {
        if (response) {
          console.log(response);
          let message = response.message;
          window.location = "index.jsp?errorMessage=" + message;
          $("#taskInfoModal").modal("hide");
        }
      }
      });     
  });
</script>