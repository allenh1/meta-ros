# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The urdf_sim_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=1f5872747925c3b0187a84b0560f842d"

DEPENDS = "catkin controller_manager diff_drive_controller gazebo_ros gazebo_ros_control joint_state_controller position_controllers robot_state_publisher rqt_robot_steering rviz urdf_tutorial xacro"
SRC_URI = "https://github.com/ros-gbp/urdf_tutorial-release/archive/release/lunar/urdf_sim_tutorial/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "35b10bdf66ccb407659fb80ed8733270"
SRC_URI[sha256sum] = "9d653b337bf8b16951985181b0306fcef93c13aae00709a90d0faa1285fff965"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
