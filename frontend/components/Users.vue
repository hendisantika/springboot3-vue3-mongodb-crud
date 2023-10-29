<template>
  <div class="container">
    <h3>All Users</h3>
    <div v-if="message" class="alert alert-success">{{ this.message }}</div>
    <div class="container">
      <table class="table">
        <thead>
        <tr>

          <th>First Name</th>
          <th>Last Name</th>
          <th>Email Id</th>
          <th>Update</th>
          <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="user in users" v-bind:key="user.id">

          <td>{{ user.firstName }}</td>
          <td>{{ user.lastName }}</td>
          <td>{{ user.emailId }}</td>
          <td>
            <button class="btn btn-warning" v-on:click="updateUser(user.id)">
              Update
            </button>
          </td>
          <td>
            <button class="btn btn-danger" v-on:click="deleteUser(user.id)">
              Delete
            </button>
          </td>
        </tr>
        </tbody>
      </table>
      <div class="row">
        <button class="btn btn-success" v-on:click="addUser()">Add</button>
      </div>
    </div>
  </div>
</template>
