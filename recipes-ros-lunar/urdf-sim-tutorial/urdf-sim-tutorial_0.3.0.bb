# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The urdf_sim_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager diff-drive-controller gazebo-ros gazebo-ros-control joint-state-controller position-controllers robot-state-publisher rqt-robot-steering rviz urdf-tutorial xacro"
SRC_URI = "https://github.com/ros-gbp/urdf_tutorial-release/archive/release/lunar/urdf_sim_tutorial/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "35b10bdf66ccb407659fb80ed8733270"
SRC_URI[sha256sum] = "9d653b337bf8b16951985181b0306fcef93c13aae00709a90d0faa1285fff965"
S = "${WORKDIR}/urdf_tutorial-release-release-lunar-urdf_sim_tutorial-0.3.0-0"

inherit catkin
