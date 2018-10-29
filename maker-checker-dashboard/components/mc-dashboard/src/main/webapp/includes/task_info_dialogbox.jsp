<!-- Bootstrap Modal -->
<div class="modal fade" id="taskInfoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <input type="hidden" id="taskInfoDialogTaskId"/>
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="taskInfoModalCenterTitle">Task Information</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>Hello body</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-info" id="approve-btn">Approve</button>
        <button type="button" class="btn btn-warning" id="reject-btn">Reject</button>
        <button type="button" class="btn btn-secondary">Release</button>
        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>

<script type="text/javascript">
    $("#approve-btn").on("click", e => {
      let taskId = $("#taskInfoDialogTaskId").val();
      $.ajax({
        url: "<%=tasksEndpoint%>/" +  taskId + "/approve",
        method: "post",
        success: function(response) {
          console.log(response);
        }
      });
    });

    $("#reject-btn").on("click", e => {
      let taskId = $("#taskInfoDialogTaskId").val();
      $.ajax({
        url: "<%=tasksEndpoint%>/" +  taskId + "/reject",
        method: "post",
        success: function(response) {
          console.log(response);
        }
      });
    });
</script>