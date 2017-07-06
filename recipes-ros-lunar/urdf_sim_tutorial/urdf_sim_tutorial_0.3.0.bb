# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin controller_manager diff_drive_controller gazebo_ros gazebo_ros_control joint_state_controller position_controllers robot_state_publisher rqt_robot_steering rviz urdf_tutorial xacro"
SRC_URI = "https://github.com/ros-gbp/urdf_tutorial-release/archive/release/lunar/urdf_sim_tutorial/0.3.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "35b10bdf66ccb407659fb80ed8733270"
SRC_URI[sha256sum] = "9d653b337bf8b16951985181b0306fcef93c13aae00709a90d0faa1285fff965"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
