# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An example controller manager plugin for MoveIt. This is not functional code."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_controller_manager_example/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "776395287f59b95f11900edbbea6d958"
SRC_URI[sha256sum] = "e38ad96a0497610bb4d2b9c53d83442e04a57dd52211b89d5826b373a36a4875"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_controller_manager_example-0.9.10-0"

inherit catkin
