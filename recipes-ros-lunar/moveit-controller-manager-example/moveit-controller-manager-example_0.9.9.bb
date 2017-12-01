# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An example controller manager plugin for MoveIt. This is not functional code."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_controller_manager_example/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "94436aa75ec8c0d3e6714d2686fc476b"
SRC_URI[sha256sum] = "134f8f78a24244c4f70c33ba27b066cf4c465256d1b873342275f63028622003"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_controller_manager_example-0.9.9-0"

inherit catkin
