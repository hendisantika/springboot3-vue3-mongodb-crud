<template>
  <div>
    <h3>User</h3>
    <div class="container">
      <form @submit="validateAndSubmit">
        <div v-if="errors.length">
          <div
              v-for="(error, index) in errors"
              v-bind:key="index"
              class="alert alert-danger"
          >
            {{ error }}
          </div>
        </div>
        <fieldset class="form-group">
          <label>First Name</label>
          <input v-model="firstName" class="form-control" type="text"/>
        </fieldset>
        <fieldset class="form-group">
          <label>Last Name</label>
          <input v-model="lastName" class="form-control" type="text"/>
        </fieldset>
        <fieldset class="form-group">
          <label>Email Id</label>
          <input v-model="emailId" class="form-control" type="text"/>
        </fieldset>
        <button class="btn btn-success" type="submit">Save</button>
      </form>
    </div>
  </div>
</template>
<script>
