# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library of ros controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin diff_drive_controller effort_controllers force_torque_sensor_controller forward_command_controller gripper_action_controller imu_sensor_controller joint_state_controller joint_trajectory_controller position_controllers rqt_joint_trajectory_controller velocity_controllers"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/ros_controllers/0.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "70933d87aa68a656680ea7c31f1f8ca5"
SRC_URI[sha256sum] = "eb690937c60733b242ed0803a5953bc12d9bd6966bf299f8ff8b057f12ee0c85"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
