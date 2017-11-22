# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages and services for the controller manager."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/controller_manager_msgs/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "92f1fc97f0ba317ed743519ebc2c9249"
SRC_URI[sha256sum] = "58d12a6a3fed929f2fde11cc13fd34b9ef237cda35e8f90e68056d69499e9048"
S = "${WORKDIR}/ros_control-release-release-lunar-controller_manager_msgs-0.12.0-0"

inherit catkin
