# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The gripper_action_controller package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles catkin-native cmake-modules control-msgs control-toolbox controller-interface controller-manager hardware-interface realtime-tools roscpp trajectory-msgs urdf xacro"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/gripper_action_controller/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a6a1eec0a1949c7d8e72c3063437b68a"
SRC_URI[sha256sum] = "57c686abcee7879fcf2de6954314d418beefba66df87efeb58c258bf2e97529c"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-gripper_action_controller-0.13.2-0"

inherit catkin
